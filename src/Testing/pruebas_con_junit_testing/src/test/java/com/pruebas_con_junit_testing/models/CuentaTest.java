package com.pruebas_con_junit_testing.models;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.pruebas_con_junit_testing.exceptions.DineroInsuficienteException;

// @TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CuentaTest {

    // Asignacion de datos
    private Cuenta cuenta;

    @BeforeEach
    void initMetodoTest() {
        cuenta = new Cuenta("Lizandro Narvaez", new BigDecimal("10000"));
        System.out.println("Iniciando el método @BeforeEach");
    }

    @Nested
    class MetodosBeforeAfter {

        @AfterEach
        void tearDown() {
            System.out.println("Finalizando el método @AfterEach");
        }

        @BeforeAll
        static void beforeAll() {
            System.out.println("Inicializando el método @BeforeAll");
        }

        @AfterAll
        static void afterAll() {
            System.out.println("Finalizando el método @AfterAll");
        }

    }

    // Nested anida una clase dentro de otra
    @Nested
    class TestSaldoCuenta {

        @Test
        @DisplayName("Probando el nombre de la cuenta")
        void test_nombre_cuenta(TestInfo testInfo, TestReporter testReporter) {

            // assertNotNull(cuenta, "La cuenta no está inicializada");

            System.out.println("Ejecutando: " + testInfo.getDisplayName() + "-" + testInfo.getTestMethod() + "- "
                    + testInfo.getTags() + "-" + testInfo.getTestClass());
            cuenta.setPersona("Daisy Rivera");

            // Datos esperados
            String expectativa = "Daisy Rivera";
            // Datos reales
            String realidad = cuenta.getPersona();

            // assertNotNull();
            // Compara si es igual o no
            assertEquals(expectativa, realidad, "Los nombres no son iguales");
            // Confirma si es true o false
            // assertFalse(realidad.equals(expectativa), () -> "El nombre esperado no es
            // igual al de verdad");

        }

        @Test
        @DisplayName("Testeando el saldo de la")
        void saldoCuenta() {

            // assertEquals(10000.12345, cuenta.getSaldo().doubleValue());
            assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO) < 0);
        }

    }

    @Nested
    class OperacionesCuenta {

        @Test
        void testReferenciaCuenta() {
            Cuenta cuenta2 = new Cuenta("lizandro narvaez", new BigDecimal("89999.9999"));
            // Comparar que no son iguales
            // assertNotEquals(cuenta, cuenta2);
            // compara que son iguales, devuelve false
            assertNotEquals(cuenta, cuenta2);

        }

        @Test
        @DisplayName("Probando Debito Cuenta Repetir!!!")
        // Darle valor y nombre a la repeticion
        @RepeatedTest(value = 5, name = "{displayName} - Repetición numero {currentRepetition} de {totalRepetitions}")
        // @RepeatedTest(5)
        public void testDebidoCuenta(RepetitionInfo repetitionInfo) {

            if (repetitionInfo.getCurrentRepetition() == 3) {
                System.out.println("Estamos en la repetición: " + repetitionInfo.getCurrentRepetition());
            }
            // RESTA EL MONTO
            Cuenta cuenta = new Cuenta("lizandro narvaez", new BigDecimal("1000.12345"));
            cuenta.debito(new BigDecimal("100.000"));

            assertNotNull(cuenta.getSaldo());
            assertEquals(900, cuenta.getSaldo().intValue());
            assertEquals("900.12345", cuenta.getSaldo().toPlainString());
        }

        @Test
        public void testCreditoCuenta() {

            // SUMA EL MONTO
            cuenta.credito(new BigDecimal("100"));

            assertNotNull(cuenta.getSaldo());
            assertEquals(10100, cuenta.getSaldo().intValue());
            assertEquals("10100", cuenta.getSaldo().toPlainString());
        }

        @Disabled
        @Test
        void testDineroInsuficienteExceptionCuenta() {
            Exception exception = assertThrows(DineroInsuficienteException.class, () -> {
                cuenta.debito(new BigDecimal(1500));
            });

            String actual = exception.getMessage();
            String esperado = "Dinero insuficiente";

            assertEquals(esperado, actual);
        }

        @Test
        void testTransferirDineroCuenta() {
            Cuenta cuenta1 = new Cuenta("Lizandro Narvaez", new BigDecimal(2500));
            Cuenta cuenta2 = new Cuenta("Daisy Rivera", new BigDecimal(2500));

            Banco banco = new Banco();
            banco.setNombre("Banco del Estado");
            banco.transferir(cuenta1, cuenta2, new BigDecimal(500));

            assertEquals("3000", cuenta2.getSaldo().toPlainString());
            assertEquals("2000", cuenta1.getSaldo().toPlainString());
        }

        @Test
        void testRelacionBancoCuentas() {
            Cuenta cuenta2 = new Cuenta("Daisy Rivera", new BigDecimal(2500));

            Banco banco = new Banco();
            banco.addCuenta(cuenta);
            banco.addCuenta(cuenta2);

            banco.setNombre("Banco del Estado");
            banco.transferir(cuenta, cuenta2, new BigDecimal(500));

            // JUNTAR PRUEBAS DE ERRORES
            assertAll(
                    () -> assertEquals("3000", cuenta2.getSaldo().toPlainString()),
                    () -> assertEquals("9500", cuenta.getSaldo().toPlainString()),
                    () -> assertEquals(2, banco.getCuentas().size()),
                    () -> {

                        // assertEquals("Banco del Estado", cuenta.getBanco().getNombre());
                        assertEquals("Lizandro Narvaez", banco.getCuentas()
                                .stream()
                                .filter(cuenta -> cuenta.getPersona().equals("Lizandro Narvaez"))
                                .findFirst().get().getPersona());
                    },
                    () -> assertTrue(
                            banco.getCuentas().stream().anyMatch(c -> c.getPersona().equals("Lizandro Narvaez"))),
                    () -> assertTrue(banco.getCuentas().stream().anyMatch(c -> c.getPersona().equals("Daisy Rivera"))));
        }

        @Tag("param")
        // Pasando parametros por argumentos
        @ParameterizedTest
        @ValueSource(strings = { "100", "200", "300", "500", "700", "1000.12345" })
        void testDebidoCuenta2(String monto) {
            // RESTA EL MONTO
            cuenta.debito(new BigDecimal(monto));

            assertNotNull(cuenta.getSaldo());
            assertEquals(900, cuenta.getSaldo().intValue());
            assertEquals("1000.12345", cuenta.getSaldo().toPlainString());
        }
    }

    @Nested
    class SistemaOperativoTest {

        /*
         * ESTE TEST SOLO SE VA A EJECUTAR EN UN SISTEMA OPERATIVO WINDOWS,
         * SI SE EJECUTA LO VA A IGNORAR
         */
        @Test
        @EnabledOnOs(OS.WINDOWS)
        void TestSoloParaWindows() {

        }

        /*
         * ESTE SOLO SE EJECUTARA EN LINUX
         */
        @Test
        @EnabledOnOs(OS.LINUX)
        void testSoloParaLinux() {

        }

        /*
         * ESTE TEST SE VA EJECUTAR EN TODOS LOS SISTEMAS OPERATIVOS
         * MENOS EN LO QUE DIGAMOS
         */
        @Test
        @DisabledOnOs(OS.WINDOWS)
        void testNoWindows() {

        }

    }

    @Nested
    class JavaVersion {

        /*
         * ESTE TEST NO SE VA A EJECUTAR PORQUE YO TENGO INSTALADO EN EL SISTEMA
         * JRE21, OSEA JAVA 21
         */
        @Test
        @EnabledOnJre(JRE.JAVA_8)
        void ejecutarJdk_V8() {

        }

        /*
         * ESTE TEST SE VA A EJECUTAR POR LA VERSION DE JRE ES LA 21
         */
        @Test
        @EnabledOnJre(JRE.JAVA_21)
        void ejecutarJdk_V21() {

        }

        // IMPRIME LAS PROPIEDADES DEl sistema
        @Test
        void imprimeSystemProperties() {
            Properties properties = System.getProperties();

            properties.forEach((k, v) -> System.out.println(k + ": " + v));
        }

        @Test
        @EnabledIfSystemProperty(named = "user.name", matches = "narvaez")
        void testUsername() {

        }

        @Test
        @EnabledIfSystemProperty(named = "ENV", matches = "dev")
        void testDev() {

        }

        @Test
        void testImprimirVariablesDeEntorno() {
            Map<String, String> getEnv = System.getenv();

            getEnv.forEach((k, v) -> System.out.println(k + ": " + v));
        }

    }

    @Tag("param")
    @Nested
    class PruebasParametrizadas {

        // Pasando parametros al test
        @ParameterizedTest
        @ValueSource(strings = { "racecar", "radar", "level", "reconocer" })
        void testIsPalindrome(String word) {
            assertTrue(this.isPalindrome(word));
        }

        // llamando al un método
        @ParameterizedTest
        @MethodSource("palabraProvider")
        void testIsPalindrome2(String word) {
            assertTrue(this.isPalindrome(word));
        }

        // Método auxiliar para verificar si una palabra es un palíndromo
        static List<String> palabraProvider() {
            return Arrays.asList("racecar", "radar", "level", "reconocer");
        }

        private boolean isPalindrome(String word) {
            return new StringBuilder(word).reverse().toString().equals(word);
        }

    }

    /**
     * EjemploTimeoutTest
     */
    @Nested
    class EjemploTimeoutTest {

        @Test
        @Timeout(10)
        void PruebaTimeout() throws InterruptedException {
            TimeUnit.SECONDS.sleep(10);
        }

        @Test
        void testTimeoutAssertions() {
            assertTimeout(Duration.ofSeconds(5), () -> {
                TimeUnit.SECONDS.sleep(900);
            });
        }
    }
}

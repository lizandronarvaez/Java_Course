package src.Valor_Referencia;

public class PasarPorReferencia {

    public static void test(int[] edadArray) {
        //
        System.out.println("Metodo test ejecutandose....");
        for (int edad : edadArray) {

            System.out.println("La edad de cada posicion es: " + (++edad));
        }
        System.out.println("Metodo test finalizando...");
    }

    public static void main(String[] args) {
        System.out.println("Iniciamos el metodo main");

        int edad[] = { 10, 11, 12, 13, 14, 15, 16 };
        System.out.println("Llamamos al metodo test");
        test(edad);
        System.out.println("Termina la ejecucion del metodo test");
        System.out.println("Termina el metodo main");
    }
}

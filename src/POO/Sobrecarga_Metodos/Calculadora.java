package src.POO.Sobrecarga_Metodos;

/**
 * Sobrecarga de métodos es cuando un metodo o dos puede llamarse igual pero la
 * funcionalidad es diferente
 */
public class Calculadora {

    private Calculadora() {

    }

    public static int sumar(int... args) {
        int total = 0;
        for (int i : args) {
            total += i;
        }
        return total;
    }

    public static long sumar(long a, long b) {
        return a + b;
    }

    public static float sumar(float... args) {
        float total = 0;
        for (float f : args) {
            total += f;
        }
        return total;
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static float sumar(float a, int b) {
        return a + b;
    }

    public static int sumar(String a, String b) {

        int resultado;
        try {
            resultado = Integer.parseInt(a) + Integer.parseInt(b);
        } catch (Exception e) {
            resultado = 0;
        }

        return resultado;
    }

}

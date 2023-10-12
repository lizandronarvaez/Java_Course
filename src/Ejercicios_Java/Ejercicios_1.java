package Java_Curso.src.Ejercicios_Java;

public class Ejercicios_1 {
    // NUmeros primos
    static int[] primos = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

    public static int[] getPrimos() {
        for (int i = 0; i < primos.length; i++) {

            if (primos[i] % 2 == 0) {

                System.out.println(primos[i] + " es primo");
            } else {
                System.out.println(primos[i] + " no es primo");

            }
        }
        return primos;
    }

    public static void main(String[] args) {


    }

}

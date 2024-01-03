package src.FlujosControl;

public class ForEach {
    public static void main(String[] args) {

        // Declaracion de variables
        int numeros[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        // for
        for (int num : numeros) {
            if (num % 2 == 0) {
                num = num * 2;
                System.out.println(num + " es un numero par");
            } else {
                num = num * 3;
                System.out.println(num + " es un numero impar");
            }
        }
    }
}

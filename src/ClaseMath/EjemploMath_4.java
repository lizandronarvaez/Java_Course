package Java_Curso.src.ClaseMath;

import java.util.Random;

public class EjemploMath_4 {

    public static void main(String[] args) {

        // Instancia clase random
        Random randomObjeto = new Random();
        // Genera un numero entero random
        int randomInt = 15 + randomObjeto.nextInt(25 - 15 + 1);
        // numero random long
        long randomLong = randomObjeto.nextLong();

        // Salida de datos
        System.out.println(randomInt);
        System.out.println(randomLong);
    }
}

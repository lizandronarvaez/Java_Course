package Java_Curso.src.Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class CopiarArrays {

    public static void main(String[] args) {

        int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] numeros2 = { 11, 12, 13, 14, 15, 17, 18, 19, 20 };
        int[] numerosTotal2 = IntStream.concat(Arrays.stream(numeros), Arrays.stream(numeros2)).toArray();

        for (int i : numerosTotal2) {
            System.out.println(i);
        }
    }
}

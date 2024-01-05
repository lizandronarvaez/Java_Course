package src.Collections.Set;

import java.util.*;

public class ExampleHasSetRepeat {

    public static void main(String[] args) {

        Integer numeros[] = { 1, 2, 3, 4, 5, 6, 6, 7, 1, 8, 9, 2, 10, 10 };

        Set<Integer> noRepeat = new HashSet<>();
        Set<Integer> repeat = new HashSet<>();
        for (Integer num : numeros) {
            if (!noRepeat.add(num)) {
                repeat.add(num);
            }
        }

        System.out.println("Duplicados: " + repeat);
        // RemoveAll elimina los elementos duplicados sin dejar ninguno
        noRepeat.removeAll(repeat);
        System.out.println("No duplicados: " + noRepeat);
    }
}

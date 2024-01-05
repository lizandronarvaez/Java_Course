package src.Collections.Set;

import java.util.*;

public class ExampleTreeSet {
    public static void main(String[] args) {

        // Ordena los string por orden alfabetico
        Set<String> treSet = new TreeSet<>(Comparator.reverseOrder());
        treSet.add("uno");
        treSet.add("dos");
        treSet.add("tres");
        treSet.add("cuatro");
        treSet.add("cuatro");
        treSet.add("cinco");

        System.out.println(treSet);

        Set<Integer> sIntegers = new TreeSet<>((a, b) -> b.compareTo(a));
        sIntegers.add(1);
        sIntegers.add(2);
        sIntegers.add(3);
        sIntegers.add(4);
        sIntegers.add(5);

        System.out.println(sIntegers);
    }
}

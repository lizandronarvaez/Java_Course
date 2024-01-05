package src.Collections.Set;

import java.util.*;

public class ExampleHashSet {
    public static void main(String[] args) {

        // No permite elementos duplicados y guarda los datos desordenados
        Set<String> hashSet = new HashSet<>();
        hashSet.add("uno");
        hashSet.add("dos");
        hashSet.add("tres");
        hashSet.add("cuatro");
        hashSet.add("cinco");

        System.out.println();
        System.out.println(hashSet);
    }
}

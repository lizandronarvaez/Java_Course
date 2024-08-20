package com.pruebas_con_junit_testing;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();
        nombres.add("daisy");
        nombres.add("lizandro");
        nombres.add("jean carlos");
        nombres.add("daisy rivera niña");

        try {
            List<String> nombreFiltrado = nombres.stream().sorted().toList();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Hello world!");
    }
}
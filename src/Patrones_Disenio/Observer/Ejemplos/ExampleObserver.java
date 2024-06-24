package Patrones_Disenio.Observer.Ejemplos;

import Patrones_Disenio.Observer.ExampleCompany;

public class ExampleObserver {
    public static void main(String[] args) {

        ExampleCompany company = new ExampleCompany("Google", 3000);

        company.addObserver(obs -> System.out.println("Jhon: "+obs));

        company.addObserver(obs -> System.out.println("Lizandro: " +obs));

        System.out.println(company);
    }
}

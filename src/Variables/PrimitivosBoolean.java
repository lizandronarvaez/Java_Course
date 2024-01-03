package src.Variables;

public class PrimitivosBoolean {
    public static void main(String[] args) {
        // Verificar mayoria de edad
        boolean mayorEdad = true;
        int edad = 19;
        mayorEdad = edad >= 18;

        if (mayorEdad) {
            System.out.println("Eres mayor de edad!");
            return;
        }
        System.out.println("");
        System.out.println("No eres mayor de edad");
        System.out.println("");

        // Verificar si dos numeros son iguales
        boolean isEqual = (3-1 == 1);
        if(isEqual){
            System.out.println("Los numeros son iguales");
            return;
        }
        System.out.println("Los numeros son diferentes");
    }
}

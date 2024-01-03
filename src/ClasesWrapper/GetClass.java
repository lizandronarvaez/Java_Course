package src.ClasesWrapper;

import java.lang.reflect.Method;

public class GetClass {

    public static void main(String[] args) {
        String nombre = "Lizandro";
        Integer edad = 29;
        Class stringClass = nombre.getClass();
        Class intClass = edad.getClass();

        // SOut
        System.out.println("Nombre de su clase:\n\n" + stringClass.getName());
        System.out.println(stringClass.getSimpleName());
        System.out.println(stringClass.getPackageName());
        System.out.println(stringClass.getMethods());
        for (Method metodo : stringClass.getMethods()) {
            System.out.println(metodo.getName());
        }

        System.out.println("");
        System.out.println(intClass);
        System.out.println("Clase padre de Integer: " + intClass.getSuperclass());
        System.out.println("Clase padre de Number: " + intClass.getSuperclass().getSuperclass());
        System.out.println("");
        for (Method method : intClass.getMethods()) {
            System.out.println(method.getName());
        }
        //
        System.out.println("");
    }
}

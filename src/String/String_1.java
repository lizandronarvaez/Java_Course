package src.String;

public class String_1 {
    /*
     * Para comparar un string con otro string se utilizar el metodo equals
     * 
     * equalsIgnoreCase() : compara la cadena sin contar si tiene mayusculas o
     * minusculas
     * 
     * trim(): Elimina los espacios en blanco al principio y al final
     * 
     * charAt() : Devuelve el caracter que buscamos
     * 
     * 
     */
    public static void main(String[] args) {

        // Crear string de forma directa
        String variable = "Curso Java";

        // Crear String con constructor
        String variable2 = new String("Curso Java");

        // comparar los textos siempre con el metodo equals
        boolean comparar = variable.equalsIgnoreCase(variable2);
        
        // Sout
        System.out.println(variable);
        System.out.println(variable2);
        System.out.println("Son iguales las dos cadenas? " + comparar);
    }
}

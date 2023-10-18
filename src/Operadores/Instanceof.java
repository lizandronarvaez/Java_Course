package Java_Curso.src.Operadores;

public class Instanceof {
    public static void main(String[] args) {

        // Declaracion de variables
        String mensaje = "Creando un objeto tipo String";
        Integer numero = 29;

        // Miramos el valor
        boolean m1 = mensaje instanceof String;
        boolean m2 = mensaje instanceof Object;
        boolean n1 = numero instanceof Integer;
        boolean n2 = numero instanceof Object;
        boolean n3= numero instanceof Number; 
        
        // Sout
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }
}

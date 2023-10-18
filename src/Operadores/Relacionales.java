package Java_Curso.src.Operadores;

public class Relacionales {
    public static void main(String[] args) {

        int i = 3;
        byte j = 3;
        double f = 1.273E-2;
        boolean m = false;

        // comparando los valores
        boolean b1 = i == j;
        boolean b2 = !b1;
        boolean b3 = i != j;
        // sout
        System.out.println("Es igual? " + b1);
        System.out.println("Es falso? " + b2);
        System.out.println(b3);
    }
}

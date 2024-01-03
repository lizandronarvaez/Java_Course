package src.Operadores;


public class Incrementales {
    public static void main(String[] args) {
        int i = 4;
        int j = i;

        // pre incremento
        j = ++i;
        // post increment
        j = i++;

        // Pre decremento
        i= 3;
        j=--i;

        // post decremento
        i=10;
        j=i--;
        //sout
        System.out.println(i);
        System.out.println(j);
    }
}

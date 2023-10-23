package Java_Curso.src.Valor_Referencia;

public class PasarPorValor {

    public static void test(int i) {
        System.out.println("Iniciamos el metodo test con i = " + i);
        i = 1993;
        System.out.println("La variable i ha su valor a " + i);
    }

    public static void main(String[] args) {

        int numero = 10;
        System.out.println("Iniciamos el metodo main con " + numero);
        test(numero);
    }

}

package Java_Curso.src.Ejercicios_Java;

public class Ejercicios_5 {

    public static char obtenerLetraDNI(int numerosDni) {
        char[] letrasDni = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
                'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };
        return letrasDni[numerosDni % 23];
    }

    public static void main(String[] args) {
        System.out.println(obtenerLetraDNI(5718049));
    }
}

package Java_Curso.src.ClaseMath;

public class EjemploMath_2 {

    public static void main(String[] args) {

        // Expnentes clases math
        double exponente = Math.exp(2);

        // Logarimo natural
        double log = Math.log(10);

        // Pontencia
        double potencia = Math.pow(3, 2);

        // Raiz cuadrada
        double raizCuadrada = Math.round(Math.sqrt(20));

        // convertir de grados a radianes
        double grados = Math.round(Math.toDegrees(1.57));

        // Convertir de radianes a grados
        double radianes = Math.round(Math.toRadians(90.00));

        // Seno
        double seno = Math.round(Math.sin(radianes));

        // Coseno
        double coseno = Math.round(Math.cos(radianes));
        
        // Salida de datos
        System.out.println(exponente);
        System.out.println(log);
        System.out.println(potencia);
        System.out.println(raizCuadrada);
        System.out.println(grados);
        System.out.println(radianes);
        System.out.println("Seno de 90 es: " + seno);
        System.out.println("El coseno de 90 es: " + coseno);
    }
}

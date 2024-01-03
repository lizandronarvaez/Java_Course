package src.ClaseMath;

public class EjemploMath_3 {
    public static void main(String[] args) {

        // Generar un numero aleatorio
        // Math.random se multiplica por el numero que queremos multiplica y hasta que
        // numero queremos multiplicar
        int numeroAleatorio = (int) Math.round(Math.random() * 10);

        String colores[] = { "azul", "blanco", "rojo", "verde", "amarillo", "negro", "naranja" };
        double numeroColor = (int) Math.round(Math.random() * colores.length);

        // if (numeroAleatorio == 10) {

        // System.out.println("Haz acertado el numero en el intento " );
        // return;
        // } else {
        // System.out.println("Sigue intentandolo");
        // }
        
        // Salida de datos
        System.out.println("Numero aletorio: " + numeroAleatorio);
        System.out.println(colores[(int) numeroColor]);
    }
}

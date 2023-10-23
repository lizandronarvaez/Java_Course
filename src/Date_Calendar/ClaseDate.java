package Java_Curso.src.Date_Calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClaseDate {

    public static void main(String[] args) {

        Date fecha = new Date();

        // Modificar la fecha
        SimpleDateFormat diffFecha = new SimpleDateFormat("EEEE dd 'de' MMMM 'del' yyyy");
        String fechaString = diffFecha.format(fecha);

        //
        Long j = 0L;
        for (int i = 0; i < 100; i++) {
            j += i;
        }

        // Calcular el tiempo con getTime()
        Date date = new Date();
        long calcularTiempo = date.getTime() - fecha.getTime();
        // Salida de datos
        System.out.println(calcularTiempo + " milisegundos en realizar el ciclo for");
        System.out.println("EL valor de j es : " + j);
        System.out.println("La fecha de hoy: " + fecha);
        System.out.println("Nuevo formato de fecha: " + fechaString);

    }
}

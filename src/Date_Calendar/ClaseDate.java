package src.Date_Calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClaseDate {

    public static void main(String[] args) throws ParseException {

        Date fecha = new Date();
        String fechaNacimiento = "24-12-1993";
        Date calculaEdad;
        // FOrmatea la fecha
        SimpleDateFormat diffFecha = new SimpleDateFormat("dd-MM-yyyy");
        calculaEdad = diffFecha.parse(fechaNacimiento);

        // formateas las fechas al formato que quieres
        diffFecha = new SimpleDateFormat("ddMMyyyy");
        // obtienes la fecha en el forma que haz establecido
        String fechaString = diffFecha.format(fecha);
        String fecha2 = diffFecha.format(calculaEdad);
        int edad1=Integer.parseInt(fechaString);
        int edad2=Integer.parseInt(fecha2);
        System.out.println(edad1);
        System.out.println(edad2);
        //
        // Long j = 0L;
        // for (int i = 0; i < 100; i++) {
        // j += i;
        // }

        // // Calcular el tiempo con getTime()
        // Date date = new Date();
        // long calcularTiempo = date.getTime() - fecha.getTime();
        // // Salida de datos
        // System.out.println(calcularTiempo + " milisegundos en realizar el ciclo
        // for");
        // System.out.println("EL valor de j es : " + j);
        // System.out.println("La fecha de hoy: " + fecha);
        // System.out.println("Nuevo formato de fecha: " + fechaString);

    }
}

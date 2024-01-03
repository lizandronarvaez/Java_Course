package src.Date_Calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ClaseCalendar {

    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();

        // primera forma de agregar una fecha
        // calendario.set(2023, Calendar.OCTOBER, 24);
        // mostrar fecha a traves del constructor Date y calendar

        // segunda forma de agregar una fecha
        calendario.set(Calendar.DAY_OF_YEAR, 2023);
        calendario.set(Calendar.MONTH, 9);
        calendario.set(Calendar.DAY_OF_WEEK, 24);
        calendario.set(Calendar.HOUR_OF_DAY, 13);
        calendario.set(Calendar.MINUTE, 47);
        calendario.set(Calendar.SECOND, 10);

        // Un formato
        Date fechaSinFormato = calendario.getTime();

        // Otro formato
        SimpleDateFormat conFormato = new SimpleDateFormat("'Hoy es: 'EEEE dd MMMM 'de' yyyy '|| Son las: 'HH:mm:ss");
        String fechaConFormato = conFormato.format(fechaSinFormato);
        // salida de datos
        System.out.println("Fecha sin formato: " + fechaSinFormato);
        System.out.println("Fecha con formato: " + fechaConFormato);
    }
}

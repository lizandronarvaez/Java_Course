package src.Date_Calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class JavaUtilDateParse {

    public static void compararFecha() {

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Introduce una fecha con formato 'dd-MM-yyy': ");
        try {
            // Convertir una fecha string a objecto
            Date fecha = format.parse(scanner.nextLine());
            scanner.close();
            System.out.println(fecha);
            // Formato normal
            // System.out.println(format.format(fecha));

            // comparar una fecha
            Date fecha2 = new Date();

            if (fecha.after(fecha2)) {
                System.out.println("Fecha del usuario es despues que fecha2");
                return;
            }
            if (fecha.before(fecha2)) {
                System.out.println("Fecha es anterior que fecha2");
                return;
            }

            if (fecha.equals(fecha2)) {
                System.out.println("Fecha es igual a fecha2");
                return;
            }
        } catch (ParseException e) {

            e.printStackTrace();
        }
    }
}

package Tareas.Encontrar_Vuelo;

import java.text.*;
import java.util.*;
import Tareas.Encontrar_Vuelo.Models.Vuelo;

public class Vuelos {
    public static void main(String[] args) throws ParseException {

        // Formatear fechas
        DateFormat fechas = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        SimpleDateFormat df = new SimpleDateFormat("EEEE dd 'de' MMMM, yyyy 'a las' hh:mm");
        List<Vuelo> listaVuelos = new ArrayList<>();

        listaVuelos.add(new Vuelo("AAL 933", "New York", "Santiago", fechas.parse("2021-08-29 05:39"), 62));
        listaVuelos.add(new Vuelo("LAT 755", "Sao Paulo", "Santiago", fechas.parse("2021-08-31 04:45"), 47));
        listaVuelos.add(new Vuelo("SKU 621", "Rio De Janeiro", "Santiago", fechas.parse("2021-08-30 16:00"), 52));
        listaVuelos.add(new Vuelo("DAL 147", "Atlanta", "Santiago", fechas.parse("2021-08-29 13:22"), 59));
        listaVuelos.add(new Vuelo("AVA 241", "Bogota", "Santiago", fechas.parse("2021-08-31 14:05"), 25));
        listaVuelos.add(new Vuelo("AMX 10", "Mexico City", "Santiago", fechas.parse("2021-08-31 05:20"), 29));
        listaVuelos.add(new Vuelo("IBE 6833", "Londres", "Santiago", fechas.parse("2021-08-30 08:45"), 55));
        listaVuelos.add(new Vuelo("LAT 2479", "Frankfurt", "Santiago", fechas.parse("2021-08-29 07:41"), 51));
        listaVuelos.add(new Vuelo("SKU 803", "Lima", "Santiago", fechas.parse("2021-08-30 10:35"), 48));
        listaVuelos.add(new Vuelo("LAT 533", "Los Ángeles", "Santiago", fechas.parse("2021-08-29 09:14"), 59));
        listaVuelos.add(new Vuelo("LAT 1447", "Guayaquil", "Santiago", fechas.parse("2021-08-31 08:33"), 31));
        listaVuelos.add(new Vuelo("CMP 111", "Panama City", "Santiago", fechas.parse("2021-08-31 15:15"), 29));
        listaVuelos.add(new Vuelo("LAT 705", "Madrid", "Santiago", fechas.parse("2021-08-30 08:14"), 47));
        listaVuelos.add(new Vuelo("AAL 957", "Miami", "Santiago", fechas.parse("2021-08-29 22:53"), 60));
        listaVuelos.add(new Vuelo("ARG 5091", "Buenos Aires", "Santiago", fechas.parse("2021-08-31 09:57"), 32));
        listaVuelos.add(new Vuelo("LAT 1283", "Cancún", "Santiago", fechas.parse("2021-08-31 04:00"), 35));
        listaVuelos.add(new Vuelo("LAT 579", "Barcelona", "Santiago", fechas.parse("2021-08-29 07:45"), 61));
        listaVuelos.add(new Vuelo("AAL 945", "Dallas-Fort Worth", "Santiago", fechas.parse("2021-08-30 07:12"), 58));
        listaVuelos.add(new Vuelo("LAT 501", "París", "Santiago", fechas.parse("2021-08-29 18:29"), 49));
        listaVuelos.add(new Vuelo("LAT 405", "Montevideo", "Santiago", fechas.parse("2021-08-30 15:45"), 39));

        // Imprimir todos los vuelos
        listaVuelos.forEach(vuelo -> {
            System.out.println();
            System.out.println(vuelo);
        });
        // ordena los vuelos por hora de llegada de forma ascendente
        listaVuelos.sort((a, b) -> a.getFechaHoraLlegada().compareTo(b.getFechaHoraLlegada()));

        // BUsca el ultimo vuelo
        Vuelo ultimoVuelo = listaVuelos.get(listaVuelos.size() - 1);
        System.out.println();
        System.out.println("El ultimo vuelo en llegar es: " + ultimoVuelo.getNombre() + " sale de "
                + ultimoVuelo.getOrigen().toUpperCase() + " y aterriza en " + ultimoVuelo.getDestino().toUpperCase()
                + " en la fecha " + df.format(ultimoVuelo.getFechaHoraLlegada()));

        // Busca el vuelo con menos pasajeros
        listaVuelos.sort((a, b) -> a.getPasajeros().compareTo(b.getPasajeros()));
        Vuelo vueloMenorPasajero = listaVuelos.get(listaVuelos.size() - 1);
        System.out.println();
        System.out.println("El vuelo con procedencia de " + vueloMenorPasajero.getOrigen()
                + " es el que transporta menos pasajeros con un total de : " + vueloMenorPasajero.getPasajeros());
    }
}

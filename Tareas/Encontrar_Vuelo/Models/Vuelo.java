package Tareas.Encontrar_Vuelo.Models;

import java.util.Date;

public class Vuelo {

    private String nombre;
    private String origen;
    private String destino;
    private Date fechaHoraLlegada;
    private Integer pasajeros;

    public Vuelo(String nombre, String origen, String destino, Date fechaHoraLlegada, Integer pasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fechaHoraLlegada = fechaHoraLlegada;
        this.pasajeros = pasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public Date getFechaHoraLlegada() {
        return fechaHoraLlegada;
    }

    public Integer getPasajeros() {
        return pasajeros;
    }

    @Override
    public String toString() {
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("Vuelo: ").append(nombre)
                .append("\nOrigen: ").append(origen)
                .append("\nDestino: ").append(destino)
                .append("\nFecha Llegada: ").append(fechaHoraLlegada)
                .append("\nNº Pasajeros: ").append(pasajeros);

        return sBuilder.toString();
    }

}

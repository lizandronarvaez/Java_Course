package src.POO.Clases;

public class Deposito {
    private int capacidad;

    // contructor con el valor inicializado
    public Deposito() {
        this.capacidad = 65;
    }

    // contructor para asignar valor
    public Deposito(int capacidad) {
        this.capacidad = capacidad;
    }

    // getter para leer el valor
    public int getCapacidad() {
        return capacidad;
    }
}

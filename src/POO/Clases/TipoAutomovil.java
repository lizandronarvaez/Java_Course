package src.POO.Clases;

public enum TipoAutomovil {

    COMPACTO("Compacto", "Compacto", 4, true),
    BERLINA("Berlina", "Familiar", 5, false),
    DEPORTIVO("Deportivo", "Auto_Deportivo", 3, true),
    SUV("Suv", "Auto_Familiar", 5, true),
    TODO_TERRENO("Todoterreno", "4x4", 5, true),
    FURGON("Furgoneta", "Uso Profesional", 2, false);

    private final String nombre;
    private final String descripcion;
    private final int puertas;

    private final boolean reprogramacion;

    private TipoAutomovil(String nombre, String descripcion, int puertas, boolean reprogramacion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.puertas = puertas;
        this.reprogramacion = reprogramacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPuertas() {
        return puertas;
    }

    public boolean isReprogramacion() {
        return reprogramacion;
    }

}

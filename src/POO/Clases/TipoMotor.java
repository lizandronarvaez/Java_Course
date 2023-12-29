package src.POO.Clases;

public enum TipoMotor {
    // LOS ENUM SIEMPRE EN MAYUSCULA
    DIESEL("Diesel"),
    GASOLINA("Gasolina"),
    ELECTRICO("Eléctrico");

    private String combustible;

    private TipoMotor(String combustible) {
        this.combustible = combustible;
    }

    public String getCombustible() {
        return combustible;
    }

}

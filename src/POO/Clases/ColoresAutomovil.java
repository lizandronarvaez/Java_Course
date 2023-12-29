package src.POO.Clases;

public enum ColoresAutomovil {

    ROJO("Rojo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    GRIS("Gris");

    private final String color;

    private ColoresAutomovil(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {

        return this.color;
    }

}

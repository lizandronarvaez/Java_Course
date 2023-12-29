package src.POO.Clases;

public class Rueda {
// Si creas un contrusctor con parametros ya no hace falta los seter se asinacion en la implementacion los datos
    private String fabricante;
    private int radio;
    private int ancho;

    public Rueda(String fabricante, int radio, int ancho) {
        this.fabricante = fabricante;
        this.radio = radio;
        this.ancho = ancho;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getRadio() {
        return radio;
    }

    public int getAncho() {
        return ancho;
    }
}

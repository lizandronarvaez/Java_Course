package src.POO.Interfaces.EjemploImprenta.models.Hojas;

public abstract class Hoja {

    protected String contenido;

    public Hoja(String contenido) {
        this.contenido = contenido;
    }

    abstract public String imprimir();
}

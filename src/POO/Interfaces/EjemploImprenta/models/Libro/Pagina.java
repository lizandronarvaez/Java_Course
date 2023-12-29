package src.POO.Interfaces.EjemploImprenta.models.Libro;

import src.POO.Interfaces.EjemploImprenta.interfaces.Imprimible;
import src.POO.Interfaces.EjemploImprenta.models.Hojas.Hoja;

public class Pagina extends Hoja implements Imprimible {

    public Pagina(String contenido) {
        super(contenido);
    }

    @Override
    public String imprimir() {
        return this.contenido;
    }

}

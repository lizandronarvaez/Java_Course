package Patrones_Disenio.Decorator.Decorador;

import Patrones_Disenio.Decorator.Formateable;

public class ReemplazarEspacio extends TextoDecorador {

    public ReemplazarEspacio(Formateable texto) {
        super(texto);

    }

    @Override
    public String darFormato() {
        return texto.darFormato().replaceAll(" ", "");
    }

}

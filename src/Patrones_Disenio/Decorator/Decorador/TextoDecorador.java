package Patrones_Disenio.Decorator.Decorador;

import Patrones_Disenio.Decorator.Formateable;

public abstract class TextoDecorador implements Formateable {

    protected Formateable texto;

    public TextoDecorador(Formateable texto) {
        this.texto = texto;
    }

}

package Patrones_Disenio.Decorator_2.Decorador;

import Patrones_Disenio.Decorator_2.Configurable;

public abstract class CaféDecorador implements Configurable {

    protected Configurable cafe;

    public CaféDecorador(Configurable cafe) {
        this.cafe = cafe;
    }

}

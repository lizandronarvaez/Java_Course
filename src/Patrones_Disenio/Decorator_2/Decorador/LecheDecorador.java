package Patrones_Disenio.Decorator_2.Decorador;

import Patrones_Disenio.Decorator_2.Configurable;

public class LecheDecorador extends CaféDecorador {

    public LecheDecorador(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecioBase() {
        return cafe.getPrecioBase() + 3.7f;
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes() + ", Leche";
    }

}

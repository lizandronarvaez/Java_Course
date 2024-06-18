package Patrones_Disenio.Decorator_2.Decorador;

import Patrones_Disenio.Decorator_2.Configurable;

public class CremaDecorador extends CaféDecorador {

    public CremaDecorador(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecioBase() {
        return cafe.getPrecioBase() + 2.5f;
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes() + ", Crema";
    }

}

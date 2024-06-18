package Patrones_Disenio.Decorator_2.Decorador;

import Patrones_Disenio.Decorator_2.Configurable;

public class ChocolateDecorador extends CaféDecorador {

    public ChocolateDecorador(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecioBase() {
        return cafe.getPrecioBase() + 5f;
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes() + ", Chocolate";
    }

}

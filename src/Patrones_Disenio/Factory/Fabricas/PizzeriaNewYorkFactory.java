package Patrones_Disenio.Factory.Fabricas;

import Patrones_Disenio.Factory.PizzaProducto;
import Patrones_Disenio.Factory.Producto.PizzaNewYorkPeperoni;
import Patrones_Disenio.Factory.Producto.PizzaNewYorkVegetariana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory {

    @Override
    PizzaProducto crearPizza(String tipo) {
        PizzaProducto pizzaProducto=null;

        switch (tipo) {
            case "vegetariana":
                pizzaProducto = new PizzaNewYorkVegetariana();
                break;
            case "peperoni":
                pizzaProducto = new PizzaNewYorkPeperoni();
            default:
                pizzaProducto = null;
                break;
        }

        return pizzaProducto;
    }

}

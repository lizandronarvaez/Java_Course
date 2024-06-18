package Patrones_Disenio.Factory.Fabricas;

import Patrones_Disenio.Factory.PizzaProducto;
import Patrones_Disenio.Factory.Producto.PizzaCaliforniaVegetariana;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory {

    @Override
    PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto=null;
        switch (tipo) {
            case "vegetariana":
                producto= new PizzaCaliforniaVegetariana();
                break;
            default:
                producto=null;
                break;
        }

        return producto;
    }

}

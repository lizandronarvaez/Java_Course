package Patrones_Disenio.Factory;

import Patrones_Disenio.Factory.Fabricas.PizzeriaCaliforniaFactory;
import Patrones_Disenio.Factory.Fabricas.PizzeriaNewYorkFactory;
import Patrones_Disenio.Factory.Fabricas.PizzeriaZonaAbstractFactory;

public class ExamplePizzaFactory {
    public static void main(String[] args) {

        PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstractFactory california = new PizzeriaCaliforniaFactory();

        try {

            PizzaProducto pizzaProducto = california.ordenarPizza("vegetariana");
            System.out.println("Haz ordenado la pizza: " + pizzaProducto.getNombre());

            pizzaProducto = ny.ordenarPizza("peperoni");
            System.out.println("Otra persona ordenó la pizza: " + pizzaProducto.getNombre());
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

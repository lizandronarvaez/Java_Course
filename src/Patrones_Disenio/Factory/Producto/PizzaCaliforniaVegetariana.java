package Patrones_Disenio.Factory.Producto;

import Patrones_Disenio.Factory.PizzaProducto;

public class PizzaCaliforniaVegetariana extends PizzaProducto {

    public PizzaCaliforniaVegetariana() {
        super();
        nombre = "Pizza California Vegetariana";
        masa="Masa delgada Ligth";
        salsa="Salsa BBQ Ligth";
        ingredientes.add("Queso mozzarela");
        ingredientes.add("Cebolla");
        ingredientes.add("Espinacas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 20 min a 150ºC");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en partes iguales");
    }

}

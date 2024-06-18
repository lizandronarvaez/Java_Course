package Patrones_Disenio.Factory.Producto;

import Patrones_Disenio.Factory.PizzaProducto;

public class PizzaNewYorkVegetariana extends PizzaProducto {

    public PizzaNewYorkVegetariana() {
        super();
        nombre = "Pizza vegetariana New York";
        masa="Masa integral vegana";
        salsa="Salsa de tomate";
        ingredientes.add("Queso vegano");
        ingredientes.add("Tomate");
        ingredientes.add("Aceitunas");
        ingredientes.add("Espicanas");
        ingredientes.add("Piña");

    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando la pizza a 25 min por 150º");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en 8 partes");
    }

}

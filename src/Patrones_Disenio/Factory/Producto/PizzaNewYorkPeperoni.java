package Patrones_Disenio.Factory.Producto;

import Patrones_Disenio.Factory.PizzaProducto;

public class PizzaNewYorkPeperoni extends PizzaProducto {

    public PizzaNewYorkPeperoni(){
        super();
        nombre="Pizza peperoni New York";
        salsa="Salsa tomate";
        masa="Masa delgada a la piedra";
        ingredientes.add("Queso mozzarella");
        ingredientes.add("Extra peperoni");
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

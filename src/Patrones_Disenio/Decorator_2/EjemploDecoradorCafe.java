package Patrones_Disenio.Decorator_2;

import Patrones_Disenio.Decorator_2.Decorador.ChocolateDecorador;
import Patrones_Disenio.Decorator_2.Decorador.CremaDecorador;
import Patrones_Disenio.Decorator_2.Decorador.LecheDecorador;

public class EjemploDecoradorCafe {
    public static void main(String[] args) {

        Configurable cafe = new Cafe(3, "Cafe Mocha");
        CremaDecorador conCrema = new CremaDecorador(cafe);
        LecheDecorador conLeche = new LecheDecorador(conCrema);
        ChocolateDecorador conChocolate = new ChocolateDecorador(conLeche);

        System.out.println();
        System.out.println("EL precio del cafe mocha es: " + conChocolate.getPrecioBase()+ "€");
        System.out.println("Los ingredientes: " + conChocolate.getIngredientes());
    }
}

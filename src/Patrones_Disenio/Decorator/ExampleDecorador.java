package Patrones_Disenio.Decorator;

import Patrones_Disenio.Decorator.Decorador.MayusculaDecorador;
import Patrones_Disenio.Decorator.Decorador.ReemplazarEspacio;
import Patrones_Disenio.Decorator.Decorador.ReversaDecorador;

public class ExampleDecorador {
    public static void main(String[] args) {

        Formateable texto = new Texto("Hola que tal Lizandro!");

        MayusculaDecorador mayuscula = new MayusculaDecorador(texto);
        ReversaDecorador reversaDecorador = new ReversaDecorador(mayuscula);
        ReemplazarEspacio reemplazarEspacio= new ReemplazarEspacio(texto);

        System.out.println("*****Texto en mayuscula*****");
        System.out.println(mayuscula.darFormato());

        System.out.println();
        System.out.println("*****Texto en reversa****");
        System.out.println(reversaDecorador.darFormato());

        System.out.println();
        System.out.println("*****Texto sin espacio*****");
        System.out.println(reemplazarEspacio.darFormato());
    }
}

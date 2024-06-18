package Patrones_Disenio.Decorator.Decorador;

import Patrones_Disenio.Decorator.Formateable;

public class ReversaDecorador extends TextoDecorador{

    public ReversaDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        StringBuilder sb=new StringBuilder(texto.darFormato());
        return sb.reverse().toString();
    }
    
}

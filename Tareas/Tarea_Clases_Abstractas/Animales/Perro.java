package Tareas.Tarea_Clases_Abstractas.Animales;

import Tareas.Tarea_Clases_Abstractas.TiposAnimales.Canino;

public class Perro extends Canino{

    // Atributos
    private int fuerzaMordida;

    public int getFuerzaMordida() {
        return fuerzaMordida;
    }

    // Metodos heredados
    @Override
    public String comer() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'comer'");
    }

    @Override
    public String dormir() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dormir'");
    }

    @Override
    public String correr() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'correr'");
    }

    @Override
    public String comunicarse() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'comunicarse'");
    }
    
}

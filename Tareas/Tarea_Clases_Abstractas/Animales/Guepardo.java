package src.Tareas.Tarea_Clases_Abstractas.Animales;

import src.Tareas.Tarea_Clases_Abstractas.TiposAnimales.Felino;

public class Guepardo extends Felino {

    public Guepardo() {

    }

    public Guepardo(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanioGarras,
            int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanioGarras, velocidad);
    }

    // metodos heredados
    @Override
    public String comer() {
        return "Guepardo comiendo animales";
    }

    @Override
    public String dormir() {
        return "Metodo dormir";
    }

    @Override
    public String correr() {
        return "El guepardo corre a " + this.velocidad + " km/h";
    }

    @Override
    public String comunicarse() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'comunicarse'");
    }

}

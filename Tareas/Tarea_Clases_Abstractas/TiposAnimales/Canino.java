package Tareas.Tarea_Clases_Abstractas.TiposAnimales;

import Tareas.Tarea_Clases_Abstractas.Mamifero;

abstract public class Canino extends Mamifero {

    // atributos
    protected String color;
    protected float tamanioColmillos;

    // Contructores
    public Canino() {

    }

    public Canino(String habitat, float altura, float largo, float peso, String nombreCientifico, String color,
            float tamanioColmillos) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamanioColmillos = tamanioColmillos;
    }

    // metodos getters y setter
    public String getColor() {
        return color;
    }

    public float getTamanioColmillos() {
        return tamanioColmillos;
    }
}

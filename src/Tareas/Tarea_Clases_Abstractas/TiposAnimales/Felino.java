package src.Tareas.Tarea_Clases_Abstractas.TiposAnimales;

import src.Tareas.Tarea_Clases_Abstractas.Mamifero;

abstract public class Felino extends Mamifero {

    // atributos
    protected float tamanioGarras;
    protected int velocidad;

    // contructores
    public Felino() {
    }

    public Felino(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanioGarras,
            int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamanioGarras = tamanioGarras;
        this.velocidad = velocidad;
    }

    // Metodos getter
    public float getTamanioGarras() {
        return tamanioGarras;
    }

    public void setTamanioGarras(float tamanioGarras) {
        this.tamanioGarras = tamanioGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

}

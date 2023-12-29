package src.Tareas.Tarea_Clases_Abstractas.Animales;

import src.Tareas.Tarea_Clases_Abstractas.TiposAnimales.Felino;

public class Leon extends Felino {
    // atributos
    private int numeroManada;
    private float potenciaRugidoDecibel;

    public Leon() {

    }

    public Leon(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanioGarras,
            int velocidad, int numeroManada, float potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanioGarras, velocidad);
        this.numeroManada = numeroManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    // Metodos herededados
    @Override
    public String comer() {
        return "El León come animales de la selva";
    }

    @Override
    public String dormir() {
        return "El leon duerme mucho tiempo en el dia";
    }

    @Override
    public String correr() {
        return "El leon corre junto a " + this.numeroManada + " leones mas";
    }

    @Override
    public String comunicarse() {
        return "El ruido del leon alcanza " + this.potenciaRugidoDecibel + " decibelios";
    }

    // getters
    public int getNumeroManada() {
        return numeroManada;
    }

    public void setNumeroManada(int numeroManada) {
        this.numeroManada = numeroManada;
    }

    public float getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    public void setPotenciaRugidoDecibel(float potenciaRugidoDecibel) {
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }
}

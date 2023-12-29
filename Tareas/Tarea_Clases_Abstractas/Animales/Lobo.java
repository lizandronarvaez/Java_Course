package src.Tareas.Tarea_Clases_Abstractas.Animales;

import src.Tareas.Tarea_Clases_Abstractas.TiposAnimales.Canino;

public class Lobo extends Canino {

    private int numeroCamadas;
    private String especieLobo;

    public Lobo() {
    }

    public Lobo(String habitat, float altura, float largo, float peso, String nombreCientifico, String color,
            float tamanioColmillos, int numeroCamadas, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanioColmillos);
        this.numeroCamadas = numeroCamadas;
        this.especieLobo = especieLobo;
    }

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

    // getters

    public int getNumeroCamadas() {
        return numeroCamadas;
    }

    public void setNumeroCamadas(int numeroCamadas) {
        this.numeroCamadas = numeroCamadas;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    public void setEspecieLobo(String especieLobo) {
        this.especieLobo = especieLobo;
    }

}

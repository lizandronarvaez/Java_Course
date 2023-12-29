package src.Tareas.Tarea_Clases_Abstractas.Animales;

import src.Tareas.Tarea_Clases_Abstractas.Mamifero;

public class Tigre extends Mamifero {
    // Atributos
    private String especie;

    public String getEspecie() {
        return especie;
    }

    // METODOS HEREDADOS
    @Override
    public String comer() {
        return "Come cualquier cosa";
    }

    @Override
    public String dormir() {
        return "No duerme mucho porque esta alerta siempre";
    }

    @Override
    public String correr() {
        return "Corre rapido";
    }

    @Override
    public String comunicarse() {
        return "Se comunica con los demas animales...";
    }

}

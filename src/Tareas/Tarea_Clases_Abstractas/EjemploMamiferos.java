package src.Tareas.Tarea_Clases_Abstractas;

import java.util.ArrayList;
import java.util.List;

import src.Tareas.Tarea_Clases_Abstractas.Animales.Guepardo;
import src.Tareas.Tarea_Clases_Abstractas.Animales.Leon;
import src.Tareas.Tarea_Clases_Abstractas.Animales.Lobo;
import src.Tareas.Tarea_Clases_Abstractas.Animales.Perro;
import src.Tareas.Tarea_Clases_Abstractas.Animales.Tigre;
import src.Tareas.Tarea_Clases_Abstractas.TiposAnimales.Canino;
import src.Tareas.Tarea_Clases_Abstractas.TiposAnimales.Felino;

public class EjemploMamiferos {
    public static void main(String[] args) {

        List<Mamifero> mamiferos = new ArrayList<>();
        mamiferos.add(new Leon("Sur africa", 120f, 190f, 220f, "Panthera leo", 7.5f, 58, 5, 120f));
        mamiferos.add(new Guepardo("Africa", 72f, 94f, 140f, "Guepardo", 4.9f, 130));

        for (Mamifero mamifero : mamiferos) {
            System.out.println("===========****===============");
            System.out.println(mamifero.getClass().getSimpleName());
            System.out.println("Mamifero: " + mamifero.getNombreCientifico());
            System.out.println("Habitat: " + mamifero.getHabitat());
            System.out.println("Altura: " + mamifero.getAltura());
            System.out.println("Peso: " + mamifero.getPeso());

            // iNSTANCIAS DE LA CLASE CANINO
            if (mamifero instanceof Canino) {
                System.out.println("Colmillos: " + ((Canino) mamifero).getTamanioColmillos());
                System.out.println("Color: " + ((Canino) mamifero).getColor());

                if (mamifero instanceof Lobo) {
                    System.out.println("Especie lobo: " + ((Lobo) mamifero).getEspecieLobo());
                    System.out.println("Numero integrantes: " + ((Lobo) mamifero).getNumeroCamadas());
                }
                if (mamifero instanceof Perro) {
                    System.out.println("Fuerza mordida: " + ((Perro) mamifero).getFuerzaMordida());
                }

            }

            // INSTANCIAS DE LA CLASE FELINO
            if (mamifero instanceof Felino) {

                System.out.println("Tamaño garras: " + ((Felino) mamifero).getTamanioGarras());
                System.out.println("Velocidad: " + ((Felino) mamifero).getVelocidad());

                // INstancia de cada clase
                if (mamifero instanceof Leon) {
                    System.out.println("Potencia Rugido: " + ((Leon) mamifero).getPotenciaRugidoDecibel());
                    System.out.println("Numero de integrantes: " + ((Leon) mamifero).getNumeroManada());
                }

                if (mamifero instanceof Tigre) {
                    System.out.println("Especie tigre: " + ((Tigre) mamifero).getEspecie());
                }
            }

            // Metodos globales
            System.out.println(mamifero.comer());
            System.out.println(mamifero.comunicarse());
            System.out.println(mamifero.correr());
            System.out.println(mamifero.dormir());
        }
    }
}

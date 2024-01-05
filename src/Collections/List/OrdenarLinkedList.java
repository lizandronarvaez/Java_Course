package src.Collections.List;

import java.util.*;
import src.Collections.Models.Alumno;

public class OrdenarLinkedList {
    public static void main(String[] args) {

        LinkedList<Alumno> listEnlazada = new LinkedList<>();
        listEnlazada.add(new Alumno("Lizandro", 8));
        listEnlazada.add(new Alumno("Lucia", 9));
        listEnlazada.add(new Alumno("Jean Carlos", 10));
        listEnlazada.add(new Alumno("Andrea", 7));

        // Imprime
        System.out.println();
        System.out.println(listEnlazada);

        // Agrega al principio o final
        System.out.println();
        listEnlazada.addFirst(new Alumno("Zeus", 5));
        listEnlazada.addLast(new Alumno("Alicia", 8));

        // OBtiene el primero o el ultimo
        System.out.println();
        System.out.println("Primero elemento: " + listEnlazada.getFirst());
        System.out.println("Ultimo elemento: " + listEnlazada.getLast());
        System.out.println("Obtiene por id: " + listEnlazada.peek());
        System.out.println("Obtiene por id: " + listEnlazada.get(2));

        // Elimina
        listEnlazada.removeFirst();
        listEnlazada.removeLast();
        //
        listEnlazada.pop();
        listEnlazada.push(new Alumno("Lizandro", 8));

        // Imprime el indice del elemento
        int jeanCarlos = listEnlazada.indexOf(new Alumno("Jean Carlos", 10));
        System.out.println("Indice de Jean Carlos: " + jeanCarlos);

        // Imprime
        System.out.println();
        System.out.println(listEnlazada);
    }
}

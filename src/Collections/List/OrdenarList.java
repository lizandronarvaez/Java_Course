package src.Collections.List;

import java.util.*;
import src.Collections.Models.Alumno;

public class OrdenarList {
    public static void main(String[] args) {

        List<Alumno> sAlumno = new ArrayList<>();
        System.out.println("Tamaño lista: " + sAlumno.size());
        System.out.println("Esta vacia? " + (sAlumno.isEmpty() ? "Si" : "No"));
        sAlumno.add(new Alumno("Lizandro", 8));
        sAlumno.add(new Alumno("Lucia", 9));
        sAlumno.add(new Alumno("Jean Carlos", 10));
        sAlumno.add(new Alumno("Andrea", 7));

        // Tamaño lista
        System.out.println("Tamaño lista: " + sAlumno.size());
        System.out.println(sAlumno);
        // Eliminar por objeto
        sAlumno.remove(new Alumno("Lucia", 9));
        sAlumno.remove(2);
        // Verificar si contieene el objeto
        boolean exist = sAlumno.contains(new Alumno("Jean Carlos", 10));
        System.out.println("Alumno existe? " + (exist ? "si" : "no"));
        // Foreach
        System.out.println(sAlumno);

        // ITERATOR
        System.out.println();
        System.out.println("*****ITERATOR*****");
        ListIterator<Alumno> listIterator = sAlumno.listIterator();
        
        // Mientras existe uno mas sigue
        while (listIterator.hasNext()) {
            Alumno al = listIterator.next();
            System.out.println(al);
        }
    }
}

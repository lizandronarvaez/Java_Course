package src.Collections.Set;

import java.util.*;
import src.Collections.Models.Alumno;

public class ExampleAlumno {
    public static void main(String[] args) {

        Set<Alumno> sAlumno = new TreeSet<>((a, b) -> b.getNota().compareTo(a.getNota()));
        sAlumno.add(new Alumno("Lizandro", 8));
        sAlumno.add(new Alumno("Lucia", 9));
        sAlumno.add(new Alumno("Jean Carlos", 10));
        sAlumno.add(new Alumno("Andrea", 7));

        System.out.println(sAlumno);
    }
}

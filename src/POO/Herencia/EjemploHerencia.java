package src.POO.Herencia;

public class EjemploHerencia {

    public static void main(String[] args) {

        System.out.println("******INSTANCIA DE ALUMNO*********");
        
        Alumno alumno = new Alumno();
        alumno.setNombre("Lizandro");
        alumno.setApellido("Narvaez");
        alumno.setFormacion("FP Grado Superior");
        alumno.setNotaProgramacion(7.25);
        alumno.setNotaInformatica(8.25);
        alumno.setNotaIngles(9.25);
        
        System.out.println();
        System.out.println("******INSTANCIA DE PROFESOR*********");
        Profesor profesor = new Profesor();
        profesor.setNombre("Profesor");
        profesor.setApellido("apellido");
        profesor.setAsignatura("Inglés");
        System.out.println();
        // Clase alumno
        System.out.println("Alumno: " + alumno.getNombre() + " " + alumno.getApellido() + "\nFormacion: "
        // cast pata acceder acceder a metodos de alumno
                + ((Alumno) alumno).getFormacion());

        // Clase profesor
        System.out.println("Profesor: " + profesor.getNombre() + " " + profesor.getApellido() + "\nAsignatura: "
                + profesor.getAsignatura());

        System.out.println();
        System.out.println("******INSTANCIA DE AlumnoInternacional*********");
        
        // clase aluno internacional
        AlumnoInternacional alumnoInternacional = new AlumnoInternacional();
        alumnoInternacional.setNombre("Jean");
        alumnoInternacional.setApellido("Paul");
        alumnoInternacional.setPais("EEUU");
        alumnoInternacional.setNotaIdiomas(10);
        alumnoInternacional.setFormacion("Universidad Programacion");
        alumnoInternacional.setNotaProgramacion(9.95);
        alumnoInternacional.setNotaInformatica(8.25);
        alumnoInternacional.setNotaInformatica(5.25);

        System.out.println();
        System.out.println("ALUMNO INTERNACIONAL");
        System.out.println("AlumnoInternacional: " + alumnoInternacional.getNombre() + " "
                + alumnoInternacional.getApellido() + "\n");
        System.out.println();
        Class<?> claseAlumnoInt = alumnoInternacional.getClass();

        while (claseAlumnoInt.getSuperclass() != null) {
            String hija = claseAlumnoInt.getName();
            String padre = claseAlumnoInt.getSuperclass().getName();

            System.out.println(hija + " es una clase hija de la clase: " + padre);
            claseAlumnoInt = claseAlumnoInt.getSuperclass();
        }
    }
}

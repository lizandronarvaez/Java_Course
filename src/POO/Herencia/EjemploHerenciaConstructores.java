package src.POO.Herencia;

public class EjemploHerenciaConstructores {

    public static void main(String[] args) {

        Alumno alumno = new Alumno("Lizandro", "Narvaez", 30, "FP Grado Superior");
        alumno.setNotaProgramacion(5.5);
        alumno.setNotaInformatica(6.5);
        alumno.setNotaIngles(9.95);
        alumno.setEmail("lizandrojesus13@hotmail.com");
        imprimir(alumno);

       
    }

    public static void imprimir(Persona persona) {
        // System.out.println("Nombre: " + persona.getNombre()
        //         + "\nApellido: " + persona.getApellido()
        //         + "\nEdad: " + persona.getEdad()
        //         + "\nEmail: " + persona.getEmail());

        // Metodo saludar
        System.out.println(persona);
    }
}

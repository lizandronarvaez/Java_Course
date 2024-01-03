package Tareas.Tarea_Herencias;

public class Herencias {
    public static void main(String[] args) {
            
        Gerente gerente = new Gerente();
        gerente.setNombre("Lizandro");
        gerente.setApellido("Narvaez");
        gerente.setDni("1234456677");
        gerente.setDomicilio("Avenida ciudania");

        imprimirDatos(gerente);
    }   

    public static void imprimirDatos(Persona persona){
        System.out.println(persona);
    }
}

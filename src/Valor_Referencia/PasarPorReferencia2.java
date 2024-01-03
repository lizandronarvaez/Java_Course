package src.Valor_Referencia;

class Persona {

    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }
}

public class PasarPorReferencia2 {

    public static void main(String[] args) {

        // Instancia de la clase persona
        Persona persona = new Persona();

        // Acceso a los metodos
        persona.setNombre("Lizandro Narváez");
        System.out.println("Antes de llamar al metodo test() el valor de persona es: \n" + persona.getNombre());
        // Llamada al metodo test
        test(persona);
        // Salida de datos
        System.out.println("El nuevo valor de la referencia persona es: " + persona.getNombre());

    }

    public static void test(Persona persona) {
        System.out.println("Iniciamos el método test");
        persona.setNombre("Marina Guillén Loyola");
        System.out.println("Cambiando el valor de la persona");
        System.out.println("Finalizando el método test");
    }
}

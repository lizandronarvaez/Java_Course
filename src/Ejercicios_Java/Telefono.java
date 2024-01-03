package src.Ejercicios_Java;

public class Telefono {
    private String color, marca, modelo, memoriaInterna;

    public Telefono(String color, String marca, String modelo, String memoriaInterna) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaInterna = memoriaInterna;

    }

    public void enviarMensaje(String mensaje) {

        if (mensaje.equals("Enviando mensaje...")) {
            System.out.println("");
            System.out.println("\033[32m " + mensaje);
            System.out.println("");

            return;
        } else {
            System.out.println("");
            System.err.println("\033[31m El mensaje no es igual a : " + mensaje);
            System.out.println("");
        }
    }

    public void tomarFoto() {
        System.out.println("Tomando foto");
    }

    public void hacerLlamada() {
        System.out.println("Realizando llamada");
    }

}

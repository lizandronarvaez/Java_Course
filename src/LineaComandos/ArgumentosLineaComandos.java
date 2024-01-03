package src.LineaComandos;

public class ArgumentosLineaComandos {

    public static void main(String[] args) {

        // System.exit(0) es que todod sale bien
        // System.exit(1) se lanza una exepcion
        // System.exit(-1) hay un error
        if (args.length == 0) {
            System.out.println("Debe ingresar argumentos o parámetros");
            System.exit(-1);
        }
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argumento nº" + i + " " + args[i]);
        }

    }
}

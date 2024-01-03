package src.LineaComandos;

public class CalculadoraCli {

    public static void main(String[] args) {

        if (args.length == 0 || args.length < 3) {
            System.out.println("");
            System.out.println("");
            System.out.println("***************************************************");
            System.out.println("***************  CALCULADORA CON JAVA  ************");
            System.out.println("***************************************************");

            System.out.println("Debes introduce el tipo de operacion:");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("Debes introducir los parametros: Tipo de operacion, numero1,numero2");
            System.out.println("");
            System.exit(-1);
        }

        try {
            String operacion = args[0];
            int numero1 = Integer.parseInt(args[1]);
            int numero2 = Integer.parseInt(args[2]);

            switch (operacion.toLowerCase()) {

                case "sumar":
                    System.out.println("El resultado es: " + (numero1 + numero2));
                    break;
                case "restar":
                    System.out.println("El resultado es: " + (numero1 - numero2));
                    break;
                case "multiplicar":
                    System.out.println("El resultado es: " + (numero1 * numero2));
                    break;
                case "dividir":
                    if ((numero1 / numero2) <= 0) {
                        System.out.println("Prueba con otra division");
                        System.exit(-1);
                    }
                    System.out.println("El resultado es: " + (double) (numero1 / numero2));
                    break;
                default:
                    System.out.println("No existe esa operacion en la calculadora");
                    System.exit(-1);
                    break;
            }
        } catch (Exception e) {
            System.out.println("Debes introducir numeros positivos");
            System.exit(-1);
        }
    }
}

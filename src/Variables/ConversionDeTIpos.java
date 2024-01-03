package src.Variables;

public class ConversionDeTIpos {
    public static void main(String[] args) {
        String numeroString = "50";
        String realString = "8578038.19";
        String logicoString = "TRUE";

        // Con el metodo de Integer.parseInt transforma el texto a numero
        int numeroInt = Integer.parseInt(numeroString);
        Double realDouble = Double.parseDouble(realString);
        Boolean logico = Boolean.parseBoolean(logicoString);

        // Sout
        System.out.println(numeroInt);
        System.out.println(realDouble);
        System.out.println(logico);
    }
}

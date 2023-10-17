package Java_Curso.src.String;

public class StringMetodos {
    public static void main(String[] args) {
        // Declaracion de variables
        String nombre = "Lizandro";
        String trabaLenguas = "Esto es una frase";

        // Metodos de String
        int logitudCadena = nombre.length();
        String nombreMinuscula = nombre.toLowerCase();
        String nombreMayuscula = nombre.toUpperCase();
        boolean compararString = nombre.equalsIgnoreCase("lizandro");
        char obtenerCaracter = nombre.charAt(nombre.length() - 1);
        String obtenerParteString = nombre.substring(0, nombre.length() - 1);

        // Metodos de string 2
        String reemplazarLetras = trabaLenguas.replace("e", "A");
        int encuentraPalabras = trabaLenguas.indexOf("frase");
        int encuentraUltimaPalabra = trabaLenguas.lastIndexOf("se");
        int encuentraUltimaPalabra2 = trabaLenguas.lastIndexOf("ze");
        boolean letraIncluida=trabaLenguas.contains("t");
        
        // sout string1
        System.out.println("");
        System.out.println("La logitud de Nombre es: " + logitudCadena + " carácteres");
        System.out.println(nombreMinuscula);
        System.out.println(nombreMayuscula);
        System.out.println(compararString);
        System.out.println(obtenerCaracter);
        System.out.println(obtenerParteString);
        System.out.println("");

        // sout string2
        System.out.println(reemplazarLetras);
        System.out.println(encuentraPalabras);
        System.out.println(encuentraUltimaPalabra);
        System.out.println("Sino encuentra la posicion de una letra o frase devuelve esto: " + encuentraUltimaPalabra2);
        System.out.println(letraIncluida);
        System.out.println("");
    }
}

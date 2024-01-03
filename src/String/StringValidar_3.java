package src.String;

public interface StringValidar_3 {
    public static void main(String[] args) {

        String variable = "";

        // Evaluamos
        // if (esNull) {
        //     variable = "hola bienvenido";
        //     System.out.println(variable);

        //     return;
        // }
        if (variable.length() == 0) {
            System.out.println("La variable esta vacia");
        }
        // tambien podemos evaluar con empty
        if (variable.isEmpty()) {
            System.out.println("La variable esta vacia");
        }

        // Tambien podemos utilizar el metodo isBlank()
        if (variable.isBlank()) {
            System.out.println("La variable esta vacia");
            return;
        }
        // sout
        System.out.println("La variable no esta vacia");
    }
}

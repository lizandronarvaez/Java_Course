package src.ClasesWrapper;

public class AutoboxingInteger {
    public static void main(String[] args) {

        // Autoboxing
        Integer numeros[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Integer suma = 0;

        //forma explicita de recorrer un array de enteros
        for (Integer integer : numeros) {
            if (integer.intValue() % 2 == 0) {
                suma+=integer.intValue();
            }
        }

        // salida de datos
        System.out.println("La suma de todos los numeros pares es: " + suma);
    }
}

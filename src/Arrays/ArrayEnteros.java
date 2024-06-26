package Arrays;

public class ArrayEnteros {
    public static void main(String[] args) {

        // Primera forma de crear un array con la instancia
        int numeros[] = new int[3];

        try {
            numeros[0] = 10;
            numeros[1] = 20;
            numeros[2] = 30;

            // numeros[3] = 40;
            for (int i : numeros) {
                System.out.println("Valor array: " + i);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

package src.ClaseMath;

public class EjemploMarth_1 {

    public static void main(String[] args) {

        // Valor absoluto
        int absoluto = Math.abs(-5);
        absoluto = Math.abs(15);
        // Valor maximo
        double maximo = Math.max(3.2, 5.8);
        // Valor minimo
        double minimo = Math.min(1.2, 10.8);

        // Redondear un numero hacia arriba
        double redondeoNumero = Math.ceil(5.2);

        // Redondear un numero hacia abjo
        double redonderoNumero2 = Math.floor(2.4);

        // Redondear un numero al proximo mas entero
        double redondeoNumero3 = Math.round(4.56);

        // numero pi
        double numeroPI = Math.round(3.14);

        // Salida de datos
        System.out.println(absoluto);
        System.out.println(maximo);
        System.out.println(minimo);
        System.out.println(redondeoNumero);
        System.out.println(redonderoNumero2);
        System.out.println(redondeoNumero3);
        System.out.println("Numero PI (redondeado): " + numeroPI);
    }
}

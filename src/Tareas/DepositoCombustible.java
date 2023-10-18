package Java_Curso.src.Tareas;

import java.util.Scanner;

public class DepositoCombustible {
    public static void main(String[] args) {

        // scanner
        Scanner scanner = new Scanner(System.in);
        // Declaracion de variables
        int capacidadTotalDeposito = 70;
        int litrosActuales;
        String estadoDeposito = "";

        // Entrada de datos
        System.out.println("Introduce por favor los litros de combustible disponibles");
        litrosActuales = scanner.nextInt();
        scanner.close();

        //
        if (capacidadTotalDeposito == litrosActuales) {
            estadoDeposito = "Deposito lleno";
        }
        if (litrosActuales >= 60 && litrosActuales < 70) {
            estadoDeposito = "Deposito casi lleno";

        }
        if (litrosActuales >= 40 && litrosActuales < 60) {
            estadoDeposito = "Deposito 3/4";

        }
        if (litrosActuales >= 35 && litrosActuales < 40) {
            estadoDeposito = "Medio deposito";

        }
        if (litrosActuales >= 20 && litrosActuales < 35) {
            estadoDeposito = "Deposito casi al minimo";

        }
        if (litrosActuales >= 1 && litrosActuales < 20) {
            estadoDeposito = "Deposito al minimo, debes repostar";

        }

        // Salida de datos
        System.out.println(estadoDeposito);
    }
}

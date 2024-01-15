package src.Thread;

import src.Thread.Runnable.Viaje;

public class ExampleRunnable {

    public static void main(String[] args) {

        new Thread(new Viaje("Estudiar Microservicios")).start();
        new Thread(new Viaje("Estudiar Docker")).start();

    }
}

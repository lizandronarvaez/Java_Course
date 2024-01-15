package src.Thread;

import src.Thread.Runnable.Frases;

public class ExampleSyncronizedThread {
    public static void main(String[] args) throws InterruptedException {

        new Thread(new Frases("Hola", " que tal?")).start();
        new Thread(new Frases("Quien eres ", " tu?")).start();
        Thread.sleep(100);
        Thread h3 = new Thread(new Frases("Muchas gracias ", " amigo"));
        h3.start();
        Thread.sleep(100);
        System.out.println(h3.getState());
    }

    public synchronized static void imprimirFrases(String frase1, String frase2) {

        System.out.println(frase1);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(frase2);

    }
}

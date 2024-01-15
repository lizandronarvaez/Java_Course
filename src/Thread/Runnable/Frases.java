package src.Thread.Runnable;

import src.Thread.ExampleSyncronizedThread;

public class Frases implements Runnable {

    private String frase1;
    private String frase2;

    public Frases(String frase1, String frase2) {
        this.frase1 = frase1;
        this.frase2 = frase2;
    }

    @Override
    public void run() {
        ExampleSyncronizedThread.imprimirFrases(this.frase1, this.frase2);
    }

}

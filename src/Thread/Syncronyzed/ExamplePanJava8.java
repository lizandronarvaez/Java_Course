package src.Thread.Syncronyzed;

import java.util.concurrent.ThreadLocalRandom;

public class ExamplePanJava8 {
    public static void main(String[] args) {
        Panaderia p = new Panaderia();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                p.hornear("Pan nº: " + i);
                try {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                p.consumir();
            }
        }).start();

    }
}

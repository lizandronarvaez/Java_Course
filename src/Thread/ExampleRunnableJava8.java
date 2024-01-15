package src.Thread;

public class ExampleRunnableJava8 {

    public static void main(String[] args) throws InterruptedException {

        Runnable viaje = () -> {

            for (int i = 0; i < 10; i++) {
                System.out.println(i + ": " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Finalmente me voy a: " + Thread.currentThread().getName());
        };

        new Thread(viaje, "Guayaquil").start();
        new Thread(viaje, "New york").start();
        new Thread(viaje, "Paris").start();
        new Thread(viaje, "Alemania").start();
        new Thread(viaje, "Mexico").start();

        Thread.sleep(20000);
        System.out.println("Continuando con la ejecucion del método main");

    }
}

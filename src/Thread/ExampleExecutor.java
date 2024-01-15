package src.Thread;

import java.util.concurrent.*;

public class ExampleExecutor {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Runnable runnable = () -> {
            System.out.println("Inicio de la tarea");
            try {
                System.out.println("Nombre del Thread: " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                // Interrrupcion del hilo
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("Finaliza la tarea");
        };
        executorService.submit(runnable);
        executorService.shutdown();
        System.out.println("Continuando con la ejecuccion del método main");
        executorService.awaitTermination(2, TimeUnit.SECONDS);
        System.out.println("Continuando con la ejecuccion del método main2");

    }
}
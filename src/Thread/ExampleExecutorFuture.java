package src.Thread;

import java.util.concurrent.*;

public class ExampleExecutorFuture {

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

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
        Future<?> future = executorService.submit(runnable);
        executorService.shutdown();
        System.out.println(future.isDone());
        System.out.println("Continuamos...");
        System.out.println(future.get(2, TimeUnit.SECONDS));
        System.out.println(future.isDone());
    }
}
package src.Thread;

import java.util.concurrent.*;

public class ExampleExecutorFutureThree {

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ThreadPoolExecutor executorService = (ThreadPoolExecutor) Executors.newFixedThreadPool(1);

        System.out.println("Tamaño del pool: " + executorService.getPoolSize());
        System.out.println("Cantidad de tareas: " + executorService.getQueue().size());
        // Tarea 1
        Callable<String> runnable = () -> {
            System.out.println("Inicio de la tarea 1");
            try {
                System.out.println("Nombre del Thread: " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                // Interrrupcion del hilo
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("Finaliza la tarea 1");
            return "Algún resultado importante de la tarea";
        };

        // Tarea 2
        Callable<Integer> runnableTwo = () -> {
            System.out.println("Iniciando tarea 3");
            TimeUnit.SECONDS.sleep(2);
            return 10;
        };

        // Llamada tareas
        Future<String> future = executorService.submit(runnable);
        Future<String> futureTwo = executorService.submit(runnable);
        Future<Integer> futureThree = executorService.submit(runnableTwo);

        System.out.println("Tamaño del pool: " + executorService.getPoolSize());
        System.out.println("Cantidad de tareas: " + executorService.getQueue().size());
        executorService.shutdown();
        //
        while (!(future.isDone() && futureTwo.isDone() && futureThree.isDone())) {
            System.out.println(String.format(
                    "Resultado 1: %s - resultado 2: %s - resultado 3: %s",
                    future.isDone() ? "Finalizó" : "En proceso",
                    futureTwo.isDone() ? "Finalizó" : "En proceso",
                    futureThree.isDone() ? "Finalizó" : "En proceso"));

            TimeUnit.SECONDS.sleep(1);
        }

        // .get() => Resultado de las tareas
        System.out.println("Resultado de la tarea: " + future.get());
        System.out.println("Finaliza la tarea: " + future.isDone());
        // .isDone() => Resultado de si ha terminado las tareas

        System.out.println("Resultado de la tarea: " + futureTwo.get());
        System.out.println("Finaliza la tarea: " + futureTwo.isDone());

        System.out.println("Resultado de la tarea: " + futureThree.get());
        System.out.println("Finaliza la tarea: " + futureThree.isDone());
    }
}
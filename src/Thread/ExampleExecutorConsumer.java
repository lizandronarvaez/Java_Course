package src.Thread;

import java.util.concurrent.*;

import src.Thread.Syncronyzed.Panaderia;
import src.Thread.Syncronyzed.Runnable.Consumidor;
import src.Thread.Syncronyzed.Runnable.Panadero;

public class ExampleExecutorConsumer {

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ThreadPoolExecutor executorService = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

        System.out.println("Tamaño del pool: " + executorService.getPoolSize());
        System.out.println("Cantidad de tareas: " + executorService.getQueue().size());

        // Llamada tareas
        Panaderia panaderia = new Panaderia();
        Runnable productor = new Panadero(panaderia);
        Runnable consumidor = new Consumidor(panaderia);

        Future<?> future = executorService.submit(productor);
        Future<?> futureTwo = executorService.submit(consumidor);

        System.out.println("Tamaño del pool: " + executorService.getPoolSize());
        System.out.println("Cantidad de tareas: " + executorService.getQueue().size());

        executorService.shutdown();

    }
}
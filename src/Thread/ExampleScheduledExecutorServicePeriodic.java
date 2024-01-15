package src.Thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExampleScheduledExecutorServicePeriodic {

    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);

        System.out.println("Alguna tarea en el main");

        CountDownLatch countDownLatch = new CountDownLatch(5);
        executorService.scheduleAtFixedRate(() -> {

            System.out.println("Hola mundo tarea");
        }, 1000, 2000, TimeUnit.MILLISECONDS);

        countDownLatch.await();
        System.out.println("Alguna otra tarea en el main");

        executorService.shutdown();
    }
}

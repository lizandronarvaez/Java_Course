package src.Thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExampleScheduledExecutorService {

    public static void main(String[] args) {

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);

        System.out.println("Alguna tarea en el main");

        executorService.schedule(() -> {

            System.out.println("Hola mundo tarea");
        }, 5000, TimeUnit.MILLISECONDS);

        System.out.println("Alguna otra tarea en el main");

        executorService.shutdown();
    }
}

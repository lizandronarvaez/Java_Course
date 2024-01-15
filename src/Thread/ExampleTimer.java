package src.Thread;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class ExampleTimer {

    public static void main(String[] args) {

        // Instancia timer
        Timer timer = new Timer();
        // tarea, tiempo de repetion
        timer.schedule(new TimerTask() {

            @Override
            public void run() {
                System.out.println("Tarea realizada en: " + new Date().toString() + " nombre del Thread: " +
                        Thread.currentThread().getName());

                System.out.println("Finaliza el tiempo");
                // Finaliza el tiempo
                timer.cancel();
            }

        }, 5000);

        System.out.println("Agendamos una tarea para 5 segundos más...");
    }
}

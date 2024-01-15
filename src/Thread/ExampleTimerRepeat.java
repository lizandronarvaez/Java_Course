package src.Thread;

import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.awt.*;;
public class ExampleTimerRepeat {

    public static void main(String[] args) {

        // Atributos
        AtomicInteger count = new AtomicInteger(3);
        // Sonido de el sistema
        Toolkit toolkit= Toolkit.getDefaultToolkit();


        // Instancia timer
        Timer timer = new Timer();
        // tarea, tiempo de repetion
        timer.schedule(new TimerTask() {

            // private Integer count = 3;
            @Override
            public void run() {

                int i = count.getAndDecrement();
                if (i > 0) {
                    toolkit.beep();
                    System.out.println(
                            "Tarea " + i + " repetida en: " + LocalDateTime.now() + " nombre del Thread: " +
                                    Thread.currentThread().getName());
                    // i--;
                    return;
                }
                System.out.println("Finaliza el tiempo");
                // Finaliza el tiempo
                timer.cancel();
            }
            // Tearea que tarda 5 segundos en ejecturase y se vuelve a repetir en 10
        }, 0, 5000);

        System.out.println("Agendamos una tarea para 5 segundos más...");
    }
}

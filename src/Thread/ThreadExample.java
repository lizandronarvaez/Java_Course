package src.Thread;

import src.Thread.Threads.ClaseThread;

public class ThreadExample {

    public static void main(String[] args) throws InterruptedException {
        Thread estado = new ClaseThread("Lizandro");
        Thread.sleep(10000);
        System.out.println(estado.getState());

        Thread stado2= new ClaseThread("Hola");
        stado2.start();
        System.out.println(stado2.getState());
    }

}

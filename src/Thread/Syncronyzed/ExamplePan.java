package src.Thread.Syncronyzed;

import src.Thread.Syncronyzed.Runnable.Consumidor;
import src.Thread.Syncronyzed.Runnable.Panadero;

public class ExamplePan {
    public static void main(String[] args) {
        Panaderia p = new Panaderia();

        new Thread(new Panadero(p)).start();
        new Thread(new Consumidor(p)).start();

    }
}

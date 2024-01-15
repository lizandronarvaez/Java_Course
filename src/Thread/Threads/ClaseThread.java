package src.Thread.Threads;

public class ClaseThread extends Thread {

    public ClaseThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Se inicia el método run del hilo " + getName());

        for (int i = 0; i < 5; i++) {
            System.out.println(this.getName());
        }

        System.out.println("Finaliza el hilo" + getName());
    }

}

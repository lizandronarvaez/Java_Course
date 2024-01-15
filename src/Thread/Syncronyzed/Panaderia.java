package src.Thread.Syncronyzed;

public class Panaderia {
    private String pan;
    private boolean disponible;

    public Panaderia() {
    }

    public synchronized void hornear(String masa) {
        while (disponible) {
            try {
                wait();
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
        this.pan = masa;
        System.out.println("Panadero hornea: " + this.pan);
        this.disponible = true;

        notify();
    }

    public synchronized String consumir() {
        while (!disponible) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("El pan esta disponible");
        this.disponible = false;
        notify();
        return this.pan;
    }

}

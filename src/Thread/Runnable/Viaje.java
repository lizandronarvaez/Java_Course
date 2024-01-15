package src.Thread.Runnable;

public class Viaje implements Runnable {

    private String nombre;

    public Viaje(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + ": " + getNombre());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Finaliza el Thread");
    }

    public String getNombre() {
        return nombre;
    }

}

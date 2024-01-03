package src.Clase_System;

public class ClaseRuntime {

    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();
        Process proceso;

        try {
            if (System.getProperty("os.name").contains("nux") || System.getProperty("os.name").equalsIgnoreCase("linux")) {
                System.out.println("Tu sistema operativo es: " + System.getProperty("os.name"));
                proceso = runtime.exec("gnome-terminal");

                return;
            }
            // proceso.waitFor();
        } catch (Exception e) {
            System.err.println(e);

        }

        // Salida de datos
        // System.out.println(runtime);
        System.out.println(System.getProperty("os.name"));
    }
}

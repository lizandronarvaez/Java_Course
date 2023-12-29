package src.POO.Clases;

public class EjemploUsoStatic {

    public static void main(String[] args) {

        // Persona
        Persona conductorVehiculo1 = new Persona("Lizandro","Narvaez");
        System.out.println(conductorVehiculo1);

        // instancia de automoviles
        Automovil vehAutomovil1 = new Automovil("Ford", "Focus");
        // Automovil vehAutomovil3 = new Automovil();

        // fORD FOCUS
        System.out.println();
        vehAutomovil1.setColor(ColoresAutomovil.BLANCO);
        vehAutomovil1.setTipo(TipoAutomovil.DEPORTIVO);
        System.out.println(vehAutomovil1.infoVehiculo());

        TipoAutomovil ford = vehAutomovil1.getTipo();
        System.out.println(ford.getNombre());
        System.out.println(ford.getDescripcion());
        System.out.println();

        // Nissan
        Automovil vehAutomovil2 = new Automovil("Nissan", "Qashqai");
        vehAutomovil2.setTipo(TipoAutomovil.SUV);
        System.out.println(vehAutomovil2.infoVehiculo());

        TipoAutomovil qashqai = vehAutomovil2.getTipo();
        System.out.println(qashqai.getNombre());
        System.out.println(qashqai.getDescripcion());

        // enum
        System.out.println();
        System.out.println("Velocidad máxima autovia: " + Automovil.VELOCIDAD_MAX_AUTOVIA);
        System.out.println("Velocidad máxima ciudad: " + Automovil.VELOCIDAD_MAX_CIUDAD);
        System.out.println();
    }
}

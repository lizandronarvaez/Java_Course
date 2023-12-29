package src.POO.Clases;

public class EjemploUsoStaticEnum {

    public static void main(String[] args) {

        Automovil vehAutomovil1 = new Automovil("Ford", "Focus");

        // setear un atributo estatico
        // Automovil.cilindrada = 2000;

        // fORD FOCUS
        System.out.println();
        vehAutomovil1.setTipo(TipoAutomovil.COMPACTO);
        System.out.println(vehAutomovil1.infoVehiculo());

        TipoAutomovil ford = vehAutomovil1.getTipo();

        switch (ford) {
            // a partir del jdk 13 se puede utilizar la flecha para sustituir el break
            case COMPACTO, DEPORTIVO, SUV, TODO_TERRENO ->
                System.out.println("El vehiculo se puede reprogramar");

            case BERLINA, FURGON ->
                System.out.println("El vehiculo no esta recomendando para realizar una reprogramacion");

        }
        // enum
        System.out.println();
        System.out.println("Velocidad máxima autovia: " + Automovil.VELOCIDAD_MAX_AUTOVIA);
        System.out.println("Velocidad máxima ciudad: " + Automovil.VELOCIDAD_MAX_CIUDAD + "\n");

        // iteracion de una clase enum
        TipoAutomovil[] tipos = TipoAutomovil.values();
        System.out.println("Tipos de automovil:\n");
        for (TipoAutomovil tipoAutomovil : tipos) {

            System.out.println(tipoAutomovil);
            System.out.println(tipoAutomovil.getNombre());
            System.out.println("Reprogramacion: " + tipoAutomovil.isReprogramacion());
            System.out.println(tipoAutomovil.getDescripcion() + "\n");
        }
    }
}

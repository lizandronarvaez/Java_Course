package src.POO.Clases;

public class EjemploAutomovil {

    public static void main(String[] args) {

        Motor motorFord = new Motor(1.8, 160, TipoMotor.DIESEL);
        Motor motorOpel = new Motor(1.6, 136, TipoMotor.GASOLINA);
        Motor motorVolkswagen = new Motor(2.0, 150, TipoMotor.DIESEL);

        // Vehiculo ford
        Automovil ford = new Automovil("Ford", "Focus");
        ford.setColor(ColoresAutomovil.GRIS);
        ford.setMotor(motorFord);
        ford.setDeposito(new Deposito(60));
        ford.setKilometrosRecorridos(100);
        ford.setTipo(TipoAutomovil.COMPACTO);

        // Vehiculo opel
        Automovil opel = new Automovil("Opel", "Insignia");
        opel.setColor(ColoresAutomovil.BLANCO);
        opel.setMotor(motorOpel);
        opel.setDeposito(new Deposito(75));
        // opel.setKilometrosRecorridos(100);
        opel.setTipo(TipoAutomovil.BERLINA);

        // Vehiculo volkswagen
        Automovil volkswagen = new Automovil("Volkswagen", "Passat");
        volkswagen.setColor(ColoresAutomovil.AZUL);
        volkswagen.setMotor(motorVolkswagen);
        volkswagen.setDeposito(new Deposito(80));
        volkswagen.setKilometrosRecorridos(100);
        volkswagen.setTipo(TipoAutomovil.BERLINA);

        // Detalle vehiculo
        System.out.println(ford.infoVehiculo());
        System.out.println(opel.infoVehiculo());
        System.out.println(volkswagen.infoVehiculo());
    }
}

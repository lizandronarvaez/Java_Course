package src.POO.Clases;

// Buenas practicas
public class Automovil {

    // Atributos
    private int id;
    private String marca;
    private String modelo;

    private ColoresAutomovil color;
    private Deposito deposito;

    private Motor motor;

    private Persona propietario;
    private Rueda[] ruedas;

    private TipoAutomovil tipo;

    private int kilometrosRecorridos;
    // Estaticos
    // static Integer cilindrada = 1600;
    // private static String saludo;

    // final: cuando se declara como final la el nombre debe ir siempre en mayuscula
    public static final Integer VELOCIDAD_MAX_AUTOVIA = 120;
    public static final Integer VELOCIDAD_MAX_CIUDAD = 50;
    public static final ColoresAutomovil COLOR_ROJO = ColoresAutomovil.ROJO;
    public static final ColoresAutomovil COLOR_BLANCO = ColoresAutomovil.BLANCO;
    public static final ColoresAutomovil COLOR_AZUL = ColoresAutomovil.AZUL;

    // constructor de la clase con argumentos

    public Automovil(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Automovil(String marca, String modelo, ColoresAutomovil color) {
        this(marca, modelo);
        this.color = color;
    }

    public Automovil(String marca, String modelo, ColoresAutomovil color, Motor motor) {
        this(marca, modelo, color);
        this.motor = motor;

    }

    public Automovil(String marca, String modelo, ColoresAutomovil color, Motor motor, Deposito deposito) {
        this(marca, modelo, color, motor);
        this.deposito = deposito;

    }

    public Automovil(String marca, String modelo, ColoresAutomovil color, Motor motor, Deposito deposito,
            Persona propietario, Rueda[] ruedas) {

        this(marca, modelo, color, motor, deposito);

        this.propietario = propietario;
        this.ruedas = ruedas;
    }

    // constructor clase sin argumentos
    public Automovil() {

    }

    // Getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public ColoresAutomovil getColor() {
        return color;
    }

    public void setColor(ColoresAutomovil color) {
        this.color = color;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public Deposito getDeposito() {

        return deposito;
    }

    public void setDeposito(Deposito deposito) {
        this.deposito = deposito;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setKilometrosRecorridos(int kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    // METODOS PERSONALIZADOS
    public void arrancar() {
        System.out.println("Arracando vehiculo");
    }

    public void apagar() {
        System.out.println("Apagando vehiculo");
    }

    public String infoVehiculo() {
        // Concatenar grandes string
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("**** FABRICANTE: Grupo " + this.marca + " ****\n");
        stringBuilder.append("\nMarca: " + this.marca);
        stringBuilder.append("\nModelo: " + this.modelo);
        stringBuilder.append("\nPuertas: " + this.getTipo().getPuertas());

        if (this.getColor() != null && this.getMotor() != null
                && this.getDeposito() != null) {
            stringBuilder.append("\nColor: " + this.color.getColor());
            stringBuilder.append("\nCombustible: " + this.motor.getTipoMotor().getCombustible());
            stringBuilder.append("\nCapacidad Deposito: " + this.deposito.getCapacidad() + "litros");
            stringBuilder.append("\nPotencia: " + this.motor.getPotencia() + " CV");
        }
        stringBuilder.append("\nTipo vehiculo: " + this.getTipo().getDescripcion());
        stringBuilder.append("\nConsumo medio: " + this.calcularConsumo());

        return stringBuilder.toString();
    }

    public float calcularConsumo() {

        if (this.getKilometrosRecorridos() == 0) {
            return 0.0f;
        }
        float litrosConsumidos = this.getDeposito().getCapacidad() / 100.0f;
        return litrosConsumidos / this.getKilometrosRecorridos() * 1000;
    }

    public String acelerando() {
        return "Acelerando el vehiculo";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof Automovil) {

            // Realizar un cast a automovil
            Automovil automovil = (Automovil) obj;

            // realizamos la comparacion
            return (this.marca != null &&
                    this.modelo != null &&
                    this.marca.equals(automovil.getMarca()) &&
                    this.modelo.equals(automovil.getModelo())

            );
        }

        return false;
    }

    @Override
    public String toString() {
        return "Automovil [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", puertas="
                + this.getTipo().getPuertas()
                + ", potencia=" + this.motor.getPotencia()
                + ", depositoTotal=" + this.deposito.getCapacidad()
                + "]";
    }

}

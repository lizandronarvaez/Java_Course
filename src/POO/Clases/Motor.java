package src.POO.Clases;

public class Motor {

    private double cilindrada;
    private int potencia;
    private TipoMotor tipoMotor;

    public Motor() {
    }

    public Motor(double cilindrada, int potencia, TipoMotor tipoMotor) {
        this.cilindrada = cilindrada;
        this.potencia = potencia;
        this.tipoMotor = tipoMotor;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public TipoMotor getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(TipoMotor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

}

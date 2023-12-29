package src.POO.Clases_Abstractas_Form.Validadores;

abstract public class Validador {
    
    protected String message;

    abstract public void setMessage(String message);
    abstract public String getMessage();

    abstract public boolean isValid(String valor);
}

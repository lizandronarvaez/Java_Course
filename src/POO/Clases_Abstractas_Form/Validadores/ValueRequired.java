package src.POO.Clases_Abstractas_Form.Validadores;

public class ValueRequired extends Validador {

    protected String message = "El campo es obligatorio";

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public boolean isValid(String valor) {
        return (valor !=null && valor.length() > 0);
    }

}

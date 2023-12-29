package src.POO.Clases_Abstractas_Form.Validadores;

public class NumValidator extends Validador {

    protected String message = "El campo debe ser un numero";

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
        try {
            Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}

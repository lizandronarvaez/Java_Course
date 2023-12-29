package src.POO.Clases_Abstractas_Form.Validadores;

public class EmailValidador extends Validador {

    protected String message = "El forma de email no es correcto";

    private final static String EMAIL_REGEX = "^(.+)@(.+)$";

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public boolean isValid(String valor) {
        return valor.matches(EMAIL_REGEX);
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

}

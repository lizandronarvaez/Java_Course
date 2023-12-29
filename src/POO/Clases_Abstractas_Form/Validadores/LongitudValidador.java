package src.POO.Clases_Abstractas_Form.Validadores;

public class LongitudValidador extends Validador {

    protected String message = "El campo debe tener un minimo de %d caracteres y máximo %d caracteres";
    private int min;
    private int max = Integer.MAX_VALUE;

    public LongitudValidador() {
    }

    public LongitudValidador(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

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
        this.message = String.format(this.message, this.min, this.max);
        if (valor == null) return true;
        int largo=valor.length();
        return largo >=min && largo <= max;
    }

}

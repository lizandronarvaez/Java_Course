package src.POO.Clases_Abstractas_Form.Elementos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import src.POO.Clases_Abstractas_Form.Validadores.Validador;

public abstract class ElementoForm {

    protected String valor;
    protected String nombre;

    public String getNombre() {
        return nombre;
    }

    private List<Validador> validadores;
    private List<String> errores;

    public ElementoForm() {
        this.validadores = new ArrayList<>();
        this.errores = new ArrayList<>();
    }

    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    public ElementoForm addValidador(Validador validador) {
        this.validadores.add(validador);
        return this;
    }

    public List<String> getErrores() {
        return errores;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public boolean isValid() {
        for (Validador validador : validadores) {
            if (!validador.isValid(this.valor)) {
                this.errores.add(validador.getMessage());
            }
        }

        return this.errores.isEmpty();
    }

    abstract public String dibujarHtml();
}

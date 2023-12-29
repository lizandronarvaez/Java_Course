package src.POO.Clases_Abstractas_Form;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import src.POO.Clases_Abstractas_Form.Elementos.ElementoForm;
import src.POO.Clases_Abstractas_Form.Elementos.InputForm;
import src.POO.Clases_Abstractas_Form.Elementos.SelectForm;
import src.POO.Clases_Abstractas_Form.Elementos.TextAreaForm;
import src.POO.Clases_Abstractas_Form.Elementos.Select.Opcion;
import src.POO.Clases_Abstractas_Form.Validadores.EmailValidador;
import src.POO.Clases_Abstractas_Form.Validadores.LongitudValidador;
import src.POO.Clases_Abstractas_Form.Validadores.NotNullValidator;
import src.POO.Clases_Abstractas_Form.Validadores.ValueRequired;

public class Form {
    public static void main(String[] args) {

        // inputs
        InputForm fullname = new InputForm("fullname");
        fullname.addValidador(new ValueRequired());
        InputForm password = new InputForm("password", "password");
        password.addValidador(new ValueRequired())
                .addValidador(new LongitudValidador(6, 12));
        InputForm email = new InputForm("email", "email");
        email.addValidador(new ValueRequired()).addValidador(new EmailValidador());

        // textarea
        TextAreaForm textAreaForm = new TextAreaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("Lenguaje");
        lenguaje.addValidador(new NotNullValidator());
        Opcion java = new Opcion("1", "Java");
        lenguaje.addOpcion(java);
        lenguaje.addOpcion(new Opcion("2", "Javascript"));
        lenguaje.addOpcion(new Opcion("3", "Python"));
        lenguaje.addOpcion(new Opcion("4", "Go"));

        // saludo
        ElementoForm saludar = new ElementoForm("saludo") {

            @Override
            public String dibujarHtml() {
                return "<input name='" + this.nombre
                        + "' value='" + this.valor
                        + "' disabled />";

            }

        };
        //
        fullname.setValor("lizandro");
        password.setValor("1234567");
        email.setValor("lizandro@hotmail.com");
        textAreaForm.setValor("... introduce un mensaje por favor...");
        java.setSelected(true);
        saludar.setValor("Hola que tal este campo esta deshabilitado");
        // lista 1 forma
        // List<ElementoForm> elementos=new ArrayList<>();
        // elementos.add(fullname);
        // elementos.add(password);
        // elementos.add(email);
        // elementos.add(textAreaForm);
        // elementos.add(lenguaje);

        // lista 2 forma
        List<ElementoForm> elementos = Arrays.asList(fullname, password, email, textAreaForm, lenguaje, saludar);

        // PRIMERA FORMA DE ITERAR UN ARRAY
        // for (ElementoForm elementoForm : elementos) {
        // System.out.println(elementoForm.dibujarHtml());
        // System.out.println("</br>");
        // }

        // SEGUNDA FORMA DE ITERAR UN ARRAY
        elementos.forEach(element -> {
            System.out.println(element.dibujarHtml());
            System.out.println("</br>");
        });

        elementos.forEach(e -> {
            if (!e.isValid()) {
                e.getErrores().forEach(error -> System.out.println(e.getNombre() + ": " + error));
            }
        });
    }
}

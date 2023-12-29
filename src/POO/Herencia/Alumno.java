package src.POO.Herencia;

public class Alumno extends Persona {

    private String formacion;
    private double notaProgramacion;
    private double notaInformatica;
    private double notaIngles;

    public Alumno() {
        super();
        System.out.println("Alumno: Inicializando alumno....");
    }

    public Alumno(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Alumno(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public Alumno(String nombre, String apellido, int edad, String formacion) {
        // super o this es lo mismo
        super(nombre, apellido, edad);
        this.formacion = formacion;
    }

    public Alumno(String nombre, String apellido, int edad, String formacion, double notaProgramacion,
            double notaInformatica, double notaIngles) {
        this(nombre, apellido, edad, formacion);
        this.notaProgramacion = notaProgramacion;
        this.notaInformatica = notaInformatica;
        this.notaIngles = notaIngles;
    }

    public String getFormacion() {
        return formacion;
    }

    public void setFormacion(String colegio) {
        this.formacion = colegio;
    }

    public double getNotaProgramacion() {
        return notaProgramacion;
    }

    public void setNotaProgramacion(double notaProgramacion) {
        this.notaProgramacion = notaProgramacion;
    }

    public double getNotaInformatica() {
        return notaInformatica;
    }

    public void setNotaInformatica(double notaInformatica) {
        this.notaInformatica = notaInformatica;
    }

    public double getNotaIngles() {
        return notaIngles;
    }

    public void setNotaIngles(double notaIngles) {
        this.notaIngles = notaIngles;
    }

    @Override
    public String saludar() {
        return "Hola soy un alumno y mi nombre es:" + this.getNombre();
    }

    @Override
    public String toString() {
        return super.toString()+"\nformacion=" + formacion + ", notaProgramacion=" + notaProgramacion + ", notaInformatica="
                + notaInformatica + ", notaIngles=" + notaIngles;
    }


}

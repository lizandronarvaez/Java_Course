package src.POO.Herencia;

public class AlumnoInternacional extends Alumno {

    private String pais;
    private double notaIdiomas;

    public AlumnoInternacional() {
        System.out.println("AlumnoInternacional: Inicializando AlumnoInternacional....");
    }

    public AlumnoInternacional(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public AlumnoInternacional(String nombre, String apellido, String pais) {
        super(nombre, apellido);
        this.pais = pais;
    }

    public AlumnoInternacional(String nombre, String apellido, String pais, double notaIdiomas) {
        super(nombre, apellido);
        this.notaIdiomas = notaIdiomas;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }

    @Override
    public String saludar() {
        return "Hola que tal soy un alumno internacional, mi nombre es: " + this.getNombre();
    }

}

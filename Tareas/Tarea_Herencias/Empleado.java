package Tareas.Tarea_Herencias;

public class Empleado extends Persona {
    private double remuneracion;
    private int empleadoId;

    public Empleado() {

    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }

    // Metodos
    public double aumentarRemuneracion(int porcentaje) {
        return (this.remuneracion * porcentaje);
    }

    @Override
    public String toString() {
        return super.toString() + "remuneracion=" + remuneracion + ", empleadoId=" + empleadoId;
    }

}

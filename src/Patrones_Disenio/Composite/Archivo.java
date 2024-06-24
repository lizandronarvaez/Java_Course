package Patrones_Disenio.Composite;

public class Archivo extends Componente {

    public Archivo(String nombre) {
        super(nombre);
    }

    @Override
    public String mostrar(int nivel) {

        return "\t".repeat(nivel)+ this.nombre;
    }

    @Override
    public boolean buscar(String nombre) {
        
        if (this.nombre.equalsIgnoreCase(nombre)) {
            return true;
        }
        return false;
    }

}

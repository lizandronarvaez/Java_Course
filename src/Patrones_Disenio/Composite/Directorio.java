package Patrones_Disenio.Composite;

import java.util.ArrayList;
import java.util.List;

public class Directorio extends Componente {

    private List<Componente> hijos;

    public Directorio(String nombre) {
        super(nombre);
        this.hijos = new ArrayList<>();
    }

    @Override
    public String mostrar(int nivel) {
        StringBuilder sb = new StringBuilder("\t".repeat(nivel));
        sb.append(nombre)
                .append("/")
                .append("\n");
        for (Componente componente : this.hijos) {
            sb.append(componente.mostrar(nivel + 1));
            if (componente instanceof Archivo) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public Directorio addComponente(Componente componente) {
        this.hijos.add(componente);
        return this;
    }

    public void removeComponente(Componente componente) {
        this.hijos.remove(componente);
    }

    @Override
    public boolean buscar(String nombre) {
        
        if (this.nombre.equalsIgnoreCase(nombre)) {
            return true;
        }
        // for (Componente componente : this.hijos) {
        //     if(componente.buscar(nombre)){
        //         return true;
        //     }
        // }
        return hijos.stream().anyMatch(item-> item.buscar(nombre));
    }
}

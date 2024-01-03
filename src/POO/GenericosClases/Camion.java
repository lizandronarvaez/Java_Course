package src.POO.GenericosClases;

import java.util.*;

public class Camion<T> implements Iterable<T> {

    private int maxList;
    private List<T> objetos;

    public Camion(int maxList) {
        this.maxList = maxList;
        this.objetos = new ArrayList<>();
    }

    public void addObject(T object) {
        if (this.objetos.size() <= maxList) {
            this.objetos.add(object);
        } else {
            throw new RuntimeException("No caben mas objectos");
        }
    }

    @Override
    public Iterator<T> iterator() {
        return this.objetos.iterator();
    }

}

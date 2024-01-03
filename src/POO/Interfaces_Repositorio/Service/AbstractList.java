package src.POO.Interfaces_Repositorio.Service;

import java.util.*;

import src.POO.Interfaces_Repositorio.Models.BaseEntity;
import src.POO.Interfaces_Repositorio.Repository.*;

public abstract class AbstractList<T extends BaseEntity> implements CrudOrdenablePaginable<T> {

    protected List<T> dataSource;

    public AbstractList() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<T> findAll() {
        return dataSource;
    }

    @Override
    public T findById(Integer id) {
        T isValid = null;
        for (T cliente : dataSource) {
            if (cliente.getId().equals(id)) {
                isValid = cliente;
                break;
            }
        }
        return isValid;
    }

    @Override
    public void create(T t) {
        this.dataSource.add(t);
    }

    @Override
    public void delete(Integer id) {
        this.dataSource.remove(id);
    }

    @Override
    public List<T> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }

    // Total clientes
    @Override
    public int total() {
        return this.dataSource.size();
    }
}

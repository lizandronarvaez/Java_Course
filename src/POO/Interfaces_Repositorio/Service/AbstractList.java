package src.POO.Interfaces_Repositorio.Service;

import java.util.*;

import src.POO.Interfaces_Repositorio.Models.BaseEntity;
import src.POO.Interfaces_Repositorio.Repository.*;
import src.POO.Interfaces_Repositorio.Service.Exceptions.*;

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
    public T findById(Integer id) throws NotFoundId, NotFoundInList {
        if (id == 0 || id == null) {
            throw new NotFoundId("El id introducido no es válido");
        }
        T isValid = null;
        for (T cliente : dataSource) {
            if (cliente.getId().equals(id)) {
                isValid = cliente;
                break;
            }
        }
        if (isValid == null) {
            throw new NotFoundInList("No existe el registro con el id: " + id);
        }
        return isValid;
    }

    @Override
    public void create(T t) throws ErrorCreate {
        if (t == null) {
            throw new ErrorCreate("Error al crear el registro");
        }
        if (this.dataSource.contains(t)) {
            throw new ErrorCreate("El registro que intenta crear ya existe");
        }
        this.dataSource.add(t);
    }

    @Override
    public void delete(Integer id) throws NotFoundInList, NotFoundId {
        var t = this.dataSource.remove(this.findById(id));
        if (t == false)
            throw new NotFoundInList("El ID introducido: " + id + " ya fue eliminado o no existe");
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

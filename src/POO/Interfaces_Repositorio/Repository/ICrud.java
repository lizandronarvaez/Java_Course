package src.POO.Interfaces_Repositorio.Repository;

import java.util.List;
import src.POO.Interfaces_Repositorio.Service.Exceptions.*;

public interface ICrud<T> {

    // Lista
    List<T> findAll();

    // Obtener uno
    T findById(Integer id) throws ExceptionsCrud;

    // Crea
    void create(T t) throws ErrorCreate;

    // edita
    void update(T t) throws ExceptionsCrud;

    // Elimina
    void delete(Integer id) throws ExceptionsCrud;
}

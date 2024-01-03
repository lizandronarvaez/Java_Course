package src.POO.Interfaces_Repositorio.Repository;

import java.util.List;

public interface ICrud<T> {

    // Lista
    List<T> findAll();

    // Obtener uno
    T findById(Integer id);

    // Crea
    void create(T t);

    // edita
    void update(T t);

    // Elimina
    void delete(Integer id);
}

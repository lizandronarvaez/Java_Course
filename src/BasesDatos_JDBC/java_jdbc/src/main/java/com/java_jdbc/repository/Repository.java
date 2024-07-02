package com.java_jdbc.repository;

import java.util.List;

public interface Repository<T> {

    List<T> listar();

    T porId(Long id);

    void guardar(T t);

    void eliminar(Integer id);


}

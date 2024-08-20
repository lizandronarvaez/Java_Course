package com.tarea_crud_jdbc.repository;

import java.util.List;

public interface Repositoy<T> {
    List<T> verTodosUsuarios();

    void crearUsuario(T t);

    void actualizarUsuario(Long id, T t);

    void eliminarUsuario(Long id);
}

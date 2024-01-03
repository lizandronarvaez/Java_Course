package src.POO.Interfaces_Repositorio.Repository;

import java.util.List;

import src.POO.Interfaces_Repositorio.Enum.Orden;

public interface IOrdenable<T> {

    List<T> listar(String campo, Orden orden);

}

package src.POO.Interfaces_Repositorio.Repository;

import java.util.List;

public interface IPaginable<T> {

    List<T> listar(int desde, int hasta);
}

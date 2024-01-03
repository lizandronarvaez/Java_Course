package src.POO.Interfaces_Repositorio.Repository;

public interface CrudOrdenablePaginable<T> extends ICrud<T>, IOrdenable<T>, IPaginable<T>, IClientesTotales {

}

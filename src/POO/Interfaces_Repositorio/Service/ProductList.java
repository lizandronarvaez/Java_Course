package src.POO.Interfaces_Repositorio.Service;

import java.util.*;
import src.POO.Interfaces_Repositorio.Enum.Orden;
import src.POO.Interfaces_Repositorio.Models.Product;
import src.POO.Interfaces_Repositorio.Service.Exceptions.NotFoundId;
import src.POO.Interfaces_Repositorio.Service.Exceptions.NotFoundInList;

public class ProductList extends AbstractList<Product> {

    @Override
    public void update(Product product) throws NotFoundId, NotFoundInList {
        Product pro = this.findById(product.getId());
        pro.setDescription(product.getDescription());
        pro.setPrice(product.getPrice());
    }

    @Override
    public List<Product> listar(String campo, Orden orden) {
        List<Product> listaOrdenada = new ArrayList<>(this.dataSource);

        listaOrdenada.sort((a, b) -> {
            int result = orden.equals(Orden.ASC)
                    ? ordenar(campo, a, b)
                    : ordenar(campo, b, a);
            return result;
        });
        return listaOrdenada;
    }

    // Static es un metodo que se puede acceder sin necesdad de usar this
    private static int ordenar(String campo, Product a, Product b) {
        int result = 0;
        switch (campo) {
            case "id" -> result = a.getId().compareTo(b.getId());
            case "description" -> result = a.getDescription().compareTo(b.getDescription());
            case "price" -> result = a.getPrice().compareTo(b.getPrice());
        }
        return result;
    }
}

package src.POO.Interfaces_Repositorio.Service;

import java.util.*;
import src.POO.Interfaces_Repositorio.Enum.Orden;
import src.POO.Interfaces_Repositorio.Models.Client;

public class ClientList extends AbstractList<Client> {

    @Override
    public void update(Client cliente) {
        Client isValid = this.findById(cliente.getId());
        isValid.setName(cliente.getName());
        isValid.setLastName(cliente.getLastName());

    }

    @Override
    public List<Client> listar(String campo, Orden orden) {
        List<Client> listaOrdenada = new ArrayList<>(this.dataSource);

        listaOrdenada.sort((a, b) -> {
            int result = orden.equals(Orden.ASC)
                    ? ordenar(campo, a, b)
                    : ordenar(campo, b, a);
            return result;
        });
        return listaOrdenada;
    }

    // Static es un metodo que se puede acceder sin necesdad de usar this
    private static int ordenar(String campo, Client a, Client b) {
        int result = 0;
        switch (campo) {
            case "id" -> result = a.getId().compareTo(b.getId());
            case "nombre" -> result = a.getName().compareTo(b.getName());
            case "apellido" -> result = a.getLastName().compareTo(b.getLastName());
        }
        return result;
    }
}

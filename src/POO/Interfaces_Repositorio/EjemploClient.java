package src.POO.Interfaces_Repositorio;

import java.util.List;

import src.POO.Interfaces_Repositorio.Enum.Orden;
import src.POO.Interfaces_Repositorio.Models.Client;
import src.POO.Interfaces_Repositorio.Repository.*;
import src.POO.Interfaces_Repositorio.Service.ClientList;
import src.POO.Interfaces_Repositorio.Service.Exceptions.ErrorCreate;
import src.POO.Interfaces_Repositorio.Service.Exceptions.NotFoundId;
import src.POO.Interfaces_Repositorio.Service.Exceptions.NotFoundInList;

public class EjemploClient {
    public static void main(String[] args) {

        try {

            // Crear clientes
            CrudOrdenablePaginable<Client> clientRepositorio = new ClientList();
            clientRepositorio.create(new Client("Lizan", "Narvaez"));
            clientRepositorio.create(new Client("Marina", "Guillen"));
            Client client = new Client("Lucia", "Fernandez");
            clientRepositorio.create(client);
            clientRepositorio.create(client);

            // ver usuarios
            System.out.println();
            List<Client> clientes = clientRepositorio.findAll();
            clientes.forEach(cliente -> System.out.println(cliente));

            // paginable
            System.out.println();
            System.out.println("*****PAGINABLE*****");
            System.out.println();
            List<Client> paginable = clientRepositorio.listar(0, 3);
            paginable.forEach(cliente -> System.out.println(cliente));

            // Ordernar clientes
            System.out.println();
            System.out.println("*****ORDENAR CAMPOS*****");
            List<Client> ordenar = clientRepositorio.listar("nombre", Orden.DESC);
            for (Client cliente2 : ordenar) {
                System.out.println(cliente2);
            }

            // ver un cliente
            System.out.println();
            System.out.println("*****BUSCAR UN CLIENTE*****");
            Client cliente = clientRepositorio.findById(4);
            System.out.println(cliente);

            // Editar cliente
            System.out.println();
            System.out.println("*****ACTUALIZAR UN CLIENTE*****");
            Client updateCliente = new Client("Lucia", "Romero");
            updateCliente.setId(3);
            clientRepositorio.update(updateCliente);
            Client newCliente = clientRepositorio.findById(3);
            System.out.println(newCliente);

            // Eliminar cliente
            System.out.println();
            System.out.println("*****ELIMINAR UN CLIENTE*****");
            clientRepositorio.delete(3);
            for (Client cliente2 : clientes) {
                System.out.println(cliente2);
            }

            // Total clientes
            System.out.println();
            System.out.println("*****CLIENTES TOTALES*****");
            System.out.println("Total clientes:" + clientRepositorio.total());
        } catch (Exception e) {
            if (e instanceof NotFoundId) {
                System.out.println(e.getMessage());
            }
            if (e instanceof NotFoundInList) {
                System.out.println(e.getMessage());
            }
            if (e instanceof ErrorCreate) {
                System.out.println(e.getMessage());
            }
        }
    }
}

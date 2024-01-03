package src.POO.Interfaces_Repositorio;

import java.util.List;
import src.POO.Interfaces_Repositorio.Enum.Orden;
import src.POO.Interfaces_Repositorio.Models.Product;
import src.POO.Interfaces_Repositorio.Repository.CrudOrdenablePaginable;
import src.POO.Interfaces_Repositorio.Service.ProductList;

public class EjemploProduct {

    public static void main(String[] args) {
        CrudOrdenablePaginable<Product> productRepository = new ProductList();

        try {

            productRepository.create(new Product("Cable usb carga mando", 4.99));
            productRepository.create(new Product("Tarjeta Regalo", 20.99));
            productRepository.create(new Product("Pack Ps5", 599.99));

            // ver usuarios
            System.out.println();
            List<Product> products = productRepository.findAll();
            products.forEach(product -> System.out.println(product));

            // paginable
            System.out.println();
            System.out.println("*****PAGINABLE*****");
            System.out.println();
            List<Product> paginable = productRepository.listar(0, 3);
            paginable.forEach(product -> System.out.println(product));

            // Ordernar products
            System.out.println();
            System.out.println("*****ORDENAR CAMPOS*****");
            List<Product> ordenar = productRepository.listar("description", Orden.DESC);
            for (Product product2 : ordenar) {
                System.out.println(product2);
            }

            // ver un product
            System.out.println();
            System.out.println("*****BUSCAR UN PRODUCTO*****");
            Product product = productRepository.findById(2);
            System.out.println(product);

            // Editar product
            System.out.println();
            System.out.println("*****ACTUALIZAR UN PRODUCTO*****");
            Product updateProduct = new Product("Cable Usb", 3.99);
            updateProduct.setId(1);
            productRepository.update(updateProduct);
            Product newProduct = productRepository.findById(1);
            System.out.println(newProduct);

            // Eliminar product
            System.out.println();
            System.out.println("*****ELIMINAR UN PRODUCTO*****");
            productRepository.delete(2);
            for (Product product2 : products) {
                System.out.println(product2);
            }

            // Total products
            System.out.println();
            System.out.println("*****PRODUCTOS TOTALES*****");
            System.out.println("Total products:" + productRepository.total());

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

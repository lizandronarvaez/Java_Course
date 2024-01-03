package src.POO.Interfaces_Repositorio.Models;

public class Product extends BaseEntity {

    private String description;
    private Double price;

    public Product(String description, Double price) {
        super();
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(this.id)
                .append("\tDescripción: ").append(this.description)
                .append("\tPrecio: ").append(this.price);

        return sb.toString();
    }

}

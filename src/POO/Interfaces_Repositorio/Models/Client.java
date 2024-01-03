package src.POO.Interfaces_Repositorio.Models;

public class Client extends BaseEntity{

    private String name;
    private String lastName;

    public Client(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(this.id)
                .append("\tNombre: ").append(this.name)
                .append("\tApellido: ").append(this.lastName);

        return sb.toString();
    }
    

}

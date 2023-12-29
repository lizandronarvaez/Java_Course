package src.Tareas.Tarea_Herencias;

public class Cliente extends Persona {
    private int clienteId;

    public Cliente() {

    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    @Override
    public String toString() {
        return super.toString() + "clienteId=" + clienteId;
    }

}

public class Cocinero extends Empleado {
    public Cocinero(int id, String nombre) {
        super(id, nombre, "Cocinero");
    }
    public void prepararPedido(Pedido ped) {
        ped.actualizarEstado(EstadoPedido.COCINANDOSE);
        System.out.println("Cocinero " + nombre + " está preparando el pedido " + ped.getIdPedido());
    }
}
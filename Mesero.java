public class Mesero extends Empleado {
    public Mesero(int id, String nombre) {
        super(id, nombre, "Mesero");
    }
    public void asignarMesa(Mesa mesa) {
        if (mesa.getEstado() == EstadoMesa.LIBRE) {
            mesa.ocupar();
            System.out.println("Mesa " + mesa.getNumeroMesa() + " asignada por " + nombre);
        } else {
            System.out.println("Error: La mesa " + mesa.getNumeroMesa() + " ya está ocupada.");
        }
    }
    public void tomarPedido(Pedido ped) {
        ped.actualizarEstado(EstadoPedido.RECIBIDO);
        System.out.println("Mesero " + nombre + " tomó el pedido " + ped.getIdPedido());
    }
}
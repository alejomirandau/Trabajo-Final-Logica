public class Cliente {
    private int idCliente;
    private String telefono;
    private String nombre;

    public Cliente(int idCliente, String nombre, String telefono) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    public void hacerReserva(Mesa mesa) {
        System.out.println("Cliente " + nombre + " intenta reservar la mesa " + mesa.getNumeroMesa());
        if (mesa.getEstado() == EstadoMesa.LIBRE) {
            mesa.ocupar();
            System.out.println("Reserva exitosa para " + nombre);
        } else {
            System.out.println("Lo sentimos " + nombre + ", la mesa ya está ocupada.");
        }
    }
    public void pedirCuenta() { 
        System.out.println("El cliente " + nombre + " pidió la cuenta."); 
    }
}
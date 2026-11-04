public class MainPruebas {
    public static void main(String[] args) {
        System.out.println("=== INICIANDO PRUEBAS DEL SISTEMA ===");
        
        
        Mesa mesa1 = new Mesa(1, 4);
        Cliente cliente1 = new Cliente(101, "Alejandro", "3001234567");
        cliente1.hacerReserva(mesa1); // Éxito
        
        Cliente cliente2 = new Cliente(102, "Mafe", "3109876543");
        cliente2.hacerReserva(mesa1); // Falla porque ya está ocupada
        
        
        Mesero mesero1 = new Mesero(1, "Daniel");
        Cocinero cocinero1 = new Cocinero(2, "Luis");
        
        
        Plato p1 = new Plato(1, "Bandeja Paisa", 25000f, "Plato Fuerte");
        Plato p2 = new Plato(2, "Juguito hit", 5000f, "Bebidas");
        
        
        ConexionH2.guardarPlato(p1);
        
        Pedido pedido1 = new Pedido(1001);
        pedido1.agregarPlato(p1);
        pedido1.agregarPlato(p2);
        
        mesero1.tomarPedido(pedido1);
        cocinero1.prepararPedido(pedido1);
        
        
        cliente1.pedirCuenta();
        Factura factura = new Factura(5001, pedido1, "Tarjeta Débito");
        factura.generarFactura();
        factura.procesarPago();
        
        System.out.println("Fin de las pruebas");
    }
}
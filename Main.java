import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("== Sistema ==");

        //Mesero
        System.out.print("Ingrese la Cédula del mesero: ");
        int idMesero = teclado.nextInt();
        teclado.nextLine(); 
        System.out.print("Ingrese el nombre del mesero: ");
        String nombreMesero = teclado.nextLine();
        
        Mesero mesero = new Mesero(idMesero, nombreMesero);
        mesero.iniciarTurno();

        //Cocinero
        System.out.print("Ingrese la Cédula del cocinero: ");
        int idCocinero = teclado.nextInt();
        teclado.nextLine(); 
        System.out.print("Ingrese el nombre del cocinero: ");
        String nombreCocinero = teclado.nextLine();
        
        Cocinero cocinero = new Cocinero(idCocinero, nombreCocinero);
        cocinero.iniciarTurno();
        System.out.println("---------------------------------------------------");

        //Mesa
        System.out.print("Ingrese el número de la mesa a asignar: ");
        int numeroMesa = teclado.nextInt();
        teclado.nextLine(); 
        System.out.print("Ingrese la capacidad de la mesa: ");
        int capacidadMesa = teclado.nextInt();
        teclado.nextLine(); 
        
        Mesa mesa = new Mesa(numeroMesa, capacidadMesa);
        mesero.asignarMesa(mesa);
        System.out.println("---------------------------------------------------");

        //Cliente
        System.out.println("== Cliente ==");
        System.out.print("Ingrese la C.C o T.I del cliente: ");
        int idCliente = teclado.nextInt();
        teclado.nextLine(); 
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = teclado.nextLine();
        System.out.print("Ingrese el teléfono del cliente: ");
        String telefonoCliente = teclado.nextLine();
        
        Cliente cliente = new Cliente(idCliente, nombreCliente, telefonoCliente);
        cliente.hacerReserva(mesa);
        System.out.println("---------------------------------------------------");

        //Plato
        System.out.println("== Pedido ==");
        System.out.print("Ingrese el ID del plato: ");
        int idPlato = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Ingrese el nombre del plato a pedir: ");
        String nombrePlato = teclado.nextLine();
        System.out.print("Ingrese el precio del plato: ");
        float precioPlato = teclado.nextFloat();
        teclado.nextLine(); 
        System.out.print("Ingrese la categoría del plato: ");
        String categoriaPlato = teclado.nextLine();

        Plato plato = new Plato(idPlato, nombrePlato, precioPlato, categoriaPlato);
        System.out.println("Detalles: " + plato.obtenerDetalles());

        Pedido pedido = new Pedido(5001);
        mesero.tomarPedido(pedido);
        pedido.agregarPlato(plato);
        System.out.println("Subtotal del pedido: $" + pedido.calcularSubtotal());

        cocinero.prepararPedido(pedido);
        pedido.actualizarEstado(EstadoPedido.ENTREGADO);
        System.out.println("---------------------------------------------------");

        //Facturación
        System.out.println("== Facturación ==");
        cliente.pedirCuenta();
        
        System.out.print("Ingrese el método de pago: ");
        String metodoPago = teclado.nextLine();
        
        Factura factura = new Factura(9001, pedido, metodoPago);
        factura.generarFactura();
        factura.procesarPago();
        System.out.println("---------------------------------------------------");

        //Cierre
        mesa.liberar();
        mesero.finTurno();
        cocinero.finTurno();
        System.out.println("== Finalizado ==");
        
        teclado.close();
    }
}
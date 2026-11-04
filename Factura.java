public class Factura {
    private int idFactura;
    private float impuestos;
    private float total;
    private String metodoPago;

    public Factura(int idFactura, Pedido pedido, String metodoPago) {
        this.idFactura = idFactura;
        float subtotal = pedido.calcularSubtotal();
        this.impuestos = subtotal * 0.19f; // IVA del 19% como ejemplo en Colombia
        this.total = subtotal + this.impuestos;
        this.metodoPago = metodoPago;
    }
    public void generarFactura() {
        System.out.println("\n--- FACTURA #" + idFactura + " ---");
        System.out.println("Subtotal: $" + (total - impuestos));
        System.out.println("Impuestos (IVA): $" + impuestos);
        System.out.println("Total a pagar: $" + total);
        System.out.println("Método de pago: " + metodoPago);
        System.out.println("------------------------\n");
    }
    public void procesarPago() {
        System.out.println("Pago por $" + total + " procesado correctamente usando " + metodoPago);
    }
}
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private int idPedido;
    private Date fechaHora;
    private EstadoPedido estado;
    private List<Plato> platos;

    public Pedido(int idPedido) {
        this.idPedido = idPedido;
        this.fechaHora = new Date();
        this.estado = EstadoPedido.RECIBIDO;
        this.platos = new ArrayList<>();
    }
    public int getIdPedido() { return idPedido; }
    public void agregarPlato(Plato plato) {
        platos.add(plato);
    }
    public float calcularSubtotal() {
        float total = 0;
        for (Plato p : platos) {
            total += p.getPrecio();
        }
        return total;
    }
    public void actualizarEstado(EstadoPedido nuevoEstado) {
        this.estado = nuevoEstado;
    }
}
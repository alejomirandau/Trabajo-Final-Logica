public class Plato {
    private int idPlato;
    private float precio;
    private String nombre;
    private String categoria;

    public Plato(int idPlato, String nombre, float precio, String categoria) {
        this.idPlato = idPlato;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }
    public float getPrecio() { return precio; }
    public String obtenerDetalles() { return nombre + " - $" + precio; }
}
public class Mesa {
    private int numeroMesa;
    private int capacidad;
    private EstadoMesa estado;

    public Mesa(int numeroMesa, int capacidad) {
        this.numeroMesa = numeroMesa;
        this.capacidad = capacidad;
        this.estado = EstadoMesa.LIBRE;
    }
    public int getNumeroMesa() { return numeroMesa; }
    public EstadoMesa getEstado() { return estado; }
    public void ocupar() { this.estado = EstadoMesa.OCUPADA; }
    public void liberar() { this.estado = EstadoMesa.LIBRE; }
}
public class Empleado {
    protected int idEmpleado;
    protected String nombre;
    protected String rol;

    public Empleado(int idEmpleado, String nombre, String rol) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.rol = rol;
    }
    public void iniciarTurno() { System.out.println(nombre + " inició turno."); }
    public void finTurno() { System.out.println(nombre + " finalizó turno."); }
}
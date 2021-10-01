package Clases;

public class Cliente {

    private int cedulaCli;
    private String nombre;
    Direccion direccion;

    public Cliente() {
        this.cedulaCli = 0;
        this.nombre = "";
        this.direccion = new Direccion();
    }

    public Cliente(int cedulaCli, String nombre, Direccion direccion) {
        this.cedulaCli = cedulaCli;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public int getCedulaCli() {
        return cedulaCli;
    }

    public void setCedulaCli(int cedulaCli) {
        this.cedulaCli = cedulaCli;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cedulaCli=" + cedulaCli +
                ", nombre='" + nombre + '\'' +
                ", direccion=" + direccion +
                '}';
    }
}

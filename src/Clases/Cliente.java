package Clases;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlID;

@XmlAccessorType(XmlAccessType.FIELD)
public class Cliente {

    @XmlID
    private String cedulaCli;
    private String nombre;
    Direccion direccion;

    public Cliente() {
        this.cedulaCli = "";
        this.nombre = "";
        this.direccion = new Direccion();
    }

    public Cliente(String cedulaCli, String nombre, Direccion direccion) {
        this.cedulaCli = cedulaCli;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getCedulaCli() {
        return cedulaCli;
    }

    public void setCedulaCli(String cedulaCli) {
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

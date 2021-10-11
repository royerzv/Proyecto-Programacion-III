package Clases;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;

@XmlAccessorType(XmlAccessType.FIELD)
public class Cliente {

    @XmlID
    private String cedula;
    private String nombre;
    Provincia provincia;
    Canton canton;
    Distrito distrito;
    //Direccion direccion;

    public Cliente() {
        this.cedula = "";
        this.nombre = "";
        this.provincia = new Provincia();
        this.canton = new Canton();
        this.distrito = new Distrito();
        //this.direccion = new Direccion();
    }

    public Cliente(String cedulaCli, String nombre, Provincia provincia, Canton canton, Distrito distrito) {
        this.cedula = cedulaCli;
        this.nombre = nombre;
        this.provincia = provincia;
        this.canton = canton;
        this.distrito = distrito;
        //this.direccion = direccion;
    }

    public String getCedulaCli() {
        return cedula;
    }

    public void setCedulaCli(String cedulaCli) {
        this.cedula = cedulaCli;
    }

    public String getNombreCli() {
        return nombre;
    }

    public void setNombreCli(String nombre) {
        this.nombre = nombre;
    }

    public Provincia getProvinciaCli() {
        return provincia;
    }

    public void setProvinciaCli(Provincia provincia) {
        this.provincia = provincia;
    }

    public Canton getCantonCli() {
        return canton;
    }

    public void setCantonCli(Canton canton) {
        this.canton = canton;
    }

    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }

    /*public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }*/
/*
    @Override
    public String toString() {
        return "Cliente{" +
                "cedulaCli=" + cedulaCli +
                ", nombre='" + nombre + '\'' +
                ", direccion=" + direccion +
                '}';
    }*/
}

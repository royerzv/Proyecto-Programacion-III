package Clases;

import jakarta.xml.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
public class Provincia {

    @XmlID
    private String numero;
    private String nombre;
    @XmlIDREF
    List<Canton> cantones;

    public Provincia() {
        this.numero = "";
        this.nombre = "";
        this.cantones = new ArrayList<>();
    }

    public Provincia(String numero, String nombre, List<Canton> cantones) {
        this.numero = numero;
        this.nombre = nombre;
        this.cantones = cantones;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Canton> getCantones() {
        return cantones;
    }

    public void setCantones(List<Canton> cantones) {
        this.cantones = cantones;
    }

    @Override
    public String toString() {
        return nombre ;
    }
}

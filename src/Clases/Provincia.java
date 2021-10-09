package Clases;

import jakarta.xml.bind.annotation.*;


import java.util.List;

@XmlRootElement
public class Provincia {

    private String numero;
    private String nombre;
    List<Canton> cantones;

    @XmlElement
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @XmlAttribute
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
}

package Clases;

import java.util.ArrayList;
import java.util.List;

public class Canton {

    private String numero;
    private String nombre;
    List<Distrito> distritos;

    public Canton() {
        this.numero = "";
        this.nombre = "";
        this.distritos = new ArrayList<>();
    }

    public Canton(String numero, String nombre, List<Distrito> distritos) {
        this.numero = numero;
        this.nombre = nombre;
        this.distritos = distritos;
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

    public List<Distrito> getDistritos() {
        return distritos;
    }

    public void setDistritos(List<Distrito> distritos) {
        this.distritos = distritos;
    }
}

package Clases;

public class Distrito {

    private String numero;
    private String nombre;

    public Distrito() {
        this.numero = "";
        this.nombre = "";
    }

    public Distrito(String numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
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
}

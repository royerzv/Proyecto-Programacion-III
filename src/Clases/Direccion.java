package Clases;

public class Direccion {

    Provincia provincia;
    Canton canton;
    Distrito distrito;

    public Direccion() {
        this.provincia = new Provincia();
        this.canton = new Canton();
        this.distrito = new Distrito();
    }

    public Direccion(Provincia provincia, Canton canton, Distrito distrito) {
        this.provincia = provincia;
        this.canton = canton;
        this.distrito = distrito;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public Canton getCanton() {
        return canton;
    }

    public void setCanton(Canton canton) {
        this.canton = canton;
    }

    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }
}

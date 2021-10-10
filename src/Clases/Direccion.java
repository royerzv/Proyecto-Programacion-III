package Clases;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlIDREF;

@XmlAccessorType(XmlAccessType.FIELD)
public class Direccion {

    @XmlIDREF
    Provincia provincia;
    @XmlIDREF
    Canton canton;
    @XmlIDREF
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

    @Override
    public String toString() {
        return "Direccion{" +
                "provincia=" + provincia +
                ", canton=" + canton +
                ", distrito=" + distrito +
                '}';
    }
}

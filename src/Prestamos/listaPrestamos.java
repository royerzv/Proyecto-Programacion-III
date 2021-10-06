package Prestamos;

import Clases.Prestamo;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "prestamos")
@XmlAccessorType(XmlAccessType.PROPERTY)

public class listaPrestamos {
    List<Prestamo> listaPrestamos;

    public listaPrestamos(){
        listaPrestamos = new ArrayList<>();
    }

    public void add(Prestamo prestamo){
        listaPrestamos.add(prestamo);
    }

    public listaPrestamos(List<Prestamo> listaPrestamos){
        this.listaPrestamos = listaPrestamos;
    }

    @XmlElement(name = "prestamo")
    public List<Prestamo> getListaPrestamos(){
        return listaPrestamos;
    }

    public void setListaPrestamos(List<Prestamo> listaPrestamos){
        this.listaPrestamos = listaPrestamos;
    }
}

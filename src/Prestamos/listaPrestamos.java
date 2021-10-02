package Prestamos;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "prestamos")
@XmlAccessorType(XmlAccessType.PROPERTY)

public class listaPrestamos {
    List<modeloPrestamos> listaPrestamos;

    public listaPrestamos(){
        listaPrestamos = new ArrayList<>();
    }

    public void add(modeloPrestamos prestamo){
        listaPrestamos.add(prestamo);
    }

    public listaPrestamos(List<modeloPrestamos> listaPrestamos){
        this.listaPrestamos = listaPrestamos;
    }

    @XmlElement(name = "prestamo")
    public List<modeloPrestamos> getListaPrestamos(){
        return listaPrestamos;
    }

    public void setListaPrestamos(List<modeloPrestamos> listaPrestamos){
        this.listaPrestamos = listaPrestamos;
    }
}

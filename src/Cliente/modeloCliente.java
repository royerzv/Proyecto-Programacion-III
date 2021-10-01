package Cliente;

import Clases.*;

import java.util.List;

public class modeloCliente {

    Cliente cliente;
    Provincia provincia;
    List<Provincia> listaProvincias;
    Direccion direccion;
    List<Direccion> listaDirecciones;
    Canton canton;
    List<Canton> listaCantones;
    Distrito distrito;
    List<Distrito> listaDistritos;

    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }

    public List<Distrito> getListaDistritos() {
        return listaDistritos;
    }

    public void setListaDistritos(List<Distrito> listaDistritos) {
        this.listaDistritos = listaDistritos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public List<Provincia> getListaProvincias() {
        return listaProvincias;
    }

    public void setListaProvincias(List<Provincia> listaProvincias) {
        this.listaProvincias = listaProvincias;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public List<Direccion> getListaDirecciones() {
        return listaDirecciones;
    }

    public void setListaDirecciones(List<Direccion> listaDirecciones) {
        this.listaDirecciones = listaDirecciones;
    }

    public Canton getCanton() {
        return canton;
    }

    public void setCanton(Canton canton) {
        this.canton = canton;
    }

    public List<Canton> getListaCantones() {
        return listaCantones;
    }

    public void setListaCantones(List<Canton> listaCantones) {
        this.listaCantones = listaCantones;
    }

    @Override
    public String toString() {
        return "modeloCliente{" +
                "cliente=" + cliente +
                ", provincia=" + provincia +
                ", listaProvincias=" + listaProvincias +
                ", direccion=" + direccion +
                ", listaDirecciones=" + listaDirecciones +
                ", canton=" + canton +
                ", listaCantones=" + listaCantones +
                ", distrito=" + distrito +
                ", listaDistritos=" + listaDistritos +
                '}';
    }
}

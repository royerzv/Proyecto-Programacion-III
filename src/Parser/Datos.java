package Parser;

import Clases.Canton;
import Clases.Cliente;
import Clases.Distrito;
import Clases.Provincia;

import java.util.ArrayList;

public class Datos {

    private ArrayList<Cliente> clientes;
    private ArrayList<Provincia> provincias;
    private ArrayList<Canton> cantones;
    private ArrayList<Distrito> distritos;

    public Datos() {
        clientes =  new ArrayList<>();
        provincias = new ArrayList<>();
        cantones = new ArrayList<>();
        distritos = new ArrayList<>();
    }

    public ArrayList<Cliente> getClientes(){
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(ArrayList<Provincia> provincias) {
        this.provincias = provincias;
    }

    public ArrayList<Canton> getCantones() {
        return cantones;
    }

    public void setCantones(ArrayList<Canton> cantones) {
        this.cantones = cantones;
    }

    public ArrayList<Distrito> getDistritos() {
        return distritos;
    }

    public void setDistritos(ArrayList<Distrito> distritos) {
        this.distritos = distritos;
    }
}



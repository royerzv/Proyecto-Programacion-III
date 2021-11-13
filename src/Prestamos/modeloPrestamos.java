package Prestamos;

import Clases.Cliente;
import Clases.Prestamo;

import java.util.List;

public class modeloPrestamos {

    private Prestamo prestamo;
    private List<Prestamo> listaPrestamos;
    private Cliente cliente;

    public modeloPrestamos(double monto, double tasaDeInteres, double plazo, Cliente cliente) {

        this.cliente = cliente;
    }

    public modeloPrestamos(){
        //this.monto = 0;
        //this.tasaDeInteres = 0;
        //this.plazo = 0;
        this.cliente = null;
    }


    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public List<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(List<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double calculoCuota() {
        return (prestamo.getMonto() * prestamo.getTasaDeInteres()) / (1 - Math.pow((1 + prestamo.getTasaDeInteres()), -prestamo.getPlazo()));
    }


}

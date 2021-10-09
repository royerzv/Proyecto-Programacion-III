package Prestamos;

import Clases.Prestamo;
import ClienteP.vistaCliente;

import java.util.List;

public class modeloPrestamos {
    //private double monto;
    //private double tasaDeInteres;
    //private double plazo;
    private Prestamo prestamo;
    private List<Prestamo> listaPrestamos;
    private vistaCliente cliente;

    public modeloPrestamos(double monto, double tasaDeInteres, double plazo, vistaCliente cliente) {
        //this.monto = monto;
        //this.tasaDeInteres = tasaDeInteres;
        //this.plazo = plazo;
        this.cliente = cliente;
    }

    public modeloPrestamos(){
        //this.monto = 0;
        //this.tasaDeInteres = 0;
        //this.plazo = 0;
        this.cliente = null;
    }
/*
    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getTasaDeInteres() {
        return tasaDeInteres;
    }

    public void setTasaDeInteres(double tasaDeInteres) {
        this.tasaDeInteres = tasaDeInteres;
    }

    public double getPlazo() {
        return plazo;
    }

    public void setPlazo(double plazo) {
        this.plazo = plazo;
    }
*/

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

    public vistaCliente getCliente() {
        return cliente;
    }

    public void setCliente(vistaCliente cliente) {
        this.cliente = cliente;
    }

    public double calculoCuota() {
        return (prestamo.getMonto() * prestamo.getTasaDeInteres()) / (1 - Math.pow((1 + prestamo.getTasaDeInteres()), -prestamo.getPlazo()));
    }


}

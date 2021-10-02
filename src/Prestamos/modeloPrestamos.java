package Prestamos;

import Cliente.vistaCliente;

public class modeloPrestamos {
    private double monto;
    private double tasaDeInteres;
    private double plazo;
    private vistaCliente cliente;

    public modeloPrestamos(double monto, double tasaDeInteres, double plazo, vistaCliente cliente) {
        this.monto = monto;
        this.tasaDeInteres = tasaDeInteres;
        this.plazo = plazo;
        this.cliente = cliente;
    }

    public modeloPrestamos(){
        this.monto = 0;
        this.tasaDeInteres = 0;
        this.plazo = 0;
        this.cliente = null;
    }

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

    public double calculoCuota() {
        return (monto * tasaDeInteres) / (1 - Math.pow((1 + tasaDeInteres), -plazo));
    }
}

package Clases;

public class Prestamo {

    private Cliente cliente;
    private String identificardorPrestamo;
    private double monto;
    private double tasaDeInteres;
    private double plazo;


    public Prestamo() {
        this.identificardorPrestamo = " ";
        this.monto = 0;
        this.tasaDeInteres = 0;
        this.plazo = 0;
        this.cliente = null;
    }

    public Prestamo(String identificardorPrestamo, double monto, double tasaDeInteres, double plazo, Cliente cliente) {
        this.identificardorPrestamo = identificardorPrestamo;
        this.monto = monto;
        this.tasaDeInteres = tasaDeInteres;
        this.plazo = plazo;
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getIdentificardorPrestamo() {
        return identificardorPrestamo;
    }

    public void setIdentificardorPrestamo(String identificardorPrestamo) {
        this.identificardorPrestamo = identificardorPrestamo;
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

    @Override
    public String toString() {
        return "Prestamos{" +
                "identificardorPrestamo='" + identificardorPrestamo + '\'' +
                ", monto=" + monto +
                ", tasaDeInteres=" + tasaDeInteres +
                ", plazo=" + plazo +
                '}';
    }
}

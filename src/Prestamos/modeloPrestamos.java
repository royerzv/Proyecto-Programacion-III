package Prestamos;

public class modeloPrestamos {
    private double monto;
    private double tasaDeInteres;
    private double plazo;

    public modeloPrestamos(double monto, double tasaDeInteres, double plazo) {
        this.monto = monto;
        this.tasaDeInteres = tasaDeInteres;
        this.plazo = plazo;
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

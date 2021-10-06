package Prestamos;

import Clases.Prestamo;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class tableModel extends AbstractTableModel {
    //private List<modeloPrestamos> filas;
    private List<Prestamo> filas;
    private String column[]={"Monto", "Tasa de Interes", "Plazo", "Cuota"};

    public tableModel(List<Prestamo> filas){
        this.filas = filas;
    }

    @Override
    public int getRowCount() {
        return filas.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //modeloPrestamos prestamo = filas.get(rowIndex);
        Prestamo prestamo = filas.get(rowIndex);
        switch(columnIndex){
            case 0: return prestamo.getMonto();
            case 1: return prestamo.getTasaDeInteres();
            case 2: return prestamo.getPlazo();
            //case 3: return prestamo;
            default: return null;
        }
    }

    @Override
    public String getColumnName(int col){return column[col];}
}
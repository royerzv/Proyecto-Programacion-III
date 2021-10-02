package Prestamos;

import Cliente.vistaCliente;
import Parser.JAXBParser;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionListener;

public class vistaPrestamos extends JFrame {
    JPanel total = new JPanel(new BorderLayout());
    JPanel sur = new JPanel(new FlowLayout());
    JPanel norte = new JPanel(new FlowLayout());
    JPanel centro = new JPanel(new FlowLayout());

    JButton bRegresar = new JButton("Regresar");
    JButton bAgregar = new JButton("Agregar");

    public void addListenner(ActionListener al){
        bRegresar.addActionListener(al);
        bAgregar.addActionListener(al);
    }

    public vistaPrestamos() throws HeadlessException{
        super("Prestamos");
        setSize(600, 600);
        addComponents(getContentPane());
        setVisible(true);
    }

    private void addComponents(Container contentPane){
        ButtonGroup group = new ButtonGroup();

        bRegresar.setActionCommand("1");
        bAgregar.setActionCommand("2");

        group.add(bRegresar);
        group.add(bAgregar);

        sur.add(bRegresar);

        total.add(sur, BorderLayout.SOUTH);
        total.add(centro, BorderLayout.CENTER);
        contentPane.add(total);

        JTable jtLista = tablaLista();
        jtLista.setBounds(30,40,200,200);
        JScrollPane sp = new JScrollPane(jtLista);
        agregaTabla(sp);
    }

    private JTable tablaLista(){
        listaPrestamos listPrestamos = new listaPrestamos();

        JAXBParser parser = new JAXBParser();
        parser.marshall(listPrestamos, "prestamos.xml");

        JTable tabla = new JTable();
        tabla.setModel(new tableModel(listPrestamos.getListaPrestamos()));
        return tabla;
    }

    public void agregaTabla(JScrollPane sp){
        if(centro.getComponentCount() > 0){
            centro.remove(0);
        }
        centro.add(sp);
        centro.validate();
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new controladorPrestamos();
            }
        });
    }
}

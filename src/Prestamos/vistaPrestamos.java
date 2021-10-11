package Prestamos;

import Parser.JAXBParser;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class vistaPrestamos extends JFrame {
    JPanel total = new JPanel(new BorderLayout());
    JPanel sur = new JPanel(new FlowLayout());
    JPanel norte = new JPanel(new BorderLayout());
    JPanel centro = new JPanel(new FlowLayout());

    JButton bRegresar = new JButton("Regresar");
    JButton bAgregar = new JButton("Agregar");

    //JTextField nombreTxtField = new JTextField();

    JLabel nombreClienteLabel = new JLabel("");
    JLabel nombreLabel = new JLabel("Nombre: ");
    JLabel idPrestamo = new JLabel("Identificador: ");
    JLabel montoPrestamo = new JLabel("Monto Prestamo: ");
    JLabel plazoPrestamo = new JLabel("Plazo: ");
    JLabel tasaInteres = new JLabel("Tasa Interes del 3% ");


    JTextField idPrestamoTxt = new JTextField();
    JTextField montoPrestamoTxt = new JTextField();
    JTextField plazoPrestamoTxt = new JTextField();


    public String getidPrestamoTxt() {return idPrestamoTxt.getText();}
    public String getmontoPrestamoTxt() {return montoPrestamoTxt.getText();}
    public String getplazoPrestamoTxt() {return plazoPrestamoTxt.getText();}


    public void setClienteNombre(String nombre){
        nombreClienteLabel.setText(nombre);
    }

    public void addListenner(ActionListener al){
        bRegresar.addActionListener(al);
        bAgregar.addActionListener(al);
    }

    public vistaPrestamos() throws HeadlessException{
        super("Prestamos");
        setSize(600, 500);
        addComponents(getContentPane());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setVisible(true);
    }

    private void addComponents(Container contentPane){
        ButtonGroup group = new ButtonGroup();

        bRegresar.setActionCommand("1");
        bAgregar.setActionCommand("2");

        group.add(bRegresar);
        group.add(bAgregar);

        sur.add(bRegresar);

        JPanel test = new JPanel(new BorderLayout());

        nombreLabel.setPreferredSize(new Dimension(0,10));
        nombreClienteLabel.setPreferredSize(new Dimension(100, 20));

       // nombreTxtField.setBorder(new EmptyBorder(0,0,0,0));
        idPrestamoTxt.setPreferredSize(new Dimension(100, 20));
        montoPrestamoTxt.setPreferredSize(new Dimension(100, 20));
        plazoPrestamoTxt.setPreferredSize(new Dimension(100, 20));

        norte.add(test, BorderLayout.WEST);



        test.setLayout(new GridLayout(5,2));
        test.add(nombreLabel);
        test.add(nombreClienteLabel);
        test.add(idPrestamo);
        test.add(idPrestamoTxt);
        test.add(montoPrestamo);
        test.add(montoPrestamoTxt);
        test.add(plazoPrestamo);
        test.add(plazoPrestamoTxt);
        test.add(tasaInteres);
        test.add(bAgregar);


        total.add(sur, BorderLayout.SOUTH);
        total.add(centro, BorderLayout.CENTER);
        total.add(norte, BorderLayout.NORTH);
        contentPane.add(total);

        JTable jtLista = tablaLista();
        jtLista.setBounds(30,40,200,200);
        JScrollPane sp = new JScrollPane(jtLista);
        agregaTabla(sp);
    }

    private JTable tablaLista(){
        listaPrestamos listPrestamos = new listaPrestamos();

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

}

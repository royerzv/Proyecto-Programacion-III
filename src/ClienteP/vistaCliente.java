package ClienteP;

import Clases.Canton;
import Clases.Distrito;
import Clases.LimitesProvincias;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.List;

public class vistaCliente extends JFrame {

    private JButton bntArchivo, bntBuscar, btnPrestamos;
    private JComboBox<String> cantonComboBox;
    private JComboBox<String> distritoComboBox;
    private JLabel cantonTxtLabel, distritoTxtLabel, mapaProvincias, provinciaTxtLabel, txtLabelCedula, txtLabelNombre;
    private JTextField provinciaTxtField, txtFieldCedula, txtFieldNombre;
    private LimitesProvincias provincias;


    private String getNombre() {return txtFieldNombre.getText();}
    public String getCedula() {return txtFieldCedula.getText();}
    private String getCanton() {return (String) cantonComboBox.getSelectedItem();}
    private String getDistrito() {return (String) distritoComboBox.getSelectedItem();}
    public String getProvincia() {return (String) provinciaTxtField.getText();}



    public void setProvincia(String provincia){
        provinciaTxtField.setText(provincia);
    }

    public void setCantones(List<Canton> alc){
        cantonComboBox.setModel(new DefaultComboBoxModel(alc.toArray()));
    }

    public void setCanton(Canton alc){
        //cantonComboBox.setModel(new DefaultComboBoxModel(alc.toArray()));
        cantonComboBox.addItem(alc.getNombre());
        cantonComboBox.setSelectedIndex(0);
    }

    public int getCantonIndex(){
        return cantonComboBox.getSelectedIndex();
    }

    public void setDistritos(List<Distrito> alc){
        distritoComboBox.setModel(new DefaultComboBoxModel(alc.toArray()));
    }


    public vistaCliente() throws HeadlessException{
        super("Clientes");
        provincias = new LimitesProvincias();
        addComponents();
    }

    public void addListenner(ActionListener al){
        bntArchivo.addActionListener(al);
        bntBuscar.addActionListener(al);
        btnPrestamos.addActionListener(al);
        cantonComboBox.addActionListener(al);
        distritoComboBox.addActionListener(al);
    }

    public void addMouseMotionListener(MouseMotionListener ml){
        mapaProvincias.addMouseMotionListener(ml);
    }

    public void removeMouseMotionListener(MouseMotionListener ml){
        mapaProvincias.removeMouseMotionListener(ml);
    }

    public void addMouseClickListener(MouseListener ml){
        mapaProvincias.addMouseListener(ml);
    }

    public void resaltarProvincia(int n){
        mapaProvincias.setIcon(mapasProv[n]);
    }

    public void seleccionarProvincia(String s){
        mapaProvincias.setIcon(mapasProv[Integer.parseInt(s)]);
    }

    public String seleccionProvincia() {
        String numProvincia = "0";
        if (provinciaTxtField.getText() != null) {
            switch (provinciaTxtField.getText()) {
                case "San José":
                    numProvincia = "1";
                    break;
                case "Alajuela":
                    numProvincia = "2";
                    break;
                case "Cartago":
                    numProvincia = "3";
                    break;
                case "Heredia":
                    numProvincia = "4";
                    break;
                case "Guanacaste":
                    numProvincia = "5";
                    break;
                case "Puntarenas":
                    numProvincia = "6";
                    break;
                case "Limón":
                    numProvincia = "7";
                    break;
                default:
                    break;
            }
        }
        return numProvincia;
    }



    public void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage, "Error de formato!", JOptionPane.ERROR_MESSAGE);
    }

    private void addComponents(){

        setTitle("Cliente");

        txtLabelCedula = new JLabel("Cedula");
        txtFieldCedula = new JTextField();
        bntBuscar = new JButton(); //AGREGAR ICONOS
        txtLabelNombre = new JLabel("Nombre");
        txtFieldNombre = new JTextField();
        provinciaTxtLabel = new JLabel("Provincia");
        cantonTxtLabel = new JLabel("Canton");
        distritoTxtLabel = new JLabel("Distrito");
        //distritoComboBox = new JComboBox<>();
        bntArchivo = new JButton(); //AGREGAR ICONOS


        mapaProvincias = new JLabel(); //ESTE NO OCUPA NOMBRE

        //SUBIR ICONOS
        subirMapas();
        subirIconos();

        //AGREGAR ICONOS
        bntArchivo.setIcon(icons[1]);
        bntBuscar.setIcon(icons[2]);
        mapaProvincias.setIcon(mapasProv[0]);

        //General Arriba Ventana
        setName("Clientes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        //DISTRITO COMBOBOX
        distritoComboBox = new JComboBox<>();

        //CANTON COMBOBOX
        cantonComboBox = new JComboBox<>();

        //Provincia Campo Texto
        provinciaTxtField = new JTextField();
        provinciaTxtField.setEnabled(false);


        //BOTONES

        btnPrestamos = new JButton();
        btnPrestamos.setText("Prestamos");
        btnPrestamos.setIcon(icons[0]);
        btnPrestamos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnPrestamos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        /*btnPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                //btnPrestamosActionPerformed(evt);
            }
        });*/

        btnPrestamos.setActionCommand("1");
        bntBuscar.setActionCommand("2");
        bntArchivo.setActionCommand("3");
        cantonComboBox.setActionCommand("4");
        distritoComboBox.setActionCommand("5");


        // MAS ACTIONS LISTENER
       /* txtFieldCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //txtFieldCedulaActionPerformed(evt);
            }
        });*/

        /*bntBuscar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                //bntBuscarActionPerformed(evt);
            }
        });*/

        mapaProvincias.setText("mapaP");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(19, 19, 19)
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(txtLabelNombre)
        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(txtFieldNombre, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE))
        .addGroup(layout.createSequentialGroup().addComponent(txtLabelCedula).addGap(18, 18, 18).addComponent(txtFieldCedula, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(bntBuscar, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
        .addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
        .addGroup(layout.createSequentialGroup().addComponent(provinciaTxtLabel).addGap(86, 86, 86).addComponent(cantonTxtLabel).addGap(97, 97, 97))
        .addGroup(layout.createSequentialGroup().addComponent(provinciaTxtField).addGap(18, 18, 18).addComponent(cantonComboBox, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18))).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(distritoTxtLabel).addGroup(layout.createSequentialGroup()
        .addComponent(distritoComboBox, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE).addGap(28, 28, 28)
        .addComponent(bntArchivo, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))).addComponent(mapaProvincias, GroupLayout.PREFERRED_SIZE, 447, GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE).addComponent(btnPrestamos, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
        .addContainerGap()));

        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup().addGap(35, 35, 35).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(txtLabelCedula)
        .addComponent(txtFieldCedula, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)).addGap(18, 18, 18))
        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addComponent(bntBuscar, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED))).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
        .addComponent(txtFieldNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addComponent(txtLabelNombre)).addGap(47, 47, 47)
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(provinciaTxtLabel).addComponent(cantonTxtLabel).addComponent(distritoTxtLabel))
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup()
        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
        .addComponent(distritoComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        .addComponent(bntArchivo, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
        .addComponent(cantonComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        .addComponent(provinciaTxtField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)).addGap(18, 18, 18)
        .addComponent(mapaProvincias, GroupLayout.PREFERRED_SIZE, 447, GroupLayout.PREFERRED_SIZE)).addGroup(layout.createSequentialGroup()
        .addGap(94, 94, 94).addComponent(btnPrestamos, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))).addContainerGap(26, Short.MAX_VALUE)));
        mapaProvincias.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));


        pack();

    }

    private void jTextField1ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }


    ImageIcon[] mapasProv = new ImageIcon[8];
    private LimitesProvincias mapasProvincias = new LimitesProvincias();
    private boolean isMapa = false;

    public void subirMapas() {
        try {
            mapasProv[0] = new ImageIcon(ImageIO.read(getClass().getResourceAsStream("mapas/Mapa-0.jpeg")));
            mapasProv[1] = new ImageIcon(ImageIO.read(getClass().getResourceAsStream("mapas/Mapa-1.jpeg")));
            mapasProv[2] = new ImageIcon(ImageIO.read(getClass().getResourceAsStream("mapas/Mapa-2.jpeg")));
            mapasProv[3] = new ImageIcon(ImageIO.read(getClass().getResourceAsStream("mapas/Mapa-3.jpeg")));
            mapasProv[4] = new ImageIcon(ImageIO.read(getClass().getResourceAsStream("mapas/Mapa-4.jpeg")));
            mapasProv[5] = new ImageIcon(ImageIO.read(getClass().getResourceAsStream("mapas/Mapa-5.jpeg")));
            mapasProv[6] = new ImageIcon(ImageIO.read(getClass().getResourceAsStream("mapas/Mapa-6.jpeg")));
            mapasProv[7] = new ImageIcon(ImageIO.read(getClass().getResourceAsStream("mapas/Mapa-7.jpeg")));
        } catch (IOException e) {
            System.err.println(e);
        }
    }


    ImageIcon[] icons = new ImageIcon[3];
    public void subirIconos() {
        try {
            icons[0] = new ImageIcon(ImageIO.read(getClass().getResourceAsStream("imagenes/IconLoan.png")));
            icons[1] = new ImageIcon(ImageIO.read(getClass().getResourceAsStream("imagenes/IconSave.png")));
            icons[2] = new ImageIcon(ImageIO.read(getClass().getResourceAsStream("imagenes/IconSearch.png")));
        } catch (IOException e) {
            System.err.println(e);
        }
    }

   /* public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaCliente();
            }
        });
    }*/

}

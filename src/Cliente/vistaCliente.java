package Cliente;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.IOException;

public class vistaCliente extends JFrame {

    private JButton bntArchivo, bntBuscar, btnPrestamos;
    private JComboBox<String> cantonComboBox;
    private JComboBox<String> distritoComboBox;
    private JLabel cantonTxtLabel, distritoTxtLabel, mapaProvincias, provinciaTxtLabel, txtLabelCedula, txtLabelNombre;
    private javax.swing.JTextField provinciaTxtField, txtFieldCedula, txtFieldNombre;

    public vistaCliente(){
        addComponents();
    }

    public void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage, "Error de formato!", JOptionPane.ERROR_MESSAGE);
    }

    private void addComponents(){

        txtLabelCedula = new JLabel("Cedula");
        txtFieldCedula = new JTextField();
        bntBuscar = new JButton(); //AGREGAR ICONOS
        txtLabelNombre = new JLabel("Nombre");
        txtFieldNombre = new JTextField();
        provinciaTxtLabel = new JLabel("Provincia");
        cantonTxtLabel = new JLabel("Canton");
        distritoTxtLabel = new JLabel("Distrito");
        distritoComboBox = new JComboBox<>();
        bntArchivo = new JButton(); //AGREGAR ICONOS


        mapaProvincias = new JLabel(); //ESTE NO OCUPA NOMBRE

        //SUBIR ICONOS

        subirIconos();

        //AGREGAR ICONOS
        bntArchivo.setIcon(icons[1]);
        bntBuscar.setIcon(icons[2]);

        //General Arriba Ventana
        setName("Clientes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        //DISTRITO COMBOBOX
        distritoComboBox = new JComboBox<>();
        distritoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));

        //CANTON COMBOBOX
        cantonComboBox = new JComboBox<>();
        cantonComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        //Provincia Campo Texto
        provinciaTxtField = new JTextField();
        provinciaTxtField.setEnabled(false);


        //BOTONES

        btnPrestamos = new JButton();
        btnPrestamos.setText("Prestamos");
        btnPrestamos.setIcon(icons[0]);
        btnPrestamos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnPrestamos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //btnPrestamosActionPerformed(evt);
            }
        });

        // MAS ACTIONS LISTENER
        txtFieldCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //txtFieldCedulaActionPerformed(evt);
            }
        });

        bntBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //bntBuscarActionPerformed(evt);
            }
        });

        /*
        //ACTIONS PERFORMED BOTONES Y TEXT FIELD
        private void txtFieldCedulaActionPerformed(java.awt.event.ActionEvent evt) {
            // TODO add your handling code here:
        }

        private void bntBuscarActionPerformed(java.awt.event.ActionEvent evt) {
            // TODO add your handling code here:
        }

        private void btnPrestamosActionPerformed(java.awt.event.ActionEvent evt) {
            // TODO add your handling code here:
        }*/


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
        .addComponent(bntArchivo, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))).addComponent(mapaProvincias, GroupLayout.PREFERRED_SIZE, 409, GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE).addComponent(btnPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        .addComponent(mapaProvincias, GroupLayout.PREFERRED_SIZE, 355, GroupLayout.PREFERRED_SIZE)).addGroup(layout.createSequentialGroup()
        .addGap(94, 94, 94).addComponent(btnPrestamos, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))).addContainerGap(26, Short.MAX_VALUE)));


        pack();

    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
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

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaCliente();
            }
        });
    }

}

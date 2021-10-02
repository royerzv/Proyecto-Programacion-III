package Prestamos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Cliente.vistaCliente;

public class controladorPrestamos {
    private modeloPrestamos modeloPrestamos;
    private vistaPrestamos vistaPrestamos;

    public controladorPrestamos(){
        this.modeloPrestamos = new modeloPrestamos();
        this.vistaPrestamos = new vistaPrestamos();
        vistaPrestamos.addListenner(new ClaseAction());
    }

    private class ClaseAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int valor = Integer.parseInt(e.getActionCommand());
            switch(valor){
                case 1:
                    vistaPrestamos.setVisible(false);
                    new vistaCliente();
                    break;
            }
        }
    }
}

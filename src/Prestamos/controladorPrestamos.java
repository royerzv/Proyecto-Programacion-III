package Prestamos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Clases.*;
import ClienteP.modeloCliente;
import ClienteP.vistaCliente;

public class controladorPrestamos {
    private modeloPrestamos modeloPrestamos;
    private vistaPrestamos vistaPrestamos;

    public controladorPrestamos(){
        this.modeloPrestamos = new modeloPrestamos();
        this.vistaPrestamos = new vistaPrestamos();
        vistaPrestamos.addListenner(new ClaseAction());
    }

    public controladorPrestamos(modeloPrestamos modeloPrestamos, vistaPrestamos vistaPrestamos){
        this.modeloPrestamos = new modeloPrestamos();
        this.vistaPrestamos = new vistaPrestamos();

        vistaPrestamos.addListenner(new ClaseAction());

        //modeloPrestamos.setCliente(new Cliente());

        //Provinvias
        //modeloCli.setListaProvincias(Servicio.instance().provinciaTodo());
        //modeloCli.setProvincia(new Provincia());

        //Cantones
        //modeloCli.setCanton(new Canton());
        //modeloCli.setListaCantones(new ArrayList<>());

        //Distritos
        //modeloCli.setDistrito(new Distrito());
        //modeloCli.setListaDistritos(new ArrayList<>());

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

    public void show(){
        this.vistaPrestamos.setVisible(true);
    }

    public void hide(){
        this.vistaPrestamos.setVisible(false);

    }
}

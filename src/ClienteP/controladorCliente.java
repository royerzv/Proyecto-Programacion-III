package ClienteP;

import Clases.*;
import Principal.mainClass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class controladorCliente {

    private modeloCliente modeloCli;
    private vistaCliente vistaCli;

    public controladorCliente() {
        vistaCli = new vistaCliente();
        modeloCli = new modeloCliente();
    }

    public controladorCliente(modeloCliente modeloCli, vistaCliente vistaCli){
        this.modeloCli = modeloCli;
        this.vistaCli = vistaCli;
        //Servicio.instance();

        modeloCli.setCliente(new Cliente());

        //Provinvias
        modeloCli.setListaProvincias(Servicio.instance().provinciaTodo());
        modeloCli.setProvincia(new Provincia());

        //Cantones
        modeloCli.setCanton(new Canton());
        modeloCli.setListaCantones(new ArrayList<>());

        //Distritos
        modeloCli.setDistrito(new Distrito());
        modeloCli.setListaDistritos(new ArrayList<>());

        vistaCli.addListenner(new ClaseAction());
    }

    private class ClaseAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int valor = Integer.parseInt(e.getActionCommand());
            switch(valor){
                case 1:
                    hide();
                    break;
                /*case 2:
                    vistaCli.*/
            }
        }
    }

    /*
        //ACTIONS PERFORMED BOTONES Y TEXT FIELD
        private void txtFieldCedulaActionPerformed(ActionEvent evt) {
            // TODO add your handling code here:
        }

        private void bntBuscarActionPerformed(ActionEvent evt) {
            // TODO add your handling code here:
        }

        private void btnPrestamosActionPerformed(ActionEvent evt) {
            // TODO add your handling code here:
        }*/

    public void getCliente(String cedula){
        try {
            Cliente cliente = Servicio.instance().clienteGet(cedula);
            modeloCli.setCliente(cliente);
            //model.commit();
        } catch (Exception ex) {
            modeloCli.setCliente(new Cliente());
            //modeloCli.commit();
        }
    }

    public void  clienteSearch(String cedula){
        List<Cliente> clientes= Servicio.instance().clienteBusqueda(cedula);
        //modeloCli.setCliente(new Cliente(cedula,"", "");
        modeloCli.getClientes(clientes);
        //model.commit();
    }

    public void clienteEdit(int row){
        //Cliente cliente = modeloCli.getCliente().get(row);
        //modeloCli.setCliente(cliente);
        //modeloCli.commit();
    }

    public void clienteAdd(Cliente cliente){
        try {
            Servicio.instance().clienteAñadir(cliente);
            //modeloCli.setCliente(new Cliente("","",""));
            modeloCli.setClientes(Arrays.asList(cliente));
            //model.commit();
        } catch (Exception ex) {

        }

    }

    public void show(){
        this.vistaCli.setVisible(true);
    }

    public void hide(){
        this.vistaCli.setVisible(false);
        mainClass.PRESTAMOS.show();
    }

    //public void exit(){Servicio.instance().store();}

    // Controller methods that respond to View events
    // probably invoke methods from Service,
    // and set data to Model, which in turn causes the View to update
/*
    public void clientesShow(){
        this.hide();
        Principal.mainClass.CLIENTES.show();
    }

    public void facturasShow(){
        this.hide();
        Application.FACTURAS.show();
    }*/

}

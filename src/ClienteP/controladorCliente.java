package ClienteP;

import Clases.*;
import Principal.mainClass;

import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class controladorCliente {

    private modeloCliente modeloCli;
    private vistaCliente vistaCli;
    private LimitesProvincias provincias;


    public controladorCliente() {
        vistaCli = new vistaCliente();
        modeloCli = new modeloCliente();
        provincias = new LimitesProvincias();
    }

    public controladorCliente(modeloCliente modeloCli, vistaCliente vistaCli){
        this.modeloCli = modeloCli;
        this.vistaCli = vistaCli;
        this.provincias = new LimitesProvincias();

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
        vistaCli.addMouseMotionListener(mam);
        vistaCli.addMouseClickListener(new MouseAction());
    }

    public MouseActionMove mam = new MouseActionMove();

    private class ClaseAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int valor = Integer.parseInt(e.getActionCommand());
            switch(valor){
                case 1:
                    hide();
                    break;
                case 2:
                    getCliente(vistaCli.getCeduladeTxt());
                    vistaCli.setNombre(modeloCli.getCliente().getNombreCli());
                    vistaCli.setCantonComboBoxIndex(modeloCli.getCliente().getCantonCli());
                    try {
                        modeloCli.setListaCantones(Servicio.instance().provinciaGet("1").getCantones());
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    break;
                case 3:
                    if(vistaCli.getCeduladeTxt().isEmpty() || vistaCli.getNombredeTxt().isEmpty() || vistaCli.getProvinciadeTxt().isEmpty()){

                    }else{
                        Provincia provincia = modeloCli.provincia;
                        Canton canton = provincia.getCantones().get(vistaCli.getCantonIndex());
                        Distrito distrito = canton.getDistritos().get(vistaCli.getDistritoIndex());
                        System.out.println(distrito.getNombre());
                        //Direccion direccion = new Direccion(provincia, canton, distrito);
                        if(modeloCli.getCliente().getCedulaCli().equals(vistaCli.getCeduladeTxt())){
                            Cliente cliente = new Cliente(modeloCli.getCliente().getCedulaCli(), vistaCli.getNombredeTxt(), provincia, canton, distrito);
                            clienteEdit(cliente);
                            System.out.println("Cliente Actualizado");
                            exit();
                        }else{
                            clienteAdd(new Cliente(vistaCli.getCeduladeTxt(), vistaCli.getNombredeTxt(), provincia, canton, distrito));
                            System.out.println("Cliente nuevo");
                            exit();
                        }
                    }
                    limpiarModelo();
                    break;
                case 4:
                    getDistrito(vistaCli.seleccionProvincia(), vistaCli.getCantonIndex());
                    break;
            }
        }
    }

    private class MouseActionMove implements MouseMotionListener{

        @Override
        public void mouseDragged(MouseEvent e) {}

        @Override
        public void mouseMoved(MouseEvent e) {
            if(provincias.getSanJoseProv().contains(e.getX(), e.getY())){
                vistaCli.resaltarProvincia(1);
            } else if(provincias.getAlajuelaProv().contains(e.getX(), e.getY())){
                vistaCli.resaltarProvincia(2);
            } else if(provincias.getCartagoProv().contains(e.getX(), e.getY())){
                vistaCli.resaltarProvincia(3);
            } else if(provincias.getHerediaProv().contains(e.getX(), e.getY())){
                vistaCli.resaltarProvincia(4);
            } else if(provincias.getGuanacasteProv().contains(e.getX(), e.getY())){
                vistaCli.resaltarProvincia(5);
            } else if(provincias.getPuntareanasProv().contains(e.getX(), e.getY())){
                vistaCli.resaltarProvincia(6);
            } else if(provincias.getLimonProv().contains(e.getX(), e.getY())) {
                vistaCli.resaltarProvincia(7);
            } else {
                vistaCli.resaltarProvincia(0);
            }
        }
    }

    private class MouseAction implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            String numProv = "0";
            if (e.getClickCount() == 1) {
                if (provincias.getSanJoseProv().contains(e.getX(), e.getY())) {
                    vistaCli.seleccionarProvincia("1");
                    numProv = "1";
                } else if (provincias.getAlajuelaProv().contains(e.getX(), e.getY())) {
                    vistaCli.seleccionarProvincia("2");
                    numProv = "2";
                } else if (provincias.getCartagoProv().contains(e.getX(), e.getY())) {
                    vistaCli.seleccionarProvincia("3");
                    numProv = "3";
                } else if (provincias.getHerediaProv().contains(e.getX(), e.getY())) {
                    vistaCli.seleccionarProvincia("4");
                    numProv = "4";
                } else if (provincias.getGuanacasteProv().contains(e.getX(), e.getY())) {
                    vistaCli.seleccionarProvincia("5");
                    numProv = "5";
                } else if (provincias.getPuntareanasProv().contains(e.getX(), e.getY())) {
                    vistaCli.seleccionarProvincia("6");
                    numProv = "6";
                } else if (provincias.getLimonProv().contains(e.getX(), e.getY())) {
                    vistaCli.seleccionarProvincia("7");
                    numProv = "7";
                }else{
                    vistaCli.seleccionarProvincia("0");
                    numProv = "0";
                    //vistaCli.setProvincia("");
                }

                vistaCli.removeMouseMotionListener(mam);

                getProvincia(numProv);
                getCanton(numProv);
                getDistrito(numProv, vistaCli.getCantonIndex());
            }
            if (e.getClickCount() == 2 || (!provincias.getSanJoseProv().contains(e.getX(), e.getY()) &&
                    !provincias.getAlajuelaProv().contains(e.getX(), e.getY()) && !provincias.getCartagoProv().
                    contains(e.getX(), e.getY()) && !provincias.getHerediaProv().contains(e.getX(), e.getY()) &&
                    !provincias.getGuanacasteProv().contains(e.getX(), e.getY()) && !provincias.getPuntareanasProv().
                    contains(e.getX(), e.getY()) && !provincias.getLimonProv().contains(e.getX(), e.getY()))){

                vistaCli.seleccionarProvincia("0");
                vistaCli.addMouseMotionListener(mam);
                vistaCli.setProvincia("");
                //getProvincia("0");

            }
        }

        @Override
        public void mousePressed(MouseEvent e) {}

        @Override
        public void mouseReleased(MouseEvent e) {}

        @Override
        public void mouseEntered(MouseEvent e) {}

        @Override
        public void mouseExited(MouseEvent e) {}
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
            vistaCli.setProvincia(cliente.getProvinciaCli().getNombre());
        } catch (Exception ex) {
            modeloCli.setCliente(new Cliente());
        }
    }

    public void  clienteSearch(String cedula){
        List<Cliente> clientes= Servicio.instance().clienteBusqueda(cedula);
        //modeloCli.setCliente(new Cliente(cedula,"", "");
        modeloCli.getClientes(clientes);
        //model.commit();
    }

    public void clienteEdit(Cliente cliente){
        modeloCli.setCliente(cliente);
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

    public void getProvincia(String numero){
        try {
            Provincia provincia = Servicio.instance().provinciaGet(numero);
            modeloCli.setProvincia(provincia);
            List<Canton> cantones = provincia.getCantones();
            modeloCli.setListaCantones(cantones);

            List<Distrito> distritos = provincia.getCantones().get(0).getDistritos();

            modeloCli.setListaDistritos(distritos);
            vistaCli.setProvincia(provincia.getNombre());
            vistaCli.setCantones(cantones);
            vistaCli.setDistritos(distritos);
        } catch (Exception exception) {
            modeloCli.setProvincia(new Provincia());
            modeloCli.setListaCantones(new ArrayList<>());
            modeloCli.setListaDistritos(new ArrayList<>());
        }
    }

    public void getCanton(String provincia) {
        try{
            if (provincia != "0"){
                modeloCli.setListaCantones(Servicio.instance().provinciaGet(provincia).getCantones());
            }else {
                modeloCli.setListaCantones(new ArrayList<>());
            }
        } catch (Exception exception) {
            modeloCli.setListaCantones(new ArrayList<>());
        }
    }

    public void getDistrito(String provincia, int canton){
        try{
            if (provincia != "0"){
                modeloCli.setListaDistritos(Servicio.instance().provinciaGet(provincia).getCantones().get(canton).getDistritos());
                vistaCli.setDistritos(Servicio.instance().provinciaGet(provincia).getCantones().get(canton).getDistritos());
            }else {
                modeloCli.setListaDistritos(new ArrayList<>());
            }
        } catch (Exception exception) {
            modeloCli.setListaDistritos(new ArrayList<>());
        }
    }

    public void limpiarModelo(){
        modeloCli.setCliente(new Cliente());
        modeloCli.setProvincia(new Provincia());
        modeloCli.setListaCantones(new ArrayList<>());
        modeloCli.setListaDistritos(new ArrayList<>());
    }

    public void show(){
        this.vistaCli.setVisible(true);
    }

    public void hide(){
        this.vistaCli.setVisible(false);
        mainClass.PRESTAMOS.show();
    }

    public void exit(){
        Servicio.instance().store();
    }


}



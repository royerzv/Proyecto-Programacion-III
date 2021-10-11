package Prestamos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import Clases.*;
import ClienteP.modeloCliente;
import ClienteP.vistaCliente;
import Principal.mainClass;
import Clases.Servicio;

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

        this.vistaPrestamos.addListenner(new ClaseAction());

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

        //Servicio.instance();
        //PrestamoGet("0");
        //this.vistaPrestamos.setClienteNombre(this.modeloPrestamos.getCliente().getNombreCli());
    }

    private class ClaseAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int valor = Integer.parseInt(e.getActionCommand());
            switch(valor){
                case 1:
                    hide();
                    break;
                case 2:
                    Prestamo prestamo = null;
                    try {
                        prestamo = new Prestamo(vistaPrestamos.getidPrestamoTxt(), Double.parseDouble(vistaPrestamos.getmontoPrestamoTxt()), 3,
                                Double.parseDouble(vistaPrestamos.getplazoPrestamoTxt()), getCliente(cedulaMain));
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    prestamoAdd(prestamo);
                    break;
            }
        }
    }


    public String cedulaMain;

    public void setCliente(Cliente cliente){
        this.modeloPrestamos.setCliente(cliente);
        vistaPrestamos.setClienteNombre(cliente.getNombreCli());
        cedulaMain = cliente.getCedulaCli();
    }

    public Cliente getCliente(String cedula) throws Exception {
        Cliente cliente = Servicio.instance().clienteGet(cedula);
        return cliente;
    }

    public void PrestamoGet(String prestamoIdentificador){
        try{
            Prestamo prestamo = Servicio.instance().prestamoGet(prestamoIdentificador);
            modeloPrestamos.setPrestamo(prestamo);
            modeloPrestamos.setListaPrestamos(Arrays.asList(prestamo));

        }catch (Exception ex){
            modeloPrestamos.setPrestamo(new Prestamo());
            modeloPrestamos.setListaPrestamos(new ArrayList<>());
        }
    }

    public void prestamoAdd(Prestamo prestamo){
        try {
            Servicio.instance().prestamoAñadir(prestamo);
            modeloPrestamos.setPrestamo(prestamo);
            modeloPrestamos.setListaPrestamos(Arrays.asList(prestamo));

        } catch (Exception ex) {

        }

    }

    public void show(){
        this.vistaPrestamos.setVisible(true);
    }

    public void hide(){
        this.vistaPrestamos.setVisible(false);
        mainClass.CLIENTES.show();
    }
}

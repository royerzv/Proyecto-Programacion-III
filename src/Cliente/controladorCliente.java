package Cliente;

import Clases.*;

import java.util.ArrayList;

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

        modeloCli.setCliente(new Cliente());

        //Provinvias
        modeloCli.setListaProvincias(new ArrayList<>());
        modeloCli.setProvincia(new Provincia());

        //Cantones
        modeloCli.setCanton(new Canton());
        modeloCli.setListaCantones(new ArrayList<>());

        //Distritos
        modeloCli.setDistrito(new Distrito());
        modeloCli.setListaDistritos(new ArrayList<>());

    }

    public void getProvincia(String numeroProv){

    }



}

import Clases.Cliente;
import Clases.Prestamo;

public class mainClass {

    public static void main(String[] args) {
        ClienteP.modeloCliente modelClientes = new ClienteP.modeloCliente() ;
        ClienteP.vistaCliente viewClientes = new ClienteP.vistaCliente();
        ClienteP.controladorCliente controllerClientes = new ClienteP.controladorCliente(modelClientes,viewClientes);
        CLIENTES = controllerClientes;

        Prestamos.modeloPrestamos modelPrestamos = new Prestamos.modeloPrestamos() ;
        Prestamos.vistaPrestamos viewPrestamos = new Prestamos.vistaPrestamos();
        Prestamos.controladorPrestamos controllerPrestamos = new Prestamos.controladorPrestamos(modelPrestamos,viewPrestamos);
        PRESTAMOS = controllerPrestamos;

        CLIENTES.show();
    }

    public static ClienteP.controladorCliente CLIENTES;
    public static Prestamos.controladorPrestamos PRESTAMOS;


}

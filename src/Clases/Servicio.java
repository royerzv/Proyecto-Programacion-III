package Clases;

import Parser.Datos;
import Parser.JAXBParser;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.List;
import java.util.stream.Collectors;

public class Servicio {

    //PATRON DE DISEÑO SINGLETON

    private static Servicio theInstance;

    public static Servicio instance() {
        if (theInstance == null) {
            theInstance = new Servicio();
        }
        return theInstance;
    }

    //Service Datos
    private Datos data;

    //METODOS GET-AÑADIR Y BUSQUEDA Cliente

    public Cliente clienteGet(String cedula) throws Exception {
        Cliente result = data.getClientes().stream().filter(c -> c.getCedulaCli().equals(cedula)).findFirst().orElse(null);
        if (result != null) return result;
        else throw new Exception("Cliente no existente!!");
    }

    public List<Cliente> clienteBusqueda(String cedula) {
        List<Cliente> result = data.getClientes().stream().filter(c -> c.getCedulaCli().startsWith(cedula)).collect(Collectors.toList());
        return result;
    }

    public List<Cliente> clienteTodo() {
        return data.getClientes();
    }

    public void clienteAñadir(Cliente cliente) throws Exception {
        Cliente old = data.getClientes().stream().filter(c -> c.getCedulaCli().equals(cliente.getCedulaCli())).findFirst().orElse(null);
        if (old == null){
            data.getClientes().add(cliente);
        }
        else throw new Exception("Cliente ya existente!!");

    }

    //PRESTAMOS GET - AÑADIR
    public Prestamo prestamoGet(String prestamoIdentificador) throws Exception {
        Prestamo result = data.getPrestamos().stream().filter(f -> f.getIdentificardorPrestamo().equals(prestamoIdentificador)).findFirst().orElse(null);
        if (result != null){
            return result;
        }
        else throw new Exception("El prestamo no existe");
    }

    public List<Prestamo> prestamoBusqueda(String prestamoIdentificador) {
        List<Prestamo> result = data.getPrestamos().stream().filter(f -> f.getIdentificardorPrestamo().startsWith(prestamoIdentificador)).collect(Collectors.toList());
        return result;
    }

    public void prestamoAñadir(Prestamo prestamo) throws Exception {
        Prestamo old = data.getPrestamos().stream().filter(f -> f.getIdentificardorPrestamo().equals(prestamo.getIdentificardorPrestamo())).findFirst().orElse(null);
        if (old == null) data.getPrestamos().add(prestamo);
        else throw new Exception("Prestamo ya existente");

    }

    //METODOS GET Y BUSQUEDA Provincia

    public Provincia provinciaGet(String numero) throws Exception {
        Provincia result = data.getProvincias().stream().filter(c -> c.getNumero().equals(numero)).findFirst().orElse(null);
        if (result != null) return result;
        else throw new Exception("Provincia no existente!!");
    }

    public List<Provincia> ProvinciaBusqueda(String numero) {
        List<Provincia> result = data.getProvincias().stream().filter(c -> c.getNumero().startsWith(numero)).collect(Collectors.toList());
        return result;
    }

    public List<Provincia> provinciaTodo() {
        return data.getProvincias();
    }

    //METODOS GET Y BUSQUEDA CANTON

    public Canton cantonGet(String numero) throws Exception {
        Canton result = data.getCantones().stream().filter(c -> c.getNumero().equals(numero)).findFirst().orElse(null);
        if (result != null) return result;
        else throw new Exception("Canton no existente!!");
    }

    public List<Canton> cantonBusqueda(String numero) {
        List<Canton> result = data.getCantones().stream().filter(c -> c.getNumero().startsWith(numero)).collect(Collectors.toList());
        return result;
    }

    public List<Canton> cantonTodo() {
        return data.getCantones();
    }

    //METODOS GET Y BUSQUEDA Distrito

    public Distrito distritoGet(String numero) throws Exception {
        Distrito result = data.getDistritos().stream().filter(c -> c.getNumero().equals(numero)).findFirst().orElse(null);
        if (result != null) return result;
        else throw new Exception("Canton no existente!!");
    }

    public List<Distrito> distritoBusqueda(String numero) {
        List<Distrito> result = data.getDistritos().stream().filter(c -> c.getNumero().startsWith(numero)).collect(Collectors.toList());
        return result;
    }

    public List<Distrito> distritosTodo() {
        return data.getDistritos();
    }

    public void store() {
        try {
            JAXBParser.instance().marshall(data);
        } catch (Exception ex) {
        }
    }

    public Servicio() {
        try {
            data = (Datos) JAXBParser.instance().unmarshall();
        } catch (Exception ex) {
            data = new Datos();
        }
    }
}

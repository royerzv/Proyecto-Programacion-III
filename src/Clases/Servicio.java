package Clases;

import Parser.Datos;
import Parser.JAXBParser;

import java.util.List;
import java.util.stream.Collectors;

public class Servicio {

    //PATRON DE DISEÑO SINGLETON

    private static Servicio theInstance;
    public static Servicio instance(){
        if (theInstance==null){
            theInstance=new Servicio();
        }
        return theInstance;
    }

    //Service Datos
    private Datos datos;

    //METODOS GET-AÑADIR Y BUSQUEDA Cliente

    public Cliente clienteGet(String cedula) throws Exception{
        Cliente result=datos.getClientes().stream().filter(c->c.getCedulaCli().equals(cedula)).findFirst().orElse(null);
        if (result!=null) return result;
        else throw new Exception("Cliente no existente!!");
    }

    public List<Cliente> clienteBusqueda(String cedula){
        List<Cliente> result = datos.getClientes().stream().filter(c->c.getCedulaCli().startsWith(cedula)).collect(Collectors.toList());
        return result;
    }

    public List<Cliente> clienteTodo(){
        return datos.getClientes();
    }

    public void clienteAñadir(Cliente cliente) throws Exception{
        Cliente old = datos.getClientes().stream().filter(c->c.getCedulaCli().equals(cliente.getCedulaCli())).findFirst().orElse(null);
        if (old==null) datos.getClientes().add(cliente);
        else throw new Exception("Cliente ya existente!!");

    }

    //PRESTAMOS GET - AÑADIR
    public Prestamo prestamoGet(String prestamoIdentificador) throws Exception{
        Prestamo result=datos.getPrestamos().stream().filter(f->f.getIdentificardorPrestamo().equals(prestamoIdentificador)).findFirst().orElse(null);
        if (result!=null) return result;
        else throw new Exception("El prestamo no existe");
    }

    public List<Prestamo> prestamoBusqueda(String prestamoIdentificador){
        List<Prestamo> result=datos.getPrestamos().stream().filter(f->f.getIdentificardorPrestamo().startsWith(prestamoIdentificador)).collect(Collectors.toList());
        return result;
    }

    public void prestamoAñadir(Prestamo prestamo) throws Exception{
        Prestamo old = datos.getPrestamos().stream().filter(f->f.getIdentificardorPrestamo().equals(prestamo.getIdentificardorPrestamo())).findFirst().orElse(null);
        if (old==null) datos.getPrestamos().add(prestamo);
        else throw new Exception("Prestamo ya existente");

    }

    //METODOS GET Y BUSQUEDA Provincia

    public Provincia provinciaGet(String numero) throws Exception{
        Provincia result= datos.getProvincias().stream().filter(c->c.getNumero().equals(numero)).findFirst().orElse(null);
        if (result!=null) return result;
        else throw new Exception("Provincia no existente!!");
    }

    public List<Provincia> ProvinciaBusqueda(String numero){
        List<Provincia> result = datos.getProvincias().stream().filter(c->c.getNumero().startsWith(numero)).collect(Collectors.toList());
        return result;
    }

    public List<Provincia> provinciaTodo(){
        return datos.getProvincias();
    }

    //METODOS GET Y BUSQUEDA CANTON

    public Canton cantonGet(String numero) throws Exception{
        Canton result= datos.getCantones().stream().filter(c->c.getNumero().equals(numero)).findFirst().orElse(null);
        if (result!=null) return result;
        else throw new Exception("Canton no existente!!");
    }

    public List<Canton> cantonBusqueda(String numero){
        List<Canton> result = datos.getCantones().stream().filter(c->c.getNumero().startsWith(numero)).collect(Collectors.toList());
        return result;
    }

    public List<Canton> cantonTodo(){
        return datos.getCantones();
    }

    //METODOS GET Y BUSQUEDA Distrito

    public Distrito distritoGet(String numero) throws Exception{
        Distrito result= datos.getDistritos().stream().filter(c->c.getNumero().equals(numero)).findFirst().orElse(null);
        if (result!=null) return result;
        else throw new Exception("Canton no existente!!");
    }

    public List<Distrito> distritoBusqueda(String numero){
        List<Distrito> result = datos.getDistritos().stream().filter(c->c.getNumero().startsWith(numero)).collect(Collectors.toList());
        return result;
    }

    public List<Distrito> distritosTodo(){
        return datos.getDistritos();
    }


/*
    public void store() {
        try {
            JAXBParser.instance().marshall(datos);
        } catch (Exception ex) {
        }
    }

    public Servicio(){
        try {
            datos=XmlPersister.instance().load();
        }catch (Exception ex){
            datos =  new Datos();
        }
    }

*/
}

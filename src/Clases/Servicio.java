package Clases;

public class Servicio {

    //PATRON DE DISEÑO SINGLETON

    private static Servicio theInstance;
    public static Servicio instance(){
        if (theInstance==null){
            theInstance=new Servicio();
        }
        return theInstance;
    }



}

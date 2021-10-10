package Parser;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class JAXBParser {

    private String path;
    private static JAXBParser theInstance;
    public static JAXBParser instance(){
        if (theInstance==null){
            theInstance=new JAXBParser("datosXML.xml");
        }
        return theInstance;
    }

    public JAXBParser(String p) {
        path=p;
    }

    public void marshall(Object obj){
        try{
            JAXBContext jContext = JAXBContext.newInstance(obj.getClass());
            Marshaller marshallObj = jContext.createMarshaller();
            marshallObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshallObj.marshal(obj, new FileOutputStream(path));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Object unmarshall(){
        try{
            FileInputStream file = new FileInputStream(path);
            JAXBContext jContext = JAXBContext.newInstance(Datos.class);
            Unmarshaller unmarshallerObj = jContext.createUnmarshaller();
            Datos obj1 = (Datos) unmarshallerObj.unmarshal(file);
            file.close();
            return obj1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
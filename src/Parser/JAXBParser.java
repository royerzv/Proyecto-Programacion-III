package Parser;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import java.io.FileOutputStream;
import java.io.File;

public class JAXBParser {


    private String path;
    private static JAXBParser theInstance;
    public static JAXBParser instance(){
        if (theInstance==null){
            theInstance=new JAXBParser("prestamos.xml");
        }
        return theInstance;
    }

    public JAXBParser(String p) {
        path=p;
    }

    public void marshall(Object obj, String filename){
        try{
            JAXBContext jContext = JAXBContext.newInstance(obj.getClass());
            Marshaller marshallObj = jContext.createMarshaller();
            marshallObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshallObj.marshal(obj, new FileOutputStream(filename));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Object unmarshall(Object obj, String filename){
        Object obj1 = null;
        try{
            File file = new File(filename);
            JAXBContext jContext = JAXBContext.newInstance(obj.getClass());
            Unmarshaller unmarshallerObj = jContext.createUnmarshaller();
            obj1 = (Object) unmarshallerObj.unmarshal(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj1;
    }
}
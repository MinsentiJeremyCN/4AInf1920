package it.itis.cuneo;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class HotelJava {

    public static final String FILE_PATH ="E:\\INFORMATICA\\Esercizi_IntelliJ\\33_HotelXml\\Xml\\Hotel.xml";
    public static final String FILE_PATH_WRITE = "E:\\INFORMATICA\\Esercizi_IntelliJ\\33_HotelXml\\Xml\\HotelWrite.xml";

    private String name;
    private List<Camera> lCamera;

    public HotelJava(){

        this.name = "";
        this.lCamera = new ArrayList<Camera>();

    }

    public void addCamera(Camera camera){

        this.lCamera.add(camera);

    }

    public String getName() {
        return name;
    }

    @XmlAttribute
    public void setName(String name) {
        this.name = name;
    }

    public List<Camera> getlCamera() {
        return lCamera;
    }

    @XmlElement
    public void setlCamera(List<Camera> lCamera) {
        this.lCamera = lCamera;
    }

    public void unMarshallXml(){

        try {
            File file = new File(FILE_PATH);
            JAXBContext jaxbContext = JAXBContext.newInstance(HotelJava.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            HotelJava hotelJava = (HotelJava) jaxbUnmarshaller.unmarshal(file);

            System.out.println(hotelJava.toString());

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

    public void marshallXml(){
        File file = new File (FILE_PATH);

        try {

            JAXBContext jaxbContext = JAXBContext.newInstance(HotelJava.class);

            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            //This è i riferimento alla classeattuale
            jaxbMarshaller.marshal(this, file);
            jaxbMarshaller.marshal(this, System.out);

        } catch (JAXBException e) {

            e.printStackTrace();

        }
    }

    @Override
    public String toString() {
        return "HotelJava{" +
                "name='" + name + '\'' +
                ", lCamera=" + lCamera +
                '}';
    }

    public void simula(){

        Camera camera1 = new Camera(12, 2, "Mare");
        this.addCamera(camera1);
        Camera camera2 = new Camera(13, 2, "Mare");
        this.addCamera(camera2);
        Camera camera3 = new Camera(14, 2, "Collina");
        this.addCamera(camera3);
        Camera camera4 = new Camera(15, 2, "Collina");
        this.addCamera(camera4);

    }

    public static void main(String[] args) {

        HotelJava hoteljava = new HotelJava();
        //hoteljava.unMarshallXml();
        hoteljava.simula();
        hoteljava.marshallXml();

    }
}

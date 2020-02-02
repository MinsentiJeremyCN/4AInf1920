package it.itis.cuneo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Camera {

    private int nome;
    private int letto;
    private String vista;

    public Camera() {

        super();

    }

    public Camera(int nome, int letto, String vista) {
        this.nome = nome;
        this.letto = letto;
        this.vista = vista;
    }

    public int getNome() {
        return nome;
    }

    @XmlAttribute
    public void setNome(int nome) {
        this.nome = nome;
    }

    public int getLetto() {
        return letto;
    }

    @XmlElement
    public void setLetto(int letto) {
        this.letto = letto;
    }

    public String getVista() {
        return vista;
    }

    @XmlElement
    public void setVista(String vista) {
        this.vista = vista;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "nome=" + nome +
                ", letto=" + letto +
                ", vista='" + vista + '\'' +
                '}';
    }


}

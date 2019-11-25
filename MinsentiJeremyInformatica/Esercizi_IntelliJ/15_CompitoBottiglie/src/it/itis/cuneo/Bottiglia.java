package it.itis.cuneo;

import java.util.Calendar;
import java.util.Objects;

public class Bottiglia {

    private String marca;
    private String tipo;
    private Calendar scadenza;

    public Bottiglia() {

        super();
    }

    public Bottiglia(String marca, String tipo, Calendar scadenza) {
        this.marca = marca;
        this.tipo = tipo;
        this.scadenza = scadenza;
    }

    public Bottiglia(Bottiglia bottiglia) {

        this.marca = bottiglia.getMarca();
        this.tipo = bottiglia.getTipo();
        this.scadenza = bottiglia.getScadenza();

    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setScadenza(Calendar scadenza) {
        this.scadenza = scadenza;
    }

    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }

    public Calendar getScadenza() {
        return scadenza;
    }

    public boolean equals (Bottiglia bottiglia)
    {
        boolean bEquals = false;

        if(marca!=null && marca.equals (bottiglia.getMarca())
                && tipo!=null && tipo.equals(bottiglia.getTipo())
                && scadenza!=null && scadenza.equals(bottiglia.getScadenza()))
        {
            bEquals = true;
        }

        return bEquals;
    }

    @Override
    public String toString() {
        return "Bottiglia{" +
                "marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", scadenza=" + scadenza +
                '}';
    }
}

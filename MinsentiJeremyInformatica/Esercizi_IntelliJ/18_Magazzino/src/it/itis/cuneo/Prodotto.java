package it.itis.cuneo;

/**
 * Created by inf.minsentij2908 on 13/11/2019.
 */
public class Prodotto {

    private int codice;
    private String descrizione;

    public Prodotto()
    {
        super();
    }

    public Prodotto(int codice, String descrizione)
    {
        this.codice = codice;
        this.descrizione = descrizione;
    }

    public int getCodice() {
        return codice;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
}

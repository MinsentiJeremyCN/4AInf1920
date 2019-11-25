package it.itis.cuneo;

/**
 * Created by inf.minsentij2908 on 20/11/2019.
 */
public class Abitazione {

    private int nStanze;
    private int superficie;
    private int indirizzo;
    private String citta;

    public Abitazione() {
    }

    public Abitazione(int nStanze, int superficie, int indirizzo, String citta) {
        this.nStanze = nStanze;
        this.superficie = superficie;
        this.indirizzo = indirizzo;
        this.citta = citta;
    }

    public Abitazione(Abitazione abitazione) {
        this.nStanze = abitazione.getnStanze();
        this.superficie = abitazione.getSuperficie();
        this.indirizzo = abitazione.getIndirizzo();
        this.citta = abitazione.getCitta();
    }

    public int getnStanze() {
        return nStanze;
    }

    public int getSuperficie() {
        return superficie;
    }

    public int getIndirizzo() {
        return indirizzo;
    }

    public String getCitta() {
        return citta;
    }

    public void setnStanze(int nStanze) {
        this.nStanze = nStanze;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public void setIndirizzo(int indirizzo) {
        this.indirizzo = indirizzo;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    @Override
    public String toString() {
        return  "nStanze=" + nStanze +
                ", superficie=" + superficie +
                ", indirizzo=" + indirizzo +
                ", citta='" + citta + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Abitazione that = (Abitazione) o;

        if (nStanze != that.nStanze) return false;
        if (superficie != that.superficie) return false;
        if (indirizzo != that.indirizzo) return false;
        return citta != null ? citta.equals(that.citta) : that.citta == null;

    }


}

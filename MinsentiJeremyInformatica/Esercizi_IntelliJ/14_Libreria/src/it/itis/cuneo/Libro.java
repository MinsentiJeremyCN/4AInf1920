package it.itis.cuneo;

import java.util.Calendar;

/**
 * Created by inf.minsentij2908 on 30/10/2019.
 */
public class Libro {

    private String titolo;
    private String autore;
    private String isbn;
    private Calendar dataPubblicazione;

    public Libro() {

        super();
    }

    public Libro(String titolo, String autore, String isbn, Calendar dataPubblicazione){

        this.titolo = titolo;
        this.autore = autore;
        this.isbn = isbn;
        this.dataPubblicazione = dataPubblicazione;

    }

    public Libro(Libro libro){

        this.titolo = libro.getTitolo();
        this.autore = libro.getAutore();
        this.isbn = libro.getIsbn();
        this.dataPubblicazione = libro.getDataPubblicazione();

    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setDataPubblicazione(Calendar dataPubblicazione) {
        this.dataPubblicazione = dataPubblicazione;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public String getIsbn() {
        return isbn;
    }

    public Calendar getDataPubblicazione() {
        return dataPubblicazione;
    }

    public boolean equals (Libro libro)
    {
        boolean bEquals = false;

        if(titolo!=null && titolo.equals (libro.getTitolo())
                && autore!=null && autore.equals(libro.getAutore())
                && isbn!=null && isbn.equals(libro.getIsbn())
                && dataPubblicazione!=null && this.dataPubblicazione.equals(libro.getDataPubblicazione()) )
        {
            bEquals = true;
        }

        return bEquals;
    }
}

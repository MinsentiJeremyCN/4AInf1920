package it.itis.cuneo;

/**
* Created by inf.minsentij2908 on 30/10/2019.
        */
public class Libreria {

    public static final int MAX_LIBRI = 3;
    private Libro[] vLibri;
    private int cntLibro;

    public Libreria()
    {
        vLibri = new Libro[MAX_LIBRI];
        cntLibro = 0;
    }

    public void addLibro(Libro libro)
            throws LibreriaPienaException{
        if(cntLibro>MAX_LIBRI)
            throw new LibreriaPienaException(1, "Troppi Libri");
        vLibri[cntLibro] = libro;
        cntLibro++;
    }

    public static void main(String[] args)
    {
        Libro libro1 = new Libro("L'uomo che ride", "Arold", "123456789", InputOutputUtility.convertiDataOraToCalendar("29/10/2019"));
    }
}

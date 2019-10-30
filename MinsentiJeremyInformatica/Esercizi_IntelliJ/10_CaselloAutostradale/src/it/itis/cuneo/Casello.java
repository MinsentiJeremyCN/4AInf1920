package it.itis.cuneo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by inf.minsentij2908 on 21/10/2019.
 */
public class Casello {

    //attributi

    private Calendar dataEntrata;
    private Calendar dataUscita;

    private String identifier;

    public Casello(String identifier, Calendar dataEntrata, Calendar dataUscita)
    {
        this.identifier = identifier;
        this.dataEntrata = dataEntrata;
        this.dataUscita = dataUscita;
    }

    public Casello(Casello casello)
    {
        this.identifier = casello.getIdentifier();

        Calendar cDataIngresso = Calendar.getInstance();
        cDataIngresso.setTime( casello.getDataEntrata().getTime());
        this.dataEntrata = cDataIngresso;

        Calendar cDataUscita = Calendar.getInstance();
        cDataUscita.setTime( casello.getDataUscita().getTime());
        this.dataUscita = cDataUscita;
    }

    public void setDataEntrata(Calendar dataEntrata)
    {
        this.dataEntrata = dataEntrata;
    }

    public void setDataUscita(Calendar dataUscita)
    {
        this.dataUscita = dataUscita;
    }

    public void setIdentifier(String identifier)
    {
        this.identifier = identifier;
    }

    public Calendar getDataEntrata()
    {
        return dataEntrata;
    }

    public Calendar getDataUscita()
    {
        return dataUscita;
    }

    public String getIdentifier()
    {
        return identifier;
    }

    public static void main( String[] args )
    {
        //Stringa --> Data
        //es. 23/10/2019 09:41:42
        //Il Pattern(convenzione, formato, una stringa che definisce il formato di come devono apparire le cose) è il formato della data di input
        //Pattern dd/MM/yyyy hh24:mi:ss

        final String FORMATO_DMY_HMS = "dd/MM/yyyy hh:mm:ss";
        String strDataPartenza = "29/08/2002 13:30:40";
        Calendar cDataEntrata = Calendar.getInstance();

        SimpleDateFormat sdfHH = new SimpleDateFormat(FORMATO_DMY_HMS);
        //Parsificare una stringa secondo un formato, permette di ottenere una variabile di altro tipo
        //Eccezione anomalia software che si verifica quando il codice genera un errore in tempo di esecuzione
        //ParseException: la stringa non rispetta il formato atteso

        Date dataPartenza = null;
        try {
            dataPartenza = sdfHH.parse(strDataPartenza);
        } catch (ParseException e) {
            //Errore nel formato della stringa
            //Viene stampato uno stackTrace: una traccia dello stack
            //è l'elenco delle chiamate ai metodi
            e.printStackTrace();
        }
        //Manca catch exception ex, qui non intercetto l'Exception

        //Calendar mantiene il numero di secondi dal 01/01/1970
        cDataEntrata.setTime(dataPartenza);

        System.out.println("cDataEntrata: "+cDataEntrata);
        System.out.println("cDataEntrata format: "+sdfHH.format(cDataEntrata));
    }
}

package it.itis.cuneo;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by inf.minsentij2908 on 04/11/2019.
 */
public class Calendario {

    public Calendario() {

        super();

    }

    public static void main(String[] args)
    {
        //Stampa data oggi
        System.out.println(new Date());

        Date dOggi = new Date();
        System.out.println(dOggi);

        String strData = InputOutputUtility.leggiNome("Inserisci la data (dd/mm/yyyy): ");

        //String --> Date
        Calendar cData2 = InputOutputUtility.convertiDataOraToCalendar(strData, InputOutputUtility.dfDay);
       System.out.println(cData2.getTime());
    }
}

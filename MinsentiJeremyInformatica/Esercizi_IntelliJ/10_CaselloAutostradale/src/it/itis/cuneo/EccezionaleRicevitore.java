package it.itis.cuneo;

/**
 * Created by inf.minsentij2908 on 24/10/2019.
 */
public class EccezionaleRicevitore {

    public int divisione(int numeratore, int denominatore)
    {
        int quoto = 0; //1

        quoto = numeratore / denominatore;

        return quoto; //2
    }

    public static void main(String[] args){


        EccezionaleRicevitore  eccezionaleRicevitore = new EccezionaleRicevitore();

        eccezionaleRicevitore.divisione(5,0);

    }

}

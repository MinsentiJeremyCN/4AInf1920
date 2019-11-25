package it.itis.cuneo;

/**
 * Created by inf.minsentij2908 on 11/11/2019.
 */
public class Contenitori {

    private static final int NUM_CD = 3;
    private  CD vettoreCD[];

    public Contenitori()
    {
        int posizione;

        vettoreCD = new CD[NUM_CD];

        for(posizione=0; posizione<NUM_CD; posizione++)
        {
            vettoreCD[posizione] = new CD();
        }
    }

    public CD getCD(int posizione)
    {
        return vettoreCD[posizione];
    }

    public void setCD(int posizione, CD cd)
    {
        vettoreCD[posizione] = new CD(cd);
    }

    public int killCD(int posizione)
    {
        if(posizione > 3 || posizione < 1)
        {
            return -1;
        }

        return 1;
    }

    public int getN()
    {
        return 3;
    }

    public int cercaCDPerDenominazione(String stringa)
    {
        int posizione;
        int risultato = 0;
        boolean trovato = false;

        for(posizione=0; posizione<NUM_CD; posizione++)
        {
            if(vettoreCD[posizione].getTitolo() == stringa)
            {
                risultato = posizione;
                trovato = true;
            }
        }

        if(trovato == false)
        {
            risultato =  -1;
        }

        return risultato;
    }

    public String toString()
    {
        return vettoreCD[0].getTitolo() + ", " + vettoreCD[1].getTitolo() + ", " + vettoreCD[2].getTitolo();
    }

    public int confrontaContenitori(Contenitori contenitori)
    {
        int posizione;
        int i;
        int CDUguali = 0;

        for(posizione=0; posizione<NUM_CD; posizione++)
        {
            for(i=0; i<NUM_CD; i++) {

                if(this.vettoreCD[posizione].getTitolo() == contenitori.vettoreCD[i].getTitolo())
                {
                    if(this.vettoreCD[posizione].getAutore() == contenitori.vettoreCD[i].getAutore())
                    {
                        CDUguali++;
                    }
                }

            }
        }

        return CDUguali;
    }

    public static void main(String[] args)
    {
        Contenitori contenitore1 = new Contenitori();
        Contenitori contenitore2 = new Contenitori();

        System.out.println(contenitore1.getCD(2));
        System.out.println(contenitore2.getCD(1));

        System.out.println(contenitore1.killCD(2));
        System.out.println(contenitore2.killCD(1));

        System.out.println(contenitore1.getN());

        System.out.println(contenitore1.cercaCDPerDenominazione("Ciao"));
        System.out.println(contenitore2.cercaCDPerDenominazione("Ciao2"));

        System.out.println(contenitore1.toString());
        System.out.println(contenitore2.toString());

        System.out.println(contenitore1.confrontaContenitori(contenitore2));


    }
}

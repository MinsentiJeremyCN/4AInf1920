package it.itis.cuneo;

public class Contenitori {

  private static final int NUM_PROGRAMMI = 3;
  private  Programma vettoreProgrammi[];

    public Contenitori()
    {
        int posizione;

        vettoreProgrammi = new Programma[NUM_PROGRAMMI];

        for(posizione=0; posizione<NUM_PROGRAMMI; posizione++)
        {
            vettoreProgrammi[posizione] = new Programma();
        }
    }

    public Programma getProgramma(int posizione)
    {
        return vettoreProgrammi[posizione];
    }

    public void setProgramma(int posizione, Programma programma)
    {
        vettoreProgrammi[posizione] = new Programma(programma);
    }

    public int killProgramma(int posizione)
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

    public int cercaProgrammaPerDenominazione(String stringa)
    {
        int posizione;
        int risultato = 0;
        boolean trovato = false;

        for(posizione=0; posizione<NUM_PROGRAMMI; posizione++)
        {
            if(vettoreProgrammi[posizione].getDenominazione() == stringa)
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
        return vettoreProgrammi[0].getDenominazione() + ", " + vettoreProgrammi[1].getDenominazione() + ", " + vettoreProgrammi[2].getDenominazione();
    }

    public int confrontaContenitori(Contenitori contenitori)
    {
        int posizione;
        int i;
        int programmiUguali = 0;

        for(posizione=0; posizione<NUM_PROGRAMMI; posizione++)
        {
            for(i=0; i<NUM_PROGRAMMI; i++) {

                if(this.vettoreProgrammi[posizione].getDenominazione() == contenitori.vettoreProgrammi[i].getDenominazione())
                {
                    if(this.vettoreProgrammi[posizione].getVersione() == contenitori.vettoreProgrammi[i].getVersione())
                    {
                        programmiUguali++;
                    }
                }

            }
        }

        return programmiUguali;
    }

    public static void main(String[] args)
    {
        Contenitori contenitore1 = new Contenitori();
        Contenitori contenitore2 = new Contenitori();

        System.out.println(contenitore1.getProgramma(2));
        System.out.println(contenitore2.getProgramma(1));

        System.out.println(contenitore1.killProgramma(2));
        System.out.println(contenitore2.killProgramma(1));

        System.out.println(contenitore1.getN());

        System.out.println(contenitore1.cercaProgrammaPerDenominazione("IntelliJ"));
        System.out.println(contenitore2.cercaProgrammaPerDenominazione("IntelliJ"));

        System.out.println(contenitore1.toString());
        System.out.println(contenitore2.toString());

        System.out.println(contenitore1.confrontaContenitori(contenitore2));


    }
}

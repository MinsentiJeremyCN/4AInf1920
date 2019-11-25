package it.itis.cuneo;

public class ColloDiBottiglie {

    public static final int MAX_BOTTIGLIE = 6;
    private Bottiglia[] vBottiglie;
    private int cntBottiglia;

    public Libreria()
    {
        vBottiglie = new Bottiglia[MAX_BOTTIGLIE];
        cntBottiglia = 0;
    }

    public void addLibro(Bottiglia bottiglia)
            throws ScatolaPienaException{
        if(cntBottiglia>MAX_BOTTIGLIE)
            throw new ScatolaPienaException(1, "Troppe bottiglie");
        vBottiglie[cntBottiglia] = bottiglia;
        cntBottiglia++;
    }

    public static void main(String[] args)
    {
        Bottiglia bottiglia1 = new Bottiglia("", "", InputOutputUtility.convertiDataOraToCalendar("29/10/2019"));
    }

}

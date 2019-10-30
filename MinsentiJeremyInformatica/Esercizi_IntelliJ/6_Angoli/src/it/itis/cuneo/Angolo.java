package it.itis.cuneo;

public class Angolo
{
    private int g;
    private int p;
    private int s;

    public Angolo()
    {
        super();
    }

    public Angolo(int g, int p, int s)
    {
       setGradi(g);
       setPrimi(p);
       setSecondi(s);
    }

    public void setGradi(int g)
    {
        this.g = g;
    }

    public void setPrimi(int p)
    {
        this.p = p;
    }

    public void setSecondi(int s)
    {
        this.s = s;
    }

    public int getG()
    {
        return g;
    }

    public int getP()
    {
        return p;
    }

    public int getS()
    {
        return s;
    }

    public String visualizzaAngolo()
    {
        return "L'angolo è di: " + this.g + " gradi, " + this.p + " primi, " + this.s + " secondi.";
    }

    public void aggiungiGradi(int n)
    {
        this.g = this.g + n;
    }

    public void aggiungiPrimi(int n)
    {
        this.p = this.p + n;
    }

    public void aggiungiSecondi(int n)
    {
        this.s = this.s + n;
    }

    public String angoloSecondi()
    {
        return "I secondi sono: " + this.s;
    }

    public int differenzaSecondi(Angolo angolo)
    {
        int differenza;

        if(this.s > angolo.getS())
        {
            differenza = this.s - angolo.getS();
        }
        else
        {
            differenza = ( (this.s + 60) - angolo.getS() );
        }

        return differenza;
    }

    public void secondiAngolo(int n)
    {
        this.s = this.s + n;

        if(this.s > 59)
        {
            this.s = this.s - 60;
            this.p = this.p + 1;
        }

        if(this.p > 59)
        {
            this.p = this.p - 60;
            this.g = this.g + 1;
        }

    }

    public void sommaAngolo(Angolo angolo)
    {
        int sommaG, sommaP, sommaS;

        sommaG = this.g + angolo.getG();

        sommaP = this.p + angolo.getP();

        sommaS = this.s + angolo.getS();

        if(sommaS > 59)
        {
            sommaS = sommaS - 60;
            sommaP = sommaP + 1;
        }

        if(sommaP > 59)
        {
            sommaP = sommaP - 60;
            sommaG = sommaG + 1;
        }

        if(sommaG < 360)
        {
            System.out.println(sommaG);
            System.out.println(sommaP);
            System.out.println(sommaS);
        }
    }

    public static void  main(String[] args)
    {
        int nummero = 17;
        int diffSecondi;

        Angolo angolo1=new Angolo(42, 17, 29);
        Angolo angolo2=new Angolo(8, 32, 54);

        System.out.println(angolo1.visualizzaAngolo());
        System.out.println(angolo2.visualizzaAngolo());

        angolo1.aggiungiGradi(nummero);
        angolo2.aggiungiGradi(nummero);

        angolo1.aggiungiPrimi(nummero);
        angolo2.aggiungiPrimi(nummero);

        angolo1.aggiungiSecondi(nummero);
        angolo2.aggiungiSecondi(nummero);

        System.out.println(angolo1.angoloSecondi());
        System.out.println(angolo2.angoloSecondi());

        angolo1.secondiAngolo(nummero);
        angolo2.secondiAngolo(nummero);

        diffSecondi = angolo1.differenzaSecondi(angolo2);

        System.out.println(diffSecondi);

        angolo1.sommaAngolo(angolo2);

    }

}


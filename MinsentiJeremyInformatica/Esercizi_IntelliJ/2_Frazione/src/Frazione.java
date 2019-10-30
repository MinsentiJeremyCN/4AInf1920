/**
 * Created by inf.devigusm0708 on 23/09/2019.
 */
public class Frazione
{
    //Attributi

    private int numeratore;
    private int denominatore;

    //Metodi

    public Frazione()
    {
        super();//Serve per istanziare in memoria
    }

    public Frazione(int numeratore, int denominatore)
    {
        super();

        this.numeratore = numeratore;

        this.denominatore = denominatore;
    }

    public void setNumeratore(int numeratore)
    {
        this.numeratore = numeratore;
    }

    public int getNumeratore()
    {
        return numeratore;
    }

    public void setDenominatore(int denominatore)
    {
        this.denominatore = denominatore;
    }

    public int getDenominatore()
    {
        return denominatore;
    }

    //Restituisce una stringa con lo stato dell'oggetto
    public String toString()
    {
        return "Frazione {numeratore: " + numeratore + " denominatore: " + denominatore + "}";
    }

    public boolean equals(Frazione frazione)
    {
        boolean sonoUguali = false;

        if ((this.numeratore == frazione.getNumeratore() ) && (this.denominatore == frazione.getDenominatore() )) {
            sonoUguali = true;

        }

        return sonoUguali;
    }

    public static void main(String args[])
    {
        Frazione frazioneUnknownState = new Frazione();

        Frazione frazione1 = new Frazione(2, 5);

        boolean confrontoUguali = frazione1.equals(frazioneUnknownState);
        System.out.println("Sono uguali? " + confrontoUguali);

        System.out.println( frazione1.toString() );


    }



}

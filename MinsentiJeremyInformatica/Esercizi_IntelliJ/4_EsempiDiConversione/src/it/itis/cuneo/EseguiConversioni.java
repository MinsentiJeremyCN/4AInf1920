package it.itis.cuneo;

/**
 * Created by inf.devigusm0708 on 30/09/2019.
 */
public class EseguiConversioni
{

    public static void main(String[] args)
    {
        //float con la f minuscola è un tipo primitivo, cioè una variabile semplice
        //Float con la f maiuscola è una classe wrapper, contiene un primitivo dello stesso tipo e i metodi che ne permettono l'elaborazioni
        Float f;

        f = new Float(0.524d);

        // System.out.println(String s) la firma del metodo sopra richiede una stringa come parametro
        //quindi il float viene convertito automaticamente in una stringa al momento della chiamata
        System.out.println(f);

        int n;
        String quanteMele = "8";

        n = Integer.parseInt("6");

        System.out.println(n);




        int ni = 5;

        Float ogF;

        ogF = new Float(ni);

        System.out.println(ogF);




        String s = "5.25f";

        Float ogf;

        ogf = Float.parseFloat(s);

        System.out.println(ogf);




         Float ogF2;

        ogF2 = new Float(n);

        String s2;

        s2 = "" + ogF2;
        System.out.println("s2 = \"\" + ogF2: " + s2);

        s2 = new String("" + ogF2);
        System.out.println("s2 = new String(\"\" + ogF2): " + s2);

        s2 = ogF2.toString();
        System.out.println("s2 = ogF2.toString(): " + s2);




        double dN = 6.5d;
        int intN = (int) dN; //intN = 6
        Integer iN = new Integer(intN); // wrapper = primitivo no errore perchè è dello stesso tipo
        System.out.println(intN);

    }

}

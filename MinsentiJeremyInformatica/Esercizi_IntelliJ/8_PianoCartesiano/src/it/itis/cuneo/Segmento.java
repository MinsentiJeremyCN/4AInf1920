package it.itis.cuneo;

/**
 * Created by inf.minsentij2908 on 07/10/2019.
 */
public class Segmento {

    private Punto punto1;

    private Punto punto2;

    /*public Segmento(Punto punto1, Punto punto2)
    {
        this.punto1 = punto1;

        this.punto2 = punto2;
    }*/

    /*public Segmento(Punto punto1, Punto punto2)
    {
        this.punto1 = new Punto(punto1.getX(), punto1.getY());

        this.punto2 = new Punto(punto2.getX(), punto2.getY());
    }*/

    public Segmento(Punto punto1, Punto punto2)
    {
        this.punto1 = new Punto(punto1);

        this.punto2 = new Punto(punto2);
    }

    public Segmento(Segmento segmento)
    {
        punto1 = segmento.getPunto1();
        punto2 = segmento.getPunto2();
    }

    public void setPunto1(Punto punto1)
    {
        this.punto1 = punto1;
    }

    public void  setPunto2(Punto punto2) {this.punto2 = punto2;}

    public Punto getPunto1()
    {
        return punto1;
    }

    public Punto getPunto2()
    {
        return punto2;
    }

}

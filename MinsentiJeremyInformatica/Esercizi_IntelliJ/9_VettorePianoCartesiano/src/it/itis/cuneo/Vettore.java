package it.itis.cuneo;

import java.lang.Math;

public class Vettore {

    private  Punto punto1;
    private Punto punto2;

    public Vettore()
    {
        super();
    }

    public Vettore(Punto punto1, Punto punto2)
    {
        super();

        this.punto1 = new Punto(punto1);

        this.punto2 = new Punto(punto2);
    }

    public Vettore(Vettore vettore)
    {
        super();

        this.punto1 = vettore.getPunto1();

        this.punto2 = vettore.getPunto2();
    }


    public Punto getPunto1()
    {
        return punto1;
    }

    public Punto getPunto2()
    {
        return punto2;
    }

    public boolean equals(Vettore vettore)
    {
        boolean equals = false;

        if(punto1.getX() == vettore.punto1.getX())
        {
            if(punto2.getX() == vettore.punto2.getX())
            {
                equals = true;
            }
        }

        return equals;
    }

    public float lenght()
    {
       return (float) Math.sqrt((punto1.getX() * punto1.getX()) - (punto2.getX() * punto2.getX()) + ((punto1.getY() * punto1.getY()) - (punto2.getY() * punto2.getY())));
    }

    @Override
    public String toString()
    {
        return "Il Vettore ha come punto1: " + punto1.toString() + " " + " e come punto2: " + punto2.toString();
    }

    public static void main(String[] args)
    {
        float distanzaVettore1 = 0, distanzaVettore2 = 0;

        Punto puntoUnoOrigine = new Punto(5, 2);
        Punto puntoUnoVertice = new Punto(4, 7);

        Punto puntoDueOrigine = new Punto(1, 2);
        Punto puntoDueVertice = new Punto(3, 4);

       Vettore vettore1 = new Vettore(puntoUnoOrigine, puntoUnoVertice);

       Vettore vettore2 = new Vettore(puntoDueOrigine, puntoDueVertice);

        System.out.println(vettore1.equals(vettore2));

        distanzaVettore1 = vettore1.lenght();

        distanzaVettore2 = vettore2.lenght();

        System.out.println(distanzaVettore1);
        System.out.println(distanzaVettore2);

        System.out.println(vettore1.toString());
        System.out.println(vettore2.toString());
    }
}

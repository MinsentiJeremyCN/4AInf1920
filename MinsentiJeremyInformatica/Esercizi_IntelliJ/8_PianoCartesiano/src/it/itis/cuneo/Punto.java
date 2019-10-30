package it.itis.cuneo;

/**
 * Created by inf.minsentij2908 on 07/10/2019.
 */
public class Punto {

    private int x;
    private int y;

    public Punto()
    {
        super();
    }

    public Punto(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public Punto(Punto p)
    {
        x = p.getX();

        y = p.getY();
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    @Override
    public String toString()
    {
        return "Punto{\"x\": " + this.x + ", " + " \"y\": " + this.y + "}";
    }

    public static void main(String[] args)
    {
        //Referenziano due aree di memoria diverse.
        Punto puntoA = new Punto(4, 6);
        Punto puntoB = new Punto(puntoA);

        Punto puntoC = puntoA; //puntoC e puntoA referenziano come heandler la stessa area di memeoria.

        Punto puntoD = new Punto();

        System.out.println(puntoD.toString());

        System.out.println(puntoA.toString());
        System.out.println(puntoB.toString());
        System.out.println(puntoC.toString());

        //Se il richiamo al costruttore non viene svolto, ho un null pointer, non sa cosa fare.
    }
}

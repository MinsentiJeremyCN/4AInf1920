package it.itis.cuneo;

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

    public Punto(Punto punto)
    {
        x = punto.getX();
        y = punto.getY();
    }

    public void setY(int y)
    {
       this.y = y;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getX()
    {
        return  x;
    }

    public int getY()
    {
        return y;
    }

    public String toString()
    {
        return "Punto: " + x + ", " + y;
    }

}

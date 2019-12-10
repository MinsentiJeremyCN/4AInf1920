package it.itis.cuneo;

public class Quadrato implements Poligono {

    private int lato;

    public Quadrato(int lato) {
        this.lato = lato;
    }

    public int getLato() {
        return lato;
    }

    public void setLato(int lato) {
        this.lato = lato;
    }

    @Override
    public double calcolaArea() {
        return (lato*lato);
    }

    public static void main(String[] args) {

        Quadrato quadrato1 = new Quadrato(4);

        System.out.println(quadrato1.calcolaArea());

    }
}

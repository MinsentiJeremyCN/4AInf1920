package it.itis.cuneo;

public class Rettangolo implements Poligono {

    private int altezza;
    private int base;

    public Rettangolo(int altezza, int base) {
        this.altezza = altezza;
        this.base = base;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    @Override
    public double calcolaArea() {
        return (base*altezza);
    }

    public static void main(String[] args) {

        Rettangolo rettangolo1 = new Rettangolo(4,3);

        System.out.println(rettangolo1.calcolaArea());

    }
}

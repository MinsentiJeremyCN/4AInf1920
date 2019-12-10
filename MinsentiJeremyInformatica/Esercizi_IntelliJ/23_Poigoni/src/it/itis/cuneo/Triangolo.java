package it.itis.cuneo;

public class Triangolo implements Poligono {

    private int base;
    private int altezza;

    public Triangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    @Override
    public double calcolaArea() {
        return ((base*altezza)/2);
    }

    public static void main(String[] args) {

        Triangolo trianglo1 = new Triangolo(17,12);

        System.out.println(trianglo1.calcolaArea());

    }
}

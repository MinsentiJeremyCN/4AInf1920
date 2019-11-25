package it.itis.cuneo;

/**
 * Created by inf.minsentij2908 on 20/11/2019.
 */
public class Appartamento extends Abitazione {

    private int piano;
    private boolean haLift;
    private int nBalconi;

    public Appartamento(int nStanze, int superficie, int indirizzo, String citta, int piano, boolean haLift, int nBalconi) {
        super(nStanze, superficie, indirizzo, citta);
        this.piano = piano;
        this.haLift = haLift;
        this.nBalconi = nBalconi;
    }

    public Appartamento(Abitazione abitazione, int piano, boolean haLift, int nBalconi) {
        super(abitazione);
        this.piano = piano;
        this.haLift = haLift;
        this.nBalconi = nBalconi;
    }

    public int getPiano() {
        return piano;
    }

    public void setPiano(int piano) {
        this.piano = piano;
    }

    public boolean getHaLift() {
        return haLift;
    }

    public void setHaLift(boolean haLift) {
        this.haLift = haLift;
    }

    public int getnBalconi() {
        return nBalconi;
    }

    public void setnBalconi(int nBalconi) {
        this.nBalconi = nBalconi;
    }

    @Override
    public String toString() {
        return "Appartamento{" +
                "piano=" + piano +
                ", haLift=" + haLift +
                ", nBalconi=" + nBalconi +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Appartamento)) return false;
        if (!super.equals(o)) return false;

        Appartamento that = (Appartamento) o;

        if (piano != that.piano) return false;
        if (haLift != that.haLift) return false;
        return nBalconi == that.nBalconi;

    }
}

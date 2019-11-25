package it.itis.cuneo;

/**
 * Created by inf.minsentij2908 on 20/11/2019.
 */
public class Villa extends Abitazione {

    private int nPiani;
    private int superficieGiardino;
    boolean piscina;

    //Costruttore normale di Villa con abitazione
    public Villa(int nStanze, int superficie, int indirizzo, String citta, int nPiani, int superficie1, boolean piscina) {
        super(nStanze, superficie, indirizzo, citta);
        this.nPiani = nPiani;
        superficie = superficie1;
        this.piscina = piscina;
    }

    //Costruttore di copia, passiamo un oggetto abitazione copiato
    public Villa(Abitazione abitazione, int nPiani, int superficie, boolean piscina) {
        super(abitazione);
        this.nPiani = nPiani;
        this.superficieGiardino = superficie;
        this.piscina = piscina;
    }

    public Villa(Villa villa)
    {
        super();
    }

    public int getnPiani() {
        return nPiani;
    }

    @Override
    public int getSuperficie() {
        return superficieGiardino;
    }

    public boolean isPiscina() {
        return piscina;
    }

    public void setnPiani(int nPiani) {
        this.nPiani = nPiani;
    }

    @Override
    public void setSuperficie(int superficie) {
        this.superficieGiardino = superficie;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "nPiani=" + nPiani +
                ", superficie=" + superficieGiardino +
                ", piscina=" + piscina +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Villa)) return false;
        if (!super.equals(o)) return false;

        Villa villa = (Villa) o;

        if (nPiani != villa.nPiani) return false;
        if (superficieGiardino != villa.superficieGiardino) return false;
        return piscina == villa.piscina;

    }
}

package it.itis.cuneo;

/**
 * Created by inf.minsentij2908 on 11/11/2019.
 */
public class CD {

    private String titolo;
    private String autore;
    private int nBrani;
  private double durata;

    public CD()
    {
        super();
    }

    public CD(String titolo, String autore, int nBrani, double durata) {
        this.titolo = titolo;
        this.autore = autore;
        this.nBrani = nBrani;
        this.durata = durata;
    }

    public CD(CD cd) {
        this.titolo = cd.getTitolo();
        this.autore = cd.getAutore();
        this.nBrani = cd.getnBrani();
        this.durata = cd.getDurata();
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public int getnBrani() {
        return nBrani;
    }

    public double getDurata() {
        return durata;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setnBrani(int nBrani) {
        this.nBrani = nBrani;
    }

    public void setDurata(double durata) {
        this.durata = durata;
    }

    @Override
    public String toString() {
        return "CD{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", nBrani=" + nBrani +
                ", durata=" + durata +
                '}';
    }

    public boolean compareDurata(CD cd)
    {
        boolean equals = false;

        if (getDurata() == cd.getDurata()) {

            equals = true;
        }

        return equals;
    }

    public static void main(String[] args)
    {
        CD cd1 = new CD("Ciao", "n", 17, 12.8);
        CD cd2 = new CD("Ciao2", "n", 42, 12.8);

        System.out.println(cd1.toString());
        System.out.println(cd2.toString());

        System.out.println(cd1.compareDurata(cd2));
    }
}

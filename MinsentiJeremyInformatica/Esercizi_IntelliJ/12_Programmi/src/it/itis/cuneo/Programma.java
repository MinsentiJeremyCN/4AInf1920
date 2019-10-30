package it.itis.cuneo;

public class Programma {

    private String denominazione;
    private String produttore;
    private double versione;
    private String sistemaOperativo;
    private int anno;

    public Programma()
    {
        super();
    }

    public Programma(String denominazione, String produttore, double versione, String sistemaOperativo, int anno) {
        this.denominazione = denominazione;
        this.produttore = produttore;
        this.versione = versione;
        this.sistemaOperativo = sistemaOperativo;
        this.anno = anno;
    }

    public Programma(Programma programma) {
        this.denominazione = programma.getDenominazione();
        this.produttore = programma.getProduttore();
        this.versione = programma.getVersione();
        this.sistemaOperativo = programma.getSistemaOperativo();
        this.anno = programma.getAnno();
    }

    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }

    public void setProduttore(String produttore) {
        this.produttore = produttore;
    }

    public void setVersione(double versione) {
        this.versione = versione;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public String getDenominazione() {
        return denominazione;
    }

    public String getProduttore() {
        return produttore;
    }

    public double getVersione() {
        return versione;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public int getAnno()
    {
        return anno;
    }

    public String toString()
    {
        return "Il programma si chiama: " + denominazione + ", è stato creato da: " + produttore + ", versione: " + versione + ", sistema operativo: " + sistemaOperativo + ", anno rilascio: " + anno;
    }

    public String compareAnno(Programma programma1)
    {
        if (this.anno > programma1.getAnno())
        {
            return "Il primo programma è più recente";
        } else {
            return "Il secondo programma è più recente";
        }
    }

    public static void main(String[] args)
    {
        Programma programma1 = new Programma("IntelliJ", "Java", 1.9, "Windows", 2019);
        Programma programma2 = new Programma("Minecraft", "Mojang", 1.15, "Windows", 2020);

        System.out.println(programma1.toString());
        System.out.println(programma2.toString());

        System.out.println(programma1.compareAnno(programma2));
    }
}

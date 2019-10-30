public class Persona {

    private int eta;
    private String nome;
    private String sesso;
    private String professione;

    public Persona(int eta, String nome, String sesso, String professione)
    {
        this.eta = eta;
        this.nome = nome;
        this.sesso = sesso;
        this.professione = professione;
    }

    public void setEta(int eta)
    {
        this.eta = eta;
    }

    public void  setNome(String nome)
    {
        this.nome = nome;
    }

    public void setSesso(String sesso)
    {
        this.sesso = sesso;
    }

    public void  setProfessione(String professione)
    {
        this.professione = professione;
    }

    public int getEta()
    {
        return eta;
    }

    public String getNome()
    {
        return nome;
    }

    public String getSesso()
    {
        return sesso;
    }

    public String getProfessione()
    {
        return professione;
    }

    public String chiSei()
    {
        return "Sono una persona di nome: " + this.nome + "  Sesso: " + this.sesso + "  Età: " + this.eta + "  di professione pratico il/la: " + this.professione;
    }

   public static void main (String[] args)
   {
       Persona persona1 = new Persona(17, "Jeremy", "M", "Studente");

       System.out.println(persona1.chiSei());
   }

}

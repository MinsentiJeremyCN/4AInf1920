package it.itis.cuneo;

public class Biglietto {

    private String cognome;
    private String nome;
    private String telefono;
    private String cittaDiPartenza;
    private String CittaDiDestinazione;
    private String data;

    public Biglietto(String cognome, String nome, String telefono, String cittaDiPartenza, String cittaDiDestinazione, String data) {
        this.cognome = cognome;
        this.nome = nome;
        this.telefono = telefono;
        this.cittaDiPartenza = cittaDiPartenza;
        this.CittaDiDestinazione = cittaDiDestinazione;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Biglietto{" +
                "cognome='" + cognome + '\'' +
                ", nome='" + nome + '\'' +
                ", telefono='" + telefono + '\'' +
                ", cittaDiPartenza='" + cittaDiPartenza + '\'' +
                ", CittaDiDestinazione='" + CittaDiDestinazione + '\'' +
                ", data='" + data + '\'' +
                '}';
    }

    public String toStringCSV(){

        return cognome + ";" + nome + ";" + telefono + ";" + cittaDiPartenza + ";" + CittaDiDestinazione + ";" + data + ";" ;
    }
}

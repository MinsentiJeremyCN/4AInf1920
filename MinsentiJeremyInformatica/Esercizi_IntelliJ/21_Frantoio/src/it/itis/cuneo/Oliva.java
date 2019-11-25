package it.itis.cuneo;

import java.util.Calendar;

/**
 * Created by inf.minsentij2908 on 23/11/2019.
 */
public class Oliva {

    private String codiceOliva;
    private ColoreOliva coloreOliva;
    private MaturazioneOliva maturazioneOliva;
    private Calendar dataScadenza;

    public Oliva() {
    }

    public Oliva(String codiceOliva, ColoreOliva coloreOliva, MaturazioneOliva maturazioneOliva, Calendar dataScadenza) {
        this.codiceOliva = codiceOliva;
        this.coloreOliva = coloreOliva;
        this.maturazioneOliva = maturazioneOliva;
        this.dataScadenza = dataScadenza;
    }

    public Oliva(Oliva oliva) {
        this.codiceOliva = oliva.getCodiceOliva();
        this.coloreOliva = oliva.getColoreOliva();
        this.maturazioneOliva = oliva.getMaturazioneOliva();
        this.dataScadenza = oliva.getDataScadenza();
    }

    public String getCodiceOliva() {
        return codiceOliva;
    }

    public void setCodiceOliva(String codiceOliva) {
        this.codiceOliva = codiceOliva;
    }

    public ColoreOliva getColoreOliva() {
        return coloreOliva;
    }

    public void setColoreOliva(ColoreOliva coloreOliva) {
        this.coloreOliva = coloreOliva;
    }

    public MaturazioneOliva getMaturazioneOliva() {
        return maturazioneOliva;
    }

    public void setMaturazioneOliva(MaturazioneOliva maturazioneOliva) {
        this.maturazioneOliva = maturazioneOliva;
    }

    public Calendar getDataScadenza() {
        return dataScadenza;
    }

    public void setDataScadenza(Calendar dataScadenza) {
        this.dataScadenza = dataScadenza;
    }

    @Override
    public String toString() {
        return "Oliva{" +
                "codiceOliva='" + codiceOliva + '\'' +
                ", coloreOliva=" + coloreOliva +
                ", maturazioneOliva=" + maturazioneOliva +
                ", dataScadenza=" + dataScadenza +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Oliva)) return false;

        Oliva oliva = (Oliva) o;

        if (codiceOliva != null ? !codiceOliva.equals(oliva.codiceOliva) : oliva.codiceOliva != null) return false;
        if (coloreOliva != oliva.coloreOliva) return false;
        if (maturazioneOliva != oliva.maturazioneOliva) return false;
        return dataScadenza != null ? dataScadenza.equals(oliva.dataScadenza) : oliva.dataScadenza == null;

    }

}

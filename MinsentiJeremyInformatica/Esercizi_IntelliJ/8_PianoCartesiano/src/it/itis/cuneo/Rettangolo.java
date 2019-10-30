package it.itis.cuneo;

/**
 * Created by inf.minsentij2908 on 07/10/2019.
 */
public class Rettangolo {

    private Segmento segmentoAlto;
    private Segmento segmentoDestro;
    private Segmento segmentoBasso;
    private Segmento segmentoSinistro;

    public Rettangolo(Segmento segmentoAlto, Segmento segmentoDestro, Segmento segmentoBasso, Segmento segmentoSinistro)
    {
        this.segmentoAlto = new Segmento(segmentoAlto);
        this.segmentoDestro = new Segmento(segmentoDestro);
        this.segmentoBasso = new Segmento(segmentoBasso);
        this.segmentoSinistro = new Segmento(segmentoSinistro);
    }

    public Rettangolo(Rettangolo rettangolo)
    {
        segmentoAlto = new Segmento(Rettangolo.getSegmentoAlto());
        segmentoBasso = new Segmento(Rettangolo.getSegmentoBasso());
        segmentoDestro = new Segmento(Rettangolo.getSegmentoDestro());
        segmentoSinistro = new Segmento(Rettangolo.getSegmentoSinistro());
    }

    public Rettangolo(Rettangolo rettangolo)
    {
        segmentoAlto = rettangolo.getSegmentoAlto();
        segmentoBasso = rettangolo.getSegmentoBasso();
        segmentoDestro = rettangolo.getSegmentoDestro();
        segmentoSinistro = rettangolo.getSegmentoSinistro();
    }

    public void setSegmentoAlto(Segmento segmentoAlto)
    {
        this.segmentoAlto = segmentoAlto;
    }

    public void setSegmentoBasso(Segmento segmentoBasso)
    {
        this.segmentoBasso = segmentoBasso;
    }

    public void setSegmentoDestro(Segmento segmentoDestro)
    {
        this.segmentoDestro = segmentoDestro;
    }

    public void setSegmentoSinistro(Segmento segmentoSinistro)
    {
        this.segmentoSinistro = segmentoSinistro;
    }

    public Segmento getSegmentoAlto()
    {
        return segmentoAlto
    }

    public Segmento getSegmentoBasso()
    {
        return segmentoBasso;
    }

    public Segmento getSegmentoDestro()
    {
        return segmentoDestro;
    }

    public Segmento getSegmentoSinistro()
    {
        return segmentoSinistro;
    }

    public String toString()
    {
        return "Segmenti --> segmentoAlto: " + segmentoAlto + ", " + "segmentoDestro: " + segmentoDestro + ", " + "segmentoSinistro: " + segmentoSinistro + ", " + "segmentoBasso: " + segmentoBasso;
    }

}

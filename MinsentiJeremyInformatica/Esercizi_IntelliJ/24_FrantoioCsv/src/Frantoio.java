import java.util.ArrayList;
        import java.util.List;

/**
 * Created by d.claudio.borgogno on 23/11/2019.
 */
public class Frantoio {

    //List<E> è un interfaccia di ArrayList<E>
    //ArrayList<E> implementa List<E>
    private List<Oliva> listaOlive;
    private FrantoioCsv frantoioCsv;

    public Frantoio() { super(); }
    public Frantoio(List<Oliva> listaOlive) {
        this.listaOlive = new ArrayList<Oliva>();
        frantoioCsv = new FrantoioCsv();
    }

    public static void main(String[] args) {
        Frantoio frantoio = new Frantoio();
        frantoio.simula();

        frantoio.getFrantoioCsv().scrivereFile(frantoio.getListaOlive() );
    }
}

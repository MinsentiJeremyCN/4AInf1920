

/**
 * Created by inf.minsentij2908 on 24/10/2019.
 */
public class EccezionaleConMetodi {

    public void metodo1() throws Exception
    {
        metodo2();
    }

    public void metodo2() throws Exception
    {
        throw new Exception("Eccezionee dal metodo2");
    }

    public static void main(String[] args) throws Exception{

        EccezionaleConMetodi eccezionaleConMetodi = new EccezionaleConMetodi();

        eccezionaleConMetodi.metodo1();

    }

}

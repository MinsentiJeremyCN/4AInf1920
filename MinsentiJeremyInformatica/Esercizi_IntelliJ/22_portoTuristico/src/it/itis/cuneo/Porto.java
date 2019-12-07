package it.itis.cuneo;

import java.util.Arrays;
import java.util.Objects;

public class Porto {
    private Barca[] barca;
    private static final int POSTIMAX = 100;
    private static int POSTIRIMANENTI = 100;
    private int cont;

    // costruttore
    public Porto() {
        barca = new Barca[POSTIMAX];
        cont = 0;
    }

    public Porto(Porto porto) {
        this.barca = porto.getBarca();
        this.cont = porto.getCont();
    }

    public Barca[] getBarca() {
        return barca;
    }

    public void setBarca(Barca[] barca) {
        this.barca = barca;
    }

    public int getPOSTIMAX() {
        return POSTIMAX;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    @Override
    public String toString() {
        return "Porto{" +
                "barca=" + Arrays.toString(barca) +
                ", cont=" + cont +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Porto)) return false;
        Porto porto = (Porto) o;
        return cont == porto.cont &&
                Arrays.equals(barca, porto.barca);
    }

    public void assegnaPosto(Barca[] barca, int cont, int tipo)
    {
        if (POSTIRIMANENTI== 0)
        {
            return 0;
        }
        boolean libero = false;

        if (tipo == 0)
  
        {
            cont= 49;

            while (libero==false)
            {
                if (barca[cont] == null)
                {
                    libero = true;
                }
                else
                {
                    cont++;
                }
            }
            barca[cont] = new BarcaVela();
            addInformazioni(barca, cont);
        }
        else
 
        {
            cont=0;
            while (libero==false)
            {
                if (barca[cont] == null)
                {
                    libero = true;
                }
                else
                {
                    cont++;
                }
            }
            addInformazioni(barca , cont);
            POSTIRIMANENTI = POSTIRIMANENTI-1;
        }

    }

    private void addInformazioni(Barca[] barca , int cont) {
        barca[cont].setNome(InputOutputUtility.leggiNome());
        barca[cont].setLunghezza(InputOutputUtility.leggiNumero());
        barca[cont].setNazionalita(InputOutputUtility.leggiNome());
        barca[cont].setStazza(InputOutputUtility.leggiNumero());
    }

    private int liberaPosto(Barca[] barca , int contatore) {
        int costo = 0;
        System.out.println("Inserisci quanti giorni ha sostato la barca");
        int giorni = InputOutputUtility.leggiNumero();
        int postoDaLiberare = InputOutputUtility.leggiNumero();
        contatore = postoDaLiberare;
        for (int i=0; i<giorni; i++)
        {
            costo = costo + 15;
        }
        POSTIRIMANENTI = POSTIRIMANENTI+1;
        barca[contatore] = null;
        return costo;
    }

    public static void main(String[] args) {
        Porto porto= new Porto();
        porto.assegnaPosto(porto.barca, porto.cont, 0);
        porto.liberaPosto()(porto.barca, porto.cont, 0);
        System.out.println(porto.toString());
    }


}

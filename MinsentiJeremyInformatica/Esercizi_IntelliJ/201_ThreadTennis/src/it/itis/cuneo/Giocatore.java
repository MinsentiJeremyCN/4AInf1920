package it.itis.cuneo;

/**
 * Created by inf.minsentij2908 on 12/12/2019.
 */
public class Giocatore extends  Thread {

    public static final int MIN =2;
    public static final int MAX =6;
    private CampoDaTennis campoDaTennis;
    private String name;

    public Giocatore(String name, CampoDaTennis campoDaTennis)
    {
        this.name = name;
        this.campoDaTennis = campoDaTennis;
    }

    public void run()
    {
        //import Math.*;
        //Math.random(): 0..1
        //(Math.random()*(MAX-MIN): -> 0...4
        long estrazione = Math.round(Math.random()* (MAX-MIN) +MIN);

        System.err.println(name+ ": " + estrazione);
        campoDaTennis.setPunteggio1(estrazione);
    }
}

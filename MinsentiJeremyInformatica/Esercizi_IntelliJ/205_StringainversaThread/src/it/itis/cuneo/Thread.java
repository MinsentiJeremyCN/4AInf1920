package it.itis.cuneo;

public class Thread {

    public static final String stringa = "Ciao" ;

    public static int delayTotale = 0;

    public static void main(String[] args) {

        CarattereInverso carattere = new CarattereInverso(stringa, 0);

        carattere.start();

        try {

            carattere.join();

        } catch (InterruptedException e) {

            e.printStackTrace();

        }
    }

}

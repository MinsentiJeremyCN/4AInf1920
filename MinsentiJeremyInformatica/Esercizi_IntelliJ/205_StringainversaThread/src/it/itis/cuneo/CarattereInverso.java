//Stringa inversa di Minsenti Jeremy 11/03/2020
package it.itis.cuneo;

import java.util.Random;

public class CarattereInverso extends java.lang.Thread {

    public static final int MINIMO = 1000;
    public static final int MAASSIMO = 3000;

    private String string;

    private int index;

    public CarattereInverso(String string, int index) {
        this.string = string;
        this.index = index;
    }

    public String getString() {
        return string;
    }

    public void setString(String stringa) {
        this.string = stringa;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void run()
    {
        if (index < string.length()) {

            CarattereInverso carattereInverso = new CarattereInverso(string, index+1);

            carattereInverso.start();
            try{

                carattereInverso.join();

            } catch (InterruptedException e) {

                e.printStackTrace();
            }

            Random random = new Random();

            int delay = random.nextInt((MAASSIMO - MINIMO) + 1) + MINIMO;

            try {

                sleep(delay);

                Thread.delayTotale += delay;

            } catch (InterruptedException e) {

                e.printStackTrace();
            }

            System.out.println("'" + string.charAt(index)  + "' " + "Delay: " + delay + "ms");
        }
    }


    @Override
    public String toString() {
        return "Stringa{" +
                "stringa='" + string + '\'' +
                ", i=" + index +
                '}';
    }

}

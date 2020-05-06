package it.itis.cuneo;

public class Semaforo {

    private int valore;

    public Semaforo() {
        valore = 0;
    }
    public Semaforo(int v) {
        valore = v;
    }

    public synchronized void up() {
        valore++;
        notify();
    }
    public synchronized void down() {
        while(valore==0) {
            try {
                wait();
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
        valore--;
    }


}

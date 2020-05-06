package it.itis.cuneo;

public class Main {

    private Semaforo Mutex;
    private int shm;

    public Semaforo getMutex() {
        return Mutex;
    }

    public void setMutex(Semaforo mutex) {
        Mutex = mutex;
    }

    public int getShm() {
        return shm;
    }

    public void setShm(int shm) {
        this.shm = shm;
    }

    public Main(Semaforo mutex, int shm) {
        Mutex = mutex;
        this.shm = shm;
    }

    public Main() {
    }

    public static void main(String[] args) {
        int shm = 20;
        Semaforo mutex = new Semaforo(1);
        Main main = new Main(mutex, shm);
        ThreadDecrementatore th1 = new ThreadDecrementatore(main);
        ThreadDecrementatore th2 = new ThreadDecrementatore(main);
        ThreadDecrementatore th3 = new ThreadDecrementatore(main);

        /*Start Thread*/
        th1.start();
        th2.start();
        th3.start();

        try {
            th1.join();
            th2.join();
            th3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        System.out.println("TH1: " + th1.getCycles());
        System.out.println("TH2: " + th2.getCycles());
        System.out.println("TH3: " + th3.getCycles());
    }




}

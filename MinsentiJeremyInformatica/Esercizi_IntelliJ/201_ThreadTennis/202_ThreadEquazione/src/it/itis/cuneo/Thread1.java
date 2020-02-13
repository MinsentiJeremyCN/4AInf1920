package it.itis.cuneo;

/**
 * Created by inf.minsentij2908 on 13/02/2020.
 */
public class Thread1 extends Thread  {

    private Buffer buffer;

    public Thread1(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run(){

        buffer.setX( buffer.getA()*6 ); //x = (a * 6)

        try {

            Thread.sleep((long) Math.random() * 5000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(" X: " + buffer.getX());
    }
}

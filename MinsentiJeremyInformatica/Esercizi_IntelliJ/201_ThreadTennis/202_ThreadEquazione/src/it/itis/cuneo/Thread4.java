package it.itis.cuneo;

/**
 * Created by inf.minsentij2908 on 13/02/2020.
 */
public class Thread4 extends Thread  {

    private Buffer buffer;

    public Thread4(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run(){

        buffer.setB( buffer.getA() * 3 ); //b = (a * 3)

        try {

            Thread.sleep((long) Math.random() * 5000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(" B: " + buffer.getB());


    }
}

package it.itis.cuneo;

/**
 * Created by inf.minsentij2908 on 13/02/2020.
 */
public class Thread2 extends Thread  {

    private Buffer buffer;

    public Thread2(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run(){

        buffer.setY( buffer.getX() + 3 ); //y = (x + 3)

        try {

            Thread.sleep((long) Math.random() * 5000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(" Y: " + buffer.getY());


    }

}

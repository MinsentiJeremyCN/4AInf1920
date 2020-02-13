package it.itis.cuneo;

/**
 * Created by inf.minsentij2908 on 13/02/2020.
 */
public class Thread3 extends Thread  {

    private Buffer buffer;

    public Thread3(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run(){

        buffer.setZ( buffer.getY() * 2 ); //z = (y * 2)

        try {

            Thread.sleep((long) Math.random() * 5000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(" Z: " + buffer.getZ());


    }
}

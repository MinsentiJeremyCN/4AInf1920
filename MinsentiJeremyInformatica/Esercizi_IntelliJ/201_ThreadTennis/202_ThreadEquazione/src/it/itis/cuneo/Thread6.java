package it.itis.cuneo;

/**
 * Created by inf.minsentij2908 on 13/02/2020.
 */
public class Thread6 extends Thread  {

    private Buffer buffer;

    public Thread6(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run(){

        buffer.setD( buffer.getC() * 5 ); //d = (c * 5)

        try {

            Thread.sleep((long) Math.random() * 5000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println(" D: " + buffer.getD());

    }

}

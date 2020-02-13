package it.itis.cuneo;

/**
 * Created by inf.minsentij2908 on 13/02/2020.
 */
public class Thread7 extends Thread {

    private Buffer buffer1;
    private Buffer buffer2;

    public Thread7(Buffer buffer1, Buffer buffer2) {
        this.buffer1 = buffer1;
        this.buffer2 = buffer2;
    }

    public void run(){

        buffer1.setW( buffer1.getZ() + buffer2.getD() ); //w = (z + d)

        try {

            Thread.sleep((long) Math.random() * 5000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(" W: " + buffer1.getW());

    }

}

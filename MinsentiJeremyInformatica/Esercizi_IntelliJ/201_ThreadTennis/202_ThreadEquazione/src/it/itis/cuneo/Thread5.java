package it.itis.cuneo;

/**
 * Created by inf.minsentij2908 on 13/02/2020.
 */
public class Thread5 extends Thread  {

    private Buffer buffer;

    public Thread5(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run(){

        buffer.setC( buffer.getB() + 4 ); //c = (b + 4)

        try {

            Thread.sleep((long) Math.random() * 5000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(" C: " + buffer.getC());


    }


}

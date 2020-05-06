package it.itis.cuneo;

public class ThreadDecrementatore extends Thread {

    private Main dataInput;
    private int cycles;

    public ThreadDecrementatore(Main dataInput) {
        this.dataInput = dataInput;
    }

    public ThreadDecrementatore() {
    }

    public Main getDataInput() {
        return dataInput;
    }

    public void setDataInput(Main dataInput) {
        this.dataInput = dataInput;
    }

    public int getCycles() {
        return cycles;
    }

    public void setCycles(int cycles) {
        this.cycles = cycles;
    }



    public void run(){

        this.getDataInput().getMutex().down();
        while(this.getDataInput().getShm() > 0){
            this.getDataInput().getMutex().up();
            //t1              t2
            //1 - 1 = 0        0
            this.getDataInput().getMutex().down();
            if(this.getDataInput().getShm() > 0){
                this.getDataInput().setShm(this.getDataInput().getShm() - 1);
                this.setCycles(this.getCycles() + 1);
            }
            this.getDataInput().getMutex().up();
            System.out.println(this.getDataInput().getShm());
            this.getDataInput().getMutex().down();
        }
        this.getDataInput().getMutex().up();

    }



}

package it.itis.cuneo;

/**
 * Created by inf.minsentij2908 on 13/02/2020.
 */
public class Buffer {

    /*Parametro*/
    private int a;

    /*Variabili matematiche*/
    private int x, y ,z, b, c, d, w;

    public Buffer() {


    }

    public Buffer(int a, int x, int y, int z, int b, int c, int d, int w) {
        this.a = a;
        this.x = x;
        this.y = y;
        this.z = z;
        this.b = b;
        this.c = c;
        this.d = d;
        this.w = w;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Buffer{" +
                "a=" + a +
                ", x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                ", w=" + w +
                '}';
    }
}

package it.itis.cuneo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by inf.minsentij2908 on 30/10/2019.
 */
public class Calcolatrice {

    private static InputStreamReader r = new InputStreamReader(System.in);
    private static BufferedReader br = new BufferedReader(r);


    public static String input() {
        String a = null;

        System.out.print("Inserisci il numero:   ");
        try {
            a = br.readLine();
        } catch (IOException e) {
            // TODO Auto-generated catch blockSe
            e.printStackTrace();
        }
        return a;
    }

    public static void main(String[] args) {
        double a = 0, b = 0;

            /*
            Parsificazione input
             */
        a = Double.parseDouble(input());
        b = Double.parseDouble(input());

        // TODO Non lancia l'eccezione perché dichiarate variabili double
        try {
            double c = a / b;
        } catch (ArithmeticException ex) {
            System.out.println("Non puoi fare una divisione per 0, inserisci un numero adatto");
            b = Double.parseDouble(input());
        } finally {
            System.out.println("Valore ricevuto");
            // TODO Inserire ciclo che fa ricominciare dal try, chiedo delucidazioni in merito al docente
        }


        System.out.println("Somma dei due valori:" + (a + b));
        System.out.println("Differenza dei due valori:" + (a - b));
        System.out.println("Moltiplicazione dei due valori:" + (a * b));
        System.out.println("Divisione dei due valori:" + (a / b));
    }
}

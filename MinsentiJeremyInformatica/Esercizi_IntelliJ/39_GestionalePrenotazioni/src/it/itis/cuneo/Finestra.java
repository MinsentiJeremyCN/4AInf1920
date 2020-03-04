//Gestionale GUI Minsenti Jeremy 4^Ainf
package it.itis.cuneo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Finestra extends JFrame implements ActionListener {

    public static final String FILE_PATH = "C:\\Users\\Jeremy Minsenti\\Desktop\\Mio\\39_GestionalePrenotazioni\\src\\it\\itis\\cuneo\\Biglietto.csv";

    JLabel lCognome;
    JLabel lNome;
    JLabel lTelefono;
    JLabel lcittaDiPartenza;
    JLabel lcittaDiDestinazione;
    JLabel lData;

    JTextField tCognome;
    JTextField tNome;
    JTextField tTelefono;
    JTextField tCittaDiPartenza;
    JTextField tCittaDiDestinazione;
    JTextField tData;

    JButton bConferma;
    JButton bAnnulla;
    JButton bStampa;

    Lista lista = new Lista();

    public Finestra(){

        setTitle("Biglietto Personale");//Titolo finestra
        setLocation(100,200);//Distanza dall'angolo in alto a sinistra

        init();//Variabile per la creazione dei contenuti
        pack();//Crea la grandezza della finestra in base al suo contenuto

        setVisible(true);//La rendiamo visibile

        setDefaultCloseOperation(EXIT_ON_CLOSE);//Chiude il programma

    }

    public void init(){

        Container container = this.getContentPane();//Si puo' aggiungere qualcosa al JFrame solo usando il getContentPane()

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(8, 2));

        JPanel southernPanel = new JPanel();
        southernPanel.setLayout(new FlowLayout());

        lCognome = new JLabel("Cognome:");
        centerPanel.add(lCognome);
        tCognome = new JTextField(20);
        centerPanel.add(tCognome);

        lNome = new JLabel("Nome:");
        centerPanel.add(lNome);
        tNome = new JTextField(20);
        centerPanel.add(tNome);

        lTelefono = new JLabel("Telefono:");
        centerPanel.add(lTelefono);
        tTelefono = new JTextField(20);
        centerPanel.add(tTelefono);

        lcittaDiPartenza = new JLabel("Città di partenza:");
        centerPanel.add(lcittaDiPartenza);
        tCittaDiPartenza = new JTextField(20);
        centerPanel.add(tCittaDiPartenza);

        lcittaDiDestinazione = new JLabel("Città di destinazione:");
        centerPanel.add(lcittaDiDestinazione);
        tCittaDiDestinazione = new JTextField(20);
        centerPanel.add(tCittaDiDestinazione);

        lData = new JLabel("Data:");
        centerPanel.add(lData);
        tData = new JTextField(20);
        centerPanel.add(tData);


        bConferma = new JButton("Conferma");
        southernPanel.add(bConferma);
        bConferma.addActionListener(this);//Ogni volta che il pulsante viene premuto esegue la sua azione

        bAnnulla = new JButton("Annulla");
        southernPanel.add(bAnnulla);
        bAnnulla.addActionListener(this);

        bStampa = new JButton("Stampa");
        southernPanel.add(bStampa);
        bStampa.addActionListener(this);

        container.add(centerPanel, BorderLayout.CENTER);//Allineamento
        container.add(southernPanel, BorderLayout.SOUTH);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        if(actionEvent.getSource() == bConferma){
            //Portiamo tutto in variabili locali per passare al biglietto
            String cognome = tCognome.getText();
            String nome = tNome.getText();
            String telefono = tTelefono.getText();
            String cittaDiPartenza = tCittaDiPartenza.getText();
            String cittaDiDestinazione = tCittaDiDestinazione.getText();
            String data = tData.getText();

            Biglietto biglietto = new Biglietto(cognome, nome, telefono, cittaDiPartenza, cittaDiDestinazione, data);
            lista.add(biglietto);//aggiungiamo alla classe lista (array) una classe biglietto

            try {
                toRowCSV();
            } catch (IOException e) {
                e.printStackTrace();
            }

            pulisciCampo();

        }else if(actionEvent.getSource() == bAnnulla){

            pulisciCampo();

        }else if(actionEvent.getSource() == bStampa){

            JOptionPane.showMessageDialog(null, lista.toString());

        }
    }

    public void pulisciCampo(){

        tCognome.setText("");//SetText per modificare il contenuto
        tNome.setText("");
        tTelefono.setText("");
        tCittaDiPartenza.setText("");
        tCittaDiDestinazione.setText("");
        tData.setText("");

    }

    public void toRowCSV() throws IOException{
        File file = new File(FILE_PATH);

        FileWriter fileWriter = null;

        try {

            fileWriter = new FileWriter(file);

            for (int index = 0; index < lista.size()/*Cicla tante volte quante il contenuto della lista*/; index++) {

                fileWriter.write(lista.get(index).toStringCSV());
                fileWriter.write('\r');
                fileWriter.write('\n');

            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            fileWriter.close();
        }

    }

    public static void main(String[] args) {

        Finestra finestra = new Finestra();

    }



}

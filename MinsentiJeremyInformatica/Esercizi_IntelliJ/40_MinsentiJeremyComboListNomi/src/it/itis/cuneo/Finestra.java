//ComboBox Minsenti Jeremy

package it.itis.cuneo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Finestra extends JFrame implements ActionListener{

    JLabel lCognome;
    JLabel lNome;

    JTextField tCognome;
    JTextField tNome;

    JButton bConferma;

    JList listaNomiCognomi;
    DefaultListModel listModel;

    JComboBox comboNomiCognomi;
    DefaultComboBoxModel comboBoxModel;

    public Finestra(){

        setTitle("ComboBox Nome e Cognome");
        setLocation(100, 200);

        init();
        pack();

        setVisible(true);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void init(){

        Container container = this.getContentPane();

        setLayout( new FlowLayout());

        JPanel rightPanel = new JPanel();

        JPanel leftPanel = new JPanel();

        lCognome = new JLabel("Cognome:");
        leftPanel.add(lCognome);
        tCognome = new JTextField(20);
        leftPanel.add(tCognome);

        lNome = new JLabel("Nome:");
        leftPanel.add(lNome);
        tNome = new JTextField(20);
        leftPanel.add(tNome);

        bConferma = new JButton("Conferma");
        leftPanel.add(bConferma);
        bConferma.addActionListener(this);

        listModel = new DefaultListModel();
        listModel.addElement("Cognome e Nome");
        listaNomiCognomi = new JList(listModel);
        JScrollPane jsp = new JScrollPane(listaNomiCognomi);
        rightPanel.add(jsp);

        comboBoxModel = new DefaultComboBoxModel();
        comboBoxModel.addElement("Cognome e Nome");
        JComboBox comboNomiCognomi = new JComboBox(comboBoxModel);
        JScrollPane jsp2 = new JScrollPane(comboNomiCognomi);
        rightPanel.add(jsp2);

        container.add(leftPanel, BorderLayout.WEST);//Allineamento
        container.add(rightPanel, BorderLayout.EAST);

    }

    public void actionPerformed(ActionEvent actionEvent){

        if(actionEvent.getSource() == bConferma){

            String cognomeNome;

            cognomeNome = tCognome.getText() + " " + tNome.getText();

            listModel.addElement(cognomeNome);

            comboBoxModel.addElement(cognomeNome);

            pulisciCampo();

        }else{
            JOptionPane.showMessageDialog(null, "Inserisci Cognome e Nome!");
        }

    }

    public void pulisciCampo(){

        tCognome.setText("");
        tNome.setText("");

    }


    public static void main(String[] args) {

        Finestra finestra = new Finestra();

    }

}
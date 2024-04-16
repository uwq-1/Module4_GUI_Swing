/*
    Name : Garson Hutchinson        ID: 2101012660
*/

import javax.swing.*;


public class Main {

    public static void main (String[] args ){

        Currency form = new Currency();

        JFrame frame = new JFrame("Currency Converter");

        frame.setContentPane(new Currency().getPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,500);
        // Display the window
        frame.pack();
        frame.setVisible(true);

    }

}

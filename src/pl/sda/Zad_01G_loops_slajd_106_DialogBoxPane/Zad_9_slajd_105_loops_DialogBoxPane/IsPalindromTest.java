package pl.sda.Zad_01G_loops_slajd_106_DialogBoxPane.Zad_9_slajd_105_loops_DialogBoxPane;

import javax.swing.*;

/*
9. (*) Napisz metodę sprawdzającą, czy dany łańcuch znaków jest palindromem.
 */
public class IsPalindromTest {

    public static void main(String[] args) {
        System.out.println();
        String tekst = JOptionPane.showInputDialog("Sprawdź, czy wpisany w polu poniżej tekst jest palindromem:");

        // sprawdzenie
        System.out.println("Tekst ["+tekst+"] jest palindromem? -> "+textIsPalindrom(tekst));

    } // main();

    public static boolean textIsPalindrom(String text){
        String tekst = text.toLowerCase();
        char[] chars = tekst.toCharArray();
        String reversetekst ="";
        for (int i=tekst.length()-1; i>=0;i--) reversetekst+= chars[i];
        return tekst.equals(reversetekst);
    } // textIsPalindrom()
} // class IsPalindromTest

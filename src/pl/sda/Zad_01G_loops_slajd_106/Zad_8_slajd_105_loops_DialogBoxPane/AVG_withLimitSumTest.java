package pl.sda.Zad_01G_loops_slajd_106.Zad_8_slajd_105_loops_DialogBoxPane;

import javax.swing.*;

/*
8. (*) Utwórz program, który będzie pobierał od użytkownika liczby typu float,
   aż do momentu osiągnięcia limitu podanego jako parametr metody.
   Na koniec wypisz ile było tych liczb, jaka była ich suma (z częścią ułamkową)
   i jaka jest ich średnia arytmetyczna.
 */
public class AVG_withLimitSumTest {

    public static void main(String[] args) {
       String numberInText = JOptionPane.showInputDialog("Podaj max wartość sumy liczb");
       double limit = Double.valueOf(numberInText);

       //sprawdzenie
       calculateSumAVG(limit);
    } // main();

    public static void calculateSumAVG(double limit){
        double kolejna, sum = 0;
        int ile = 0;
        while (sum<limit) {
            String numberInText = JOptionPane.showInputDialog("Podaj kolejną liczbę:  >"+(limit-sum)+" spowoduje przekroczenie limitu sumy.");
            kolejna = Double.valueOf(numberInText);
            if ((sum+kolejna)>limit) break;  // przerwij, gdy po dodaniu przekroczony limit
            ile++;
            sum+=kolejna;
        } //while
        System.out.println("\nśrednia dla sumy="+sum+" wprowadzonych "+ile+" liczb wynosi: "+(sum/ile));
    } // calculateSumAVG();

} //class AVG_withLimitSumTest

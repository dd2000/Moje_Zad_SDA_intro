package pl.sda.Zad_01G_loops_slajd_106.Zad_7_slajd_105_loops_DialogBoxPane;

import javax.swing.*;

/*
7. (*) Napisz metodę która wyświetli na ekranie prostokąt
   o podanych rozmiarach: width i height (to są parametry metody).
   (?)Podpowiedź: zobacz metodę: pl.sda.loops.ForLoop.leftTriangle()
 */
public class RectangleAsterixTest {
    public static void main(String[] args) {
        System.out.println();

        // wczytanie szerokości (kolumny) - DialogBox
        String numberInString = JOptionPane.showInputDialog("Podaj szerokość prostokąta:");
        int width = Integer.valueOf(numberInString);
        // wczytanie wysokości (wiersze) - DialogBox
        numberInString = JOptionPane.showInputDialog("Podaj wysokość prostokąta:");
        int height = Integer.valueOf(numberInString);

        // rysowanie prostokąta z gwiazdek
        showRectangle(height, width);

    } // main();


    public static void showRectangle(int height,int width) {
        for (int w = 1; w <= height; w++){
            for (int k = 1; k <= width; k++) {
                System.out.print("*");
            } // for k
            System.out.println();
        } // for w
    } // showRectangle(...);


} // class RectangleAsterixTest

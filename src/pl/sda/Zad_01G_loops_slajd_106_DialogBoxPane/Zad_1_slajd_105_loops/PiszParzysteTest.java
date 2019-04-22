package pl.sda.Zad_01G_loops_slajd_106_DialogBoxPane.Zad_1_slajd_105_loops;

/*
Napisz metodę, która wyświetli na ekranie n-pierwszych liczb parzystych.
Zmienna n to parametr metody. Czyli np. dla n = 4 program powinien wypisać: 2, 4, 6, 8
*/


public class PiszParzysteTest {

    public static void piszParzyste(int ile){
        for (int i=1; i<=ile; i++)
            System.out.print(2*i + " ");
    }  //piszParzyste


    public static void main(String[] args) {
        int n=7;  // ilość wypisywanych kolejnych liczb parzystych
        piszParzyste(n);
    }  // main

}  // Zad_01_piszParzyste class

package pl.sda.Zad_01I_arrays_slajd_123;
/*
1. Napisz metodę, która jako parametr przyjmuje zmienną typu String[]
   i wyświetla wszystkie elementy tablicy na konsoli (użyj różnych rodzajów pętli).

*/
public class Arrays1Test {
    public static void main(String[] args) {
        // utworzenie tablicy z imionami
        String[] imiona = {"Ala", "Ola", "Iza", "Kasia", "Basia", "Zyta"};

        // wywołanie metody (funkcji) dla utworzonej tablicy
        wypiszTab(imiona);
    } // main()

    // Napisz metodę: wypisywanie elementów tablicy stosując różne rodzaje pętli
    public static void wypiszTab(String[] tab){
        int lengthTab = tab.length; // odczytanie liczby elementów w tablicy

        // a)
        System.out.println("\n\nWypisanie elementów tablicy wykorzystując pętlę for():");
        for (int i=0;i<lengthTab;i++) System.out.print(tab[i]+" ");

        // b)
        System.out.println("\n\nWypisanie elementów tablicy wykorzystując pętlę do...while():");
        int i=0;
        if (lengthTab>0)
          do{
                System.out.print(tab[i]+" ");
                i++;
            } while (i<lengthTab); // do - while

        // c)
        System.out.println("\n\nWypisanie elementów tablicy wykorzystując pętlę while(){}:");
        int k=0;
        while (k<lengthTab){
                System.out.print(tab[k]+" ");
                k++;
            } // while

        // d)
        System.out.println("\n\nWypisanie elementów tablicy wykorzystując pętlę foreach(typ el: tab)");
        for (String el: tab) {
            System.out.print(el+" ");
        } // foreach

    } // wypiszTab()
} // class Arrays1Test

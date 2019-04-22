package pl.sda.Zad_01G_loops_slajd_106_DialogBoxPane.Zad_3_slajd_105_loops;

/*
    Wypisz na ekran co drugą, dużą literę alfabetu łacińskiego,
    zaczynając od 'A' i kończąc na 'Z'.
    Użyj pętli for, a potem spróbuj przerobić program używając pętli while.
*/


public class Co2LiteryTest {

    public static void main(String[] args) {

        System.out.println("\nCo druga litera (A-Z) - pętla for:");
        for (int i='A'; i<='Z'; i=i+2)
        System.out.print((char) i + " ");

        System.out.println("\n\nCo druga litera (A-Z) - pętla while:");
        int znak = 'A';
        while (znak<='Z'){
            System.out.print((char) znak + " ");
            znak = znak+2;
        }  //while
    }

} //Zad_03_litery_co_2

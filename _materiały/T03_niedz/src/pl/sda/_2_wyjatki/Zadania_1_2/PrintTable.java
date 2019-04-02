package pl.sda._2_wyjatki.Zadania_1_2;
/*
    1. Dodaj obsługę wyjątków w klasach GetNumber oraz PrintTable.
    2. Dodaj sekcję finally, która w klasach GetNumber oraz PrintTable wykona się i wyświetli komunikat końcowy.

 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        try {        // kod, w którym mogą powstać wyjątki
            Scanner scanner = new Scanner(System.in);
            int index = scanner.nextInt();
            String[] fruits = new String[]{"apple", "organe", "mango", "cheery"};
            System.out.println(fruits[index]);
        }
        catch(InputMismatchException ime) {      // obsługa wyjatku pierwszego rodzaju: nie wprowadzono int-a
            System.out.println("Błąd: 'nie wprowadzono poprawnej liczby int' " + ime);
        } // catch 1
        catch(ArrayIndexOutOfBoundsException aioobe)
        {     // obsługa wyjątku drugiego rodzaju: przekroczenie zakresu indeksów tablicy
            System.out.println("Wystąpił błąd:'Próba dostepu do indeksu tablicy, który nie istnieje'" + aioobe);
        } // catch 2
        finally {
            System.out.println("Program zakończył działanie po wykonaniu obsługi błedów.");
        } // finally
    }  // main
}      // class PrinTable



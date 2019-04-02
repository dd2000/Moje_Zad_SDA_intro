package pl.sda._2_wyjatki.Zadania_1_2;

/*
    1. Dodaj obsługę wyjątków w klasach GetNumber oraz PrintTable.
    2. Dodaj sekcję finally, która w klasach GetNumber oraz PrintTable wykona się i wyświetli komunikat końcowy.

 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try { // kod, w którym moze wystąpić wyjatek
            int number = scanner.nextInt();
            System.out.println(number);
        } // try
        // uruchamiasz kod z błędną wartościa (np podajesz aaa zamiast spodziewanej liczby,
        // z komunikatu dowiesz się jaka jest nazwa wyjatku

        // dla zmiennej wyjątku bierze sie zwykle pierwsze litery
        // np. typ wyjatku: InputMismatchException   nazwa zmiennej: ime
        catch (InputMismatchException ime) {  // co zrobić, gdy wyjatek wystapi
            System.out.println("Wystapił błąd: "+ime);

        } // catch
        finally {
            System.out.println("Program zakończył działanie po wykonaniu obsługi błedów.");
        } // finally


    }
}

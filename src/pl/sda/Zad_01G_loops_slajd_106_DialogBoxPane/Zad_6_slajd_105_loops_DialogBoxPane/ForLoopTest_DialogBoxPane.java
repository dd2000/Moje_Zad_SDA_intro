package pl.sda.Zad_01G_loops_slajd_106_DialogBoxPane.Zad_6_slajd_105_loops_DialogBoxPane;
/*
6. Zmień metodę pl.sda.loops.ForLoop.sumNumbersFromUser() tak,
   by przyjmowała liczby typu float.
   W podsumowaniu oprócz sumy wypisz także średnią arytmetyczną podanych liczb.
 */
import javax.swing.*;

public class ForLoopTest_DialogBoxPane {
    public static void main(String[] args) {
        //leftTriangle(5);
        //triangle(5, 0);
        //tree(3);
        //nested();
        //endlessLoop(10);
        //sumNumbersFromUser(4);
        calculateAVG();
    }

    private static void leftTriangle(int size) {
        System.out.println();
        outer: for (int i = 0; i < size; i++) { //użycie etykiety przy zewnętrznej pętli
            for (int j = 0; j < size; j++) { //pętla w pętli
                if(j <= i) {
                    System.out.print("*");
                } else {
                    System.out.println();
                    continue outer; //
                }
            }
        }
        System.out.println();
    } // leftTriangle(int);

    private static void triangle(int size, int padding) {
        System.out.println();
        for (int i = 1; i <= size; i++) {
            for (int j = padding + size - i; j > 0; j--)
                System.out.print(" ");
            for (int k = 2 * i - 1; k > 0; k--)
                System.out.print("*");
            System.out.println();
        }
        System.out.println();
    } // triangle(...);

    private static void tree(int size) {
        System.out.println();
        int elementSize = 5;
        for (int j = 0; j < size; j++) {
            triangle(elementSize + j, elementSize + size - j);
        }
    } // tree(int);

    private static void nested() {
        System.out.println();
        String out;
        char c = 'a';
        while (c <= 'd') {
            for (int i = 1; i <= 2; i++) {
                out = "Dla " + c + "= " + i + " mamy j = ";
                for (int j = i; j <= i + 3; j++) {
                    out += " " + j;
                    System.out.println(out);
                }
            }
            c++;
        }
    } // nested();

    private static void endlessLoop(int limit) {
        System.out.println();
        int i = 1;
        int result = 1;
        for (; ; ) { //składowe pętli for mogą być puste, wtedy uzyskujemy pętle nieskończoną
            if (i > limit) {
                break; //żeby przerwać pętlę nieskończoną używamy instrukcji break
            }

            result *= i++;
        }

        System.out.println("result = " + result);
    } // endlessLoop(int);

    private static void sumNumbersFromUser(int numbersSize) {
        System.out.println();
        int sum = 0;
        for (int i = 1; i <= numbersSize; i++) {
            String numberInString = JOptionPane.showInputDialog("Podaj liczbę:");
            int numberFromUser = Integer.valueOf(numberInString);
            System.out.println("Liczba nr " + i + " to: " + numberFromUser);
            sum += numberFromUser;
        }

        System.out.println("sum = " + sum);
    } // sumNumbersFromUser(int)

    private static void calculateAVG() {
        System.out.println();
        double sum = 0;
        int howMatchDouble = 0;
        // dialog box --> ile liczb do średniej
        String howMatchInString = JOptionPane.showInputDialog("Podaj, ile wpiszesz liczb do obliczenia średniej:");
        howMatchDouble = Integer.valueOf(howMatchInString);

        // wczytanie kolejnych liczb do obliczenia sumy i średniej - wykorzystanie InputDialogBox
        for (int i = 1; i <= howMatchDouble; i++) {
            String numberInString = JOptionPane.showInputDialog("Podaj liczbę:");
            double numberFromUser = Double.valueOf(numberInString);
            System.out.println("Liczba nr " + i + " to: " + numberFromUser);
            sum += numberFromUser;
        } // for

        System.out.println("\nWczytano "+howMatchDouble+" liczb(y), których suma = " + sum
                              +", a średnia = "+(sum/howMatchDouble));
    } // sumNumbersFromUser(int)


}  // class ForLoopTest_DialogBoxPane

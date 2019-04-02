package pl.sda._2_wyjatki.Zadanie_3;
/*
    *** JESZCZE NIE ZROBIONE ***
    Przerób klasę ExceptionExample tak, by "łapała" dwa wyjątki w jednej sekcji catch.
 a) utworzyłem najpierw nową klasę MyException która rozszerza klase ArrayIndexOutOfBoundsException
 b) Jako parametr P dla catch(P) można podać nazwy kilku klas
    rozdzielone pojedynczym "lub" ('|') czyli znakiem "|"
    np.:  catch(NumberFormatException | MyException | ArrayIndexOutOfBoundsException ex) {...}
          zmienna obiektowa ex bedzie miała jeden z trzech wymienionyh typów
 */


import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(">>> ");
            String input = scanner.nextLine();

            if ("q".equalsIgnoreCase(input)) {
                break;
            }

            try {
                int num = getNumber(input);
                double sqrt = getSqrt(num);
                System.out.println("Sqrt for " + num + " = " + sqrt);
            } catch (NumberFormatException | MyException e) {
                System.out.println("Number can't be less than 0!");
            } finally {
                System.out.println("We will continue in loop ;)");
            }
        }
    }

    private static int getNumber(String input) {
        return Integer.parseInt(input);
    }

    private static double getSqrt(int num) throws MyException {
        if (0 > num) {
            throw new MyException();
        }
        return Math.sqrt(num);
    }
}

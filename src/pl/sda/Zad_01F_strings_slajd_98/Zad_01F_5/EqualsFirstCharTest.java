package pl.sda.Zad_01F_strings_slajd_98.Zad_01F_5;
/*
5. Napisz metodę, która jako argumenty będzie przyjmować dwie zmienne typu String
   i zwróci true jeżeli oba teksty zaczynają się od tego samego znaku.
 */
public class EqualsFirstCharTest {
    public static void main(String[] args) {
        String st1 = "Poszła Ola do przedszkola";
        String st2 = "po niej Ala mała lala.";
        System.out.println(checkFirstChar(st1,st2)); // sprawdzenie działania metody
    } // main();

    public static boolean checkFirstChar(String st1, String st2){
        System.out.println(st1+" <-oraz-> "+st2);
        if (st1.charAt(0)!=st2.charAt(0)) System.out.print("NIE ");
        System.out.println("zaczynają się od tej samej litery!");
        return (st1.charAt(0)==st2.charAt(0));
    }  // metoda: checkFirstChar()
} // class EqualsFirstCharTest

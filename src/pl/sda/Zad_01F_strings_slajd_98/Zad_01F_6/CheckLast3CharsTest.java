package pl.sda.Zad_01F_strings_slajd_98.Zad_01F_6;
/*
6. Napisz metodę, która jako argumenty będzie przyjmować dwie zmienne typu String
   i zwróci true jeżeli 3 ostatnie znaki w obu tekstach są takie same.
 */
public class CheckLast3CharsTest {
    public static void main(String[] args) {
        String txt1 = "Ala ma kota";
        String txt2 = "Pieska ma Dorota";

        // sprawdzenie
        System.out.println(checkLast3Chars(txt1,txt2));

    } // main()

    public static boolean checkLast3Chars(String st1, String st2){
        System.out.println(st1+" <-oraz-> "+st2);
        if (!st1.substring(st1.length()-3).equals(st2.substring(st2.length()-3))) System.out.print("NIE ");
        System.out.println("kończą się tymi samymi trzema znakami!");
        return (st1.substring(st1.length()-3).equals(st2.substring(st2.length()-3)));
    }  // metoda: checkLast3Chars()
} // class CheckLast3CharsTest

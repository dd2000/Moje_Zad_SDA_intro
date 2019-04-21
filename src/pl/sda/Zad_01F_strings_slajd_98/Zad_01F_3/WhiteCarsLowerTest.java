package pl.sda.Zad_01F_strings_slajd_98.Zad_01F_3;
/*
3. Napisz metodę, która jako argument otrzyma jedną zmienną typu String,
   usunie z niej białeznaki z początku i końca tekstu oraz zamieni wszystkie litery na małe.

 */
public class WhiteCarsLowerTest {
    public static void main(String[] args) {
        String txt = "     usunięto BIAŁE ZNAKI z tekstu     ";
        System.out.println("Tekst pierwotny["+txt+"]");
        System.out.println("Tekst wynikowy ["+trimText(txt)+"]");

    }  // main()

    // metoda usuwa białe znaki z początku i końca tekstu i zamienia litery na małe
    public static String trimText(String tekst){

        return tekst.trim().toLowerCase();
    }  // metoda trimText
}  //class WhiteCarsLowerTest

package pl.sda.Zad_01F_strings_slajd_98.Zad_01F_8;
/*
8. (*) Napisz metodę sprawdzającą, czy dany łańcuch zawiera co najmniej trzy razy słowo “nie”.
 */
public class HowMatchWordTest {
    public static void main(String[] args) {
        // tekst źródłowy
        String sourceText = "Nie jest nie do przyjęcia nie wykonanie tego pragnienie na nie.";

        // szukane słowo w tekście źródłowym
        String ask = "nie";

        // sprawdzenie ilości wystąpień
        System.out.println("W tekście:> "+sourceText);
        System.out.println("słowo:> "+ask+" występuje "+howMatchExist(sourceText,ask)+" razy.");
    } // main();

    public static int howMatchExist(String txt, String wrd){
        // znaki, które mogą wystąpić po słowie "nie"  na końcu tekstu, np.: nie? lub nie; lub nie!
        String dziwneZnaki=",./<>?;:'\"|\\[]{}-=_+)(*&^%$#@!|";

        // zamiana na małe litery
        String tekst = txt.toLowerCase();
        int size = tekst.length();
        char[] tab = new char[size];
        tab = tekst.toCharArray(); // tekst podzielony na znaki

        String word = wrd.toLowerCase();
        int ile = 0;


        // sprawdzenie, czy ostatni znak tekstu to dziwnyZnak i zastąpienie go spacją
        for (char ch:
             dziwneZnaki.toCharArray()) {
            if (ch == tab[size-1]) {
                 tab[size-1] = ' ';
            }
        }  // foreach

        tekst="";  // ponowne tworzenie tekstu ze znaków tablicy tab
        for (char ch:
            tab ) {
            tekst += ch;
        }  //foreach


        // spr., czy kolejne linie po wykonaniu "split" (podział na linie po wykryciu spacji) to szukane słowo word
                //String[] arrStr = tekst.split("\\s");  // \\s - spacja jako wyrażenie regularne regex
        for (String linia://arrStr){
             tekst.split("\\s")) { // \\s - spacja jako wyrażenie regularne regex
           if(linia.equals(word)) ile++;  // zwiększenie licznika wystąpień "word"
        } // foreach
        return ile;
    } // howMatchExist()
}  // class HowMatchWordTest

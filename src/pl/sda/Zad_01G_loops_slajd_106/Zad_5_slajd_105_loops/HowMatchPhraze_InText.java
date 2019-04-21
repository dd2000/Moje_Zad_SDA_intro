package pl.sda.Zad_01G_loops_slajd_106.Zad_5_slajd_105_loops;
/*
5. Napisz metodę sprawdzającą ilość wystąpień frazy: phrase w tekście: text.
   Parametry metody to: phrase i text.
   (?) Podpowiedź: użyj metody klasy String, która sprawdza index dla podanej frazy.
 */
public class HowMatchPhraze_InText {
    public static void main(String[] args) {
        String text = "To jest Otto i jego towarzysze lotto.";
        String phrase = "to";

        // sprawdzenie
        System.out.println("\nFraza ["+phrase+"] w tekście ["+text
                +"] występuje "+howMatchPhrase(text,phrase)+" razy.");
    } // main();

    //metoda
    public static int howMatchPhrase(String tekst, String phrase){
        int ile=0;
        while (tekst.indexOf(phrase)>=0) {
            ile++;
            tekst = tekst.substring(tekst.indexOf(phrase)+phrase.length());
        } //while
        return ile;
    } // howMatchPhrase();

}  // class HowMatchPhraze_InText

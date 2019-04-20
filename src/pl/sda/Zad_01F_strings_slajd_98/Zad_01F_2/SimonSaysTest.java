package pl.sda.Zad_01F_strings_slajd_98.Zad_01F_2;
/*
2. Napisz metodę, która zwróci tekst: “Simon says: [{text}]”, gdzie {text} - to argument metody.
   Użyj konkatenacji lub StringBuildera.

 */
public class SimonSaysTest {
    public static void main(String[] args) {

    String mowa = "Dobrze zrobione!";

    System.out.println(say1(mowa));
    System.out.println(say2(mowa));
    System.out.println(say3(mowa));

    }  // main()

    //zwykłe łączenie tekstów
    public static String say1(String text){
        return "Simon says: ["+text+"]";
    }

    // konkatenacja (metoda)
    public static String say2(String text){
        return "Simon says: [".concat(text).concat("]");
    }

    // wykorzystanie StringBuilder
    public static String say3(String text){
        StringBuilder sb = new StringBuilder("Simon says: [");
        return sb.append(text).append("]").toString();
    }


}  // class SimonSaysTest

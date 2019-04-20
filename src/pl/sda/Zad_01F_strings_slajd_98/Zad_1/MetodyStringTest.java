package pl.sda.Zad_01F_strings_slajd_98.Zad_1;
/*
1. Napisz klasę, która wykorzysta większość z metod dostępnych w klasie String.
 */
public class MetodyStringTest {
    public static void main(String[] args) {
        String text1 = "Malutka Ala ma małego kotka Maluszka.";
        String text2 = "      Odstępy przed i po tekście.      ";
        System.out.println("text1.equals(text2): "+text1.equals(text2));
        System.out.println("text1.substring(5,15): "+text1.substring(5,15));
        System.out.println("text1.substring(5): "+text1.substring(5));
        System.out.println("text1.toString(): "+text1.toString());
        System.out.println("text1.concat(\"Inny tekst.\"): "+text1.concat("Inny tekst."));
        System.out.println("text1.intern()"+text1.intern());
        System.out.println("text1.replace(\"ka\",\"nia\")"+text1.replace("ka","nia"));
        System.out.println("text1.replaceFirst(\"/^ka$/\",\"KA\"): "+text1.replaceFirst("/^ka$/","KA"));
        System.out.println("text1.toLowerCase(): "+text1.toLowerCase());
        System.out.println("text1.toUpperCase(): "+text1.toUpperCase());
        System.out.println("text2=|"+text2+"|"+"----->text2.trim(): --->|"+text2.trim()+"|");
        System.out.println("text1.length(): "+text1.length());
        System.out.println("text1.matches(\"/^Ala$/\"): "+text1.matches("/^Ala$/"));
        System.out.println("\ntext1.toCharArray(): [zwraca adres utworzonego Obiektu tablicy znaków] "+text1.toCharArray());
        for (char ch: text1.toCharArray()  ) { System.out.print(ch+"_");}

        System.out.println("\n\ntext1.isEmpty(): "+text1.isEmpty());

        System.out.println("\ntext1.split(\" \") : "+text1.split("/^ $/"));
        for (String st: text1.split(" ")) { System.out.println(st);}

    }
}  // class MetodyStringTest

package pl.sda.Zad_01F_strings_slajd_98.Zad_01F_7;

import pl.sda.Zad_01F_strings_slajd_98.Zad_01F_4.Person;

/*
7. (*) W ramach zadania nr 4 użyj StringBuildera do tworzenia wersji tekstowej obiektów.
 */
public class TextObjectByStringBiulderTest {
    public static void main(String[] args) {
        Person osoba1 = new Person("Olek","Sawczenko",57);
        // wykorzystanie StringBuilder-a
        StringBuilder opisSB = new StringBuilder("Opis obiektu: nazwisko="+osoba1.getLastName());
        opisSB.append(" imię="+osoba1.getFirstName()+" wiek="+osoba1.getAge());
        // test opisu
        System.out.println(opisSB);

    } //main()
}  // class TextObjectByStringBiulderTest

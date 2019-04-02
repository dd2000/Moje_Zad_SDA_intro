package pl.sda.Zad_rozgrzewka_Drzewo_Genealogiczne_slajd_77;

/*
1. Tworzymy model danych dla drzewa genealogicznego
2. Przyjmujemy prosty model rodziny: 2 rodziców + 1 dziecko
3. Pojedyncza osoba powinna mieć dane: imię, nazwisko, wiek
4. Pojedyncza rodzina powinna zawierać: wszystkich członków rodziny
   (jako osobne pola dla każdej z osób: mąż, żona, dziecko)
   oraz nazwę całej rodziny, np.: “Rodzina Kowalskich”
5. Dodatkowo obiekt rodziny powinien mieć:
    a. metodę, która zwróci opis całej rodziny jako String
    b. (*) metodę, która zwróci sumę lat wszystkich członków rodziny
    c. (*) metodę, która zwróci średnią arytmetyczną wieku członków rodziny
6. W osobnej klasie FamilyTest tworzymy 2-3 rodziny i wypisujemy informacje o nich na ekran
7. (*) Dodaj klasę, która będzie reprezentować małżeństwo.
   Pola w klasie: mąż, żona, data ślubu. Użyj tej klasy w klasie rodziny.
*/

/*
klasa definiuje osobę: imię, nazwisko, wiek
 */
public class Person {
    private String firstName; //imię
    private String lastName; //nazwisko
    private int age; //wiek

    @Override
    public String toString() {
        return "Person{" + firstName +" "+ lastName + ", wiek:" + age + " }";
    } //Person.toString()
}   // class Person


/*
klasa definiuje rodzinę: ojciec, matka, dziecko
 */
class Family {
    private Person father; //ojciec
    private Person mother; //matka
    private Person child; //dziecko
    private String familyName; // nazwa rodziny

    @Override
    public String toString() {
        return "Family{" +
                "father=" + father +
                ", mother=" + mother +
                ", child=" + child +
                ", familyName='" + familyName + '\'' +
                '}';
    }   // Family.toString();


}   // class Family

/*
klasa definiuje małżeństwo: mąż, żona, data ślubu
 */
class Marriage {
    private Person husband; //mąż
    private Person wife; //żona
    private String weedingData; //data ślubu

}   // class Family

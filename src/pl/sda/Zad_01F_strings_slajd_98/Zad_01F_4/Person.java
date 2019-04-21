package pl.sda.Zad_01F_strings_slajd_98.Zad_01F_4;

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

    // konstruktor: Person()
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }   // konstruktor: Person()

    // getter: pobiera wiek osoby
    public int getAge() {
        return age;
    }   // getAge()

    // getter: pobiera imie osoby
    public String getFirstName() {
        return firstName;
    }

    // getter: pobiera nazwisko osoby
    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Person{" + firstName +" "+ lastName + ", wiek:" + age + " }";
    } //Person.toString()
}   // class Person


/*
klasa definiuje rodzinę: ojciec, matka, dziecko
 */
class Family {          // w jednym pliku *.java może być TYLKO JEDNA klasa PUBLIC
    private Person father; //ojciec
    private Person mother; //matka
    private Person child; //dziecko
    private String familyName; // nazwa rodziny

    // konstruktor (Person x3 + String) obiektów klasy Faamily
    public Family(Person father,
                  Person mother,
                  Person child,
                  String familyName) {
        this.father = father;
        this.mother = mother;
        this.child = child;
        this.familyName = familyName;
    }   // konstruktor Family(...)


    // konstruktor (String+int) obiektów klasy Faamily
    public Family(String fatherFirstName,
                  String fatherLastName,
                  int fatherAge,
                  String motherFirstName,
                  String motherLastName,
                  int motherAge,
                  String childFirstName,
                  String childLastName,
                  int childAge,
                  String familyName){
        this.father = new Person(fatherFirstName, fatherLastName, fatherAge);
        this.mother = new Person(motherFirstName,motherLastName,motherAge);
        this.child = new Person(childFirstName,childLastName,childAge);
        this.familyName = familyName;
    }   // konstruktor Family(...)

    // getter: pobiera nazwisko rodziny
    public String getFamilyName() {
        return familyName;
    }   //  getFamilyName()

    // 5 a. metoda, która zwróci opis całej rodziny jako String
    @Override
    public String toString() {
        return "Family:" +
                "familyName='" + familyName + '\'' +
                "\nfather=" + father +
                "\n mother=" + mother +
                "\n child=" + child +
                ';';
    }   // Family.toString();

    // 5 b. (*) metoda, która zwróci sumę lat wszystkich członków rodziny
    public int sumFamilyAge(){
        return (this.father.getAge()+this.mother.getAge()+this.child.getAge());
    }   // sumFamilyAge()

    // 5 c. (*) metoda, która zwróci średnią arytmetyczną wieku członków rodziny
    // metoda: średni wiek
    public double averageAge(){
        return (sumFamilyAge()/3.0);
    }   //  averageAge()


}   // class Family

/*
klasa definiuje małżeństwo: mąż, żona, data ślubu
 */
class Marriage {
    private Person husband; //mąż
    private Person wife; //żona
    private String weedingData; //data ślubu

    // konstruktor
    public Marriage(Person husband, Person wife, String weedingData) {
        this.husband = husband;
        this.wife = wife;
        this.weedingData = weedingData;
    } // konstruktor

    @Override
    public String toString() {
        return "Marriage{" +
                "\nhusband=" + husband +
                "\n wife=" + wife +
                "\n weedingData='" + weedingData +
                "\n}";
    }
}   // class Family

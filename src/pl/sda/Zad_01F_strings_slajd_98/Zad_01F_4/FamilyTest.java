package pl.sda.Zad_01F_strings_slajd_98.Zad_01F_4;

/*
6. W osobnej klasie FamilyTest tworzymy 2-3 rodziny i wypisujemy informacje o nich na ekran
7. (*) Dodaj klasę, która będzie reprezentować małżeństwo.
   Pola w klasie: mąż, żona, data ślubu. Użyj tej klasy w klasie rodziny.
*/
public class FamilyTest {   // testowanie klas pliku Person.java
    public static void main(String[] args) {
        // 6. W osobnej klasie FamilyTest tworzymy 2-3 rodziny i wypisujemy informacje o nich na ekran
        Family family1 = new Family("Jan","Kowal",56,
                "Janina","Kowal",52,
                "Kornel","Kowal",17,
                "Kowal");
        Family family2 = new Family("Adam","Rentier",31,
                "Anna","Była-Dłużna",25,
                "Anton","Rentier",4,
                "Rentier");
        Family family3 = new Family("Bogdan","Ptak",37,
                "Barbara","Sikora - Ptak",32,
                "Bronisław","Ptak",7,
                "Ptak");
        System.out.printf("\n\nRodzina_1: "+family1.getFamilyName()+"  "+family1.toString());
        System.out.printf("\n          razem lat: "+family1.sumFamilyAge()+" średni wiek: "+family1.averageAge());
        System.out.printf("\n\nRodzina_2: "+family2.getFamilyName()+"  "+family2.toString());
        System.out.printf("\n          razem lat: "+family2.sumFamilyAge()+" średni wiek: "+family2.averageAge());
        System.out.printf("\n\nRodzina_3: "+family3.getFamilyName()+"  "+family3.toString());
        System.out.printf("\n          razem lat: "+family3.sumFamilyAge()+" średni wiek: "+family3.averageAge());
        Marriage para1 = new Marriage(new Person("Alojzy","Piontek",54),
                                      new Person("Matylda","Kopczyk",37),"01 kwietnia 2012 r");
        System.out.println(para1.toString());
    }   //  main()
}   // class FamilyTest

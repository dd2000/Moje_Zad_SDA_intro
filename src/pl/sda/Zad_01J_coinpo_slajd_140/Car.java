package pl.sda.Zad_01J_coinpo_slajd_140;
/*  coinpo - zadanie_1 Slajd_140
    - poprawiona metoda toString(),
    - kolekcja: ("zagnieżdżanie") klas w polach klasy (użycie obiektów w polach),
    - poprawione konstruktory,
    - dodane metody Enterteiment (centrum rozrywki)
coinpo
1. Rozwiń przykład kompozycji w oparciu o klasę Car
   - dodaj klasę Entertainment, która zarządzać będzie systemem rozrywki w Twoim samochodzie,
   a następnie zadbaj o to, by tworząc obiekt typu Car
   konieczne było podanie obiektu typu Entertainment.
   Klasa Car powinna wykorzystywać metody dostępne w klasie Entertainment.

*/

public class Car {
    // 1.
    private String brand;   // producent
    private String color;
    private Entertainment centrumMM;

    // 2.
    // konstruktor obiektów klasy Car
    public Car(String brand, String color, Entertainment centrumMM) {
        this.brand = brand;
        this.color = color;
        this.centrumMM = centrumMM;
    }
    // ponowne definiowanie konstruktora bezparametrowego
    public Car() {
    } // bezparametrowy konstruktor Car()


    // 3.
    // metoda: toString()

    @Override
    public String toString() {
        String MM=" ";
        if(centrumMM.isRadio()) MM+="radio, ";
        if(centrumMM.isVideo()) MM+="video, ";
        if(centrumMM.isVoicePhone()) MM+="telefon głośnomówiący";
        if(MM.equals(" ")) MM="-brak-";
        return "Car:" +
                "brand= " + brand +
                ", color= " + color +
                ", centrum MM: "+MM+ ".";
    } // toString()


}   // class Car

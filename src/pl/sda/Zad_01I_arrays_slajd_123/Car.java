package pl.sda.Zad_01I_arrays_slajd_123;
/*  OOP - zadania Slajd 65 - poprawiona metoda toString()
1. Utwórz klasę Car z polami: brand i color
   {na katalogu}(Alt + Insert → Java Class lub PPM → New →  Java Class)

2. Dodaj konstruktor i oba pola jako argumenty
   {w klasie}(Alt + Insert → Constructor lub PPM → Generate →  Constructor)

3. Dodaj metodę toString() i dodaj oba pola
   {w klasie}(Alt + Insert → toString() lub PPM → Generate →  toString())

---- cd...---> w klasie: CarApp zawierającej metodę main()
4. W klasie HelloWorldApp [zmieniono na CarApp] utwórz nowy obiekt na podstawie klasy Car, np.
   Car toyota = new Car("Toyota", "black");

5. Wypisz na konsoli informację o samochodzie
   System.out.println("My car is: " + toyota);

Uruchom program
{w klasie}(Alt + Shift + F10 lub PPM → Run Car.main())
*/

public class Car {
    // 1.
    private String brand;   // producent
    private String color;

    // 2.
    // konstruktor obiektów klasy Car
    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }
    // ponowne definiowanie konstruktora bezparametrowego
    public Car() {
    } // bezparametrowy konstruktor Car()


    // 3.
    // metoda: toString()

    @Override
    public String toString() {
        return "Car:" +
                "brand= " + brand +
                ", color= " + color + ".";
    }
}   // class Car

package pl.sda.Zad_1C_OOP1_slajd65;
/*
---...cd.---- w klasie: CarApp zawierającej metodę main()
4. W klasie HelloWorldApp [zmieniono na CarApp] utwórz nowy obiekt na podstawie klasy Car, np.
   Car toyota = new Car("Toyota", "black");

5. Wypisz na konsoli informację o samochodzie
   System.out.println("My car is: " + toyota);

Uruchom program
{w klasie}(Alt + Shift + F10 lub PPM → Run Car.main())
*/
public class CarApp {

    public static void main(String[] args) {
        // utworzenie obiektu toyota na podst klasy Car
        Car toyota = new Car("Toyota", "black");
        // automatycznie jest wykonana metoda: toyota.toString()  - czyli zamiana obiektu na łańcuch
        System.out.println("\nMy car is: "+toyota);
    }   // main()
} // class CarApp

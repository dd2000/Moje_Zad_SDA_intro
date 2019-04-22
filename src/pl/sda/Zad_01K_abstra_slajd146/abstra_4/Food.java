package pl.sda.Zad_01K_abstra_slajd146.abstra_4;

/*
1. Utwórz klasę abstrakcyjną o nazwie Food i dodaj do niej metodę abstrakcyjną getTaste(),
   która zwraca String z opisem smaku jedzenia Dodaj klasy: Chicken, Ham, Carrot, Salad
   rozszerzające klasę Food oraz zaimplementuj w każdej z nich wymaganą metodę.
3. Dodaj do klasy Food metodę abstrakcyjną getType(),
   która zwróci rodzaj jedzenia w postaci enuma (utwórz enum np.: FoodType).
   W klasach Meat i Vegetable zaimplementuj nową metodę.
4. W klasie Food dodaj pole name i zwykłą metodę (gettera) do pobierania nazwy.
   Stwórz konstruktor, który będzie ustawiał pole name.
   Stwórz odpowiednie konstruktory w klasach pochodnych.
                 Food
              /       \
           Meat       Vegetable
          /    \      /       \
      Chicken  Ham   Carrot   Salad

 */
public abstract class Food {

    private String name;
    // metody abstrakcyjne - bez ciała/implementacji
    public abstract String getTaste();
    public abstract FoodType getType();

    // konstruktor

    public Food(String name) {
        this.name = name;
    } // konstruktor

    // getter
    public String getName() {
        return name;
    } // getName();
} // class Food

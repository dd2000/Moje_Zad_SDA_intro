package pl.sda.Zad_01K_abstra_slajd146.abstra_4;

/*
3. Dodaj do klasy Food metodę abstrakcyjną getType(),
   która zwróci rodzaj jedzenia w postaci enuma (utwórz enum - FoodType).
   W klasach Meat i Vegetable zaimplementuj nową metodę.
4. W klasie Food dodaj pole name i zwykłą metodę (gettera) do pobierania nazwy.
   Stwórz konstruktor, który będzie ustawiał pole name.
   Stwórz odpowiednie konstruktory w klasach pochodnych.
*/
public class Vegetable extends Food {

    // konstruktor - wykorzystuje z metody nadrzędnej - super()
    public Vegetable(String name) {
        super(name);
    } // konstruktor

    // implementacje metod abstrakcyjnych z klas bazowych
    @Override
    public String getTaste() {
        return "Wegetariańskie smaki";
    } // getTaste()

    @Override
    public FoodType getType() {
        return FoodType.VEGETABLE;
    } // getType()
} //class Vegetable extends Food

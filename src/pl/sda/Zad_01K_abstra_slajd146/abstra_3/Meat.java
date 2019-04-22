package pl.sda.Zad_01K_abstra_slajd146.abstra_3;
/*
3. Dodaj do klasy Food metodę abstrakcyjną getType(),
   która zwróci rodzaj jedzenia w postaci enuma (utwórz enum - FoodType).
   W klasach Meat i Vegetable zaimplementuj nową metodę.
 */
public class Meat extends Food {

    // implementacje metod abstrakcyjnych z klas bazowych
    @Override
    public String getTaste() {
        return "Smak mięsa";
    } // getTaste()

    @Override
    public FoodType getType() {
        return FoodType.MEAT;
    }
} // class Meat extends Food
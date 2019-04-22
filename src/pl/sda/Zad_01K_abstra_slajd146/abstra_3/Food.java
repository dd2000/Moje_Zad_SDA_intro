package pl.sda.Zad_01K_abstra_slajd146.abstra_3;
/*
1. Utwórz klasę abstrakcyjną o nazwie Food i dodaj do niej metodę abstrakcyjną getTaste(),
   która zwraca String z opisem smaku jedzenia Dodaj klasy: Chicken, Ham, Carrot, Salad
   rozszerzające klasę Food oraz zaimplementuj w każdej z nich wymaganą metodę.
3. Dodaj do klasy Food metodę abstrakcyjną getType(),
   która zwróci rodzaj jedzenia w postaci enuma (utwórz enum np.: FoodType).
   W klasach Meat i Vegetable zaimplementuj nową metodę.
 */
public abstract class Food {

    // metody abstrakcyjne - bez ciała/implementacji
    public abstract String getTaste();
    public abstract FoodType getType();
} // class Food

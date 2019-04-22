package pl.sda.Zad_01K_abstra_slajd146.abstra_2;
/*
1. Utwórz klasę abstrakcyjną o nazwie Food i dodaj do niej metodę abstrakcyjną getTaste(),
   która zwraca String z opisem smaku jedzenia Dodaj klasy: Chicken, Ham, Carrot, Salad
   rozszerzające klasę Food oraz zaimplementuj w każdej z nich wymaganą metodę.
 */
public abstract class Food {

    // metoda abstrakcyjna - bez ciała/implementacji
    public abstract String getTaste();
} // class Food

package pl.sda.Zad_01K_abstra_slajd146.abstra_1;

/*
   Dodaj klasy: Chicken, Ham, Carrot, Salad
   rozszerzające klasę Food oraz zaimplementuj w każdej z nich wymaganą metodę.
 */

public class Carrot extends Food {

    @Override
    public String getTaste() {
        return "Smak marchewki";
    }
} // class Carrot extends Food

package pl.sda.Zad_01K_abstra_slajd146.abstra_2;
/*
   Dodaj klasy: Chicken, Ham, Carrot, Salad
   rozszerzające klasę Food oraz zaimplementuj w każdej z nich wymaganą metodę.
 */

public class Ham extends Meat {

    @Override
    public String getTaste() {
        return "Smak szynki";
    }
} // class Ham extends Meat

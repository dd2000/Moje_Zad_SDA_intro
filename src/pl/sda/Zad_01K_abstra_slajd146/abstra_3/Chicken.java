package pl.sda.Zad_01K_abstra_slajd146.abstra_3;

/*
   Dodaj klasy: Chicken, Ham, Carrot, Salad
   rozszerzające klasę Food oraz zaimplementuj w każdej z nich wymaganą metodę.
 */
public class Chicken extends Meat {

    @Override
    public String getTaste() {
        return "Smak kurczaka";
    }
} // class Chicken extends Meat


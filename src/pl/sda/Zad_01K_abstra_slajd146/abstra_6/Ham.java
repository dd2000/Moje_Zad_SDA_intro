package pl.sda.Zad_01K_abstra_slajd146.abstra_6;
/*
   Dodaj klasy: Chicken, Ham, Carrot, Salad
   rozszerzające klasę Food oraz zaimplementuj w każdej z nich wymaganą metodę.
4. W klasie Food dodaj pole name... i konstruktor
   Stwórz odpowiednie konstruktory w klasach pochodnych.
 */

public class Ham extends Meat {

    // konstruktor - wykorzystuje z metody nadrzędnej - super()
    public Ham(String name) {
        super(name);
    } // konstruktor

    @Override
    public String getTaste() {
        return "Smak szynki";
    }


    @Override
    public String toString() {
        return "Ham{} " + super.toString();
    }
} // class Ham extends Meat

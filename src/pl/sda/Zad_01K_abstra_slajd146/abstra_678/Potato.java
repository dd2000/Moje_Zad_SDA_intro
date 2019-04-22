package pl.sda.Zad_01K_abstra_slajd146.abstra_678;
// potato - ziemniak
public class Potato extends Vegetable {
    // konstruktor
    public Potato(String name) {
        super(name);
    }

    @Override
    public String getTaste() {
        return "Smak skrobii";
    }
} // class Potato extends Vegetable

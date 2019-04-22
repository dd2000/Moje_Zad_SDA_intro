package pl.sda.Zad_01K_abstra_slajd146.abstra_6;

public class Oil extends Vegetable {

    // konstruktor
    public Oil(String name) {
        super(name);
    }

    @Override
    public String getTaste() {
        return "Tłusty i mdły.";
    }
} // class Oil

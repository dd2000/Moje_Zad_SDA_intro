package pl.sda.Zad_01K_abstra_slajd146.abstra_6;

public class Fish extends Vegetable {
    public Fish(String name) {
        super(name);
    }

    @Override
    public String getTaste() {
        return "Rybny smak";
    }
} //class Fish extends Vegetable

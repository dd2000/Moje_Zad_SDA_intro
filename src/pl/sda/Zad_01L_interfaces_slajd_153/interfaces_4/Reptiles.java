package pl.sda.Zad_01L_interfaces_slajd_153.interfaces_4;
/*
2. Utwórz kilka różnych implementacji interfejsu Animal po jednym dla:
   ptaków (Birds), ssaków(Mammals), ryb(Fishes), gadów (Reptiles), owadów (Insects).
4. Dodaj do klas zwierząt implementacje odpowiednich interfejsów:
    a. dla ryb i gadów Swimmable,
    b. dla ptaków i owadów: Flyable
*/

public class Reptiles implements Animal,Swimmable {

    private String name;
    private String speak;
    private boolean swim;

    public Reptiles(String name) {
        this.name = name;
        this.speak = "sssssssssssssss...";
        this.swim = true;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String speak() {
        return speak;
    }

    @Override
    public boolean swim() {
        return swim;
    }
} // class Reptiles implements Animal

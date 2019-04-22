package pl.sda.Zad_01L_interfaces_slajd_153.interfaces_2;
/*
2. Utwórz kilka różnych implementacji interfejsu Animal po jednym dla:
   ptaków (Birds), ssaków(Mammals), ryb(Fishes), gadów (Reptiles), owadów (Insects).
*/

public class Reptiles implements Animal {

    private String name;
    private String speak;

    public Reptiles(String name) {
        this.name = name;
        this.speak = "sssssssssssssss...";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String speak() {
        return speak;
    }
} // class Reptiles implements Animal

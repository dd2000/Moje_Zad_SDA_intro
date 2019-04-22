package pl.sda.Zad_01L_interfaces_slajd_153.interfaces_2;
/*
2. Utwórz kilka różnych implementacji interfejsu Animal po jednym dla: ptaków, ssaków, ryb, gadów, owadów.
*/

public class Fishes implements Animal {

    private String name;
    private String speak;

    public Fishes(String name) {
        this.name = name;
        this.speak = "... nie mają głosu...";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String speak() {
        return speak;
    }
} // class Fishes implements Animal


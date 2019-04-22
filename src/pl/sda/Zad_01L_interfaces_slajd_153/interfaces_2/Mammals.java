package pl.sda.Zad_01L_interfaces_slajd_153.interfaces_2;
/*
2. Utwórz kilka różnych implementacji interfejsu Animal po jednym dla: ptaków, ssaków, ryb, gadów, owadów.
*/

public class Mammals implements Animal {

    private String name;
    private String speak;

    public Mammals(String name, String speak) {
        this.name = name;
        this.speak = speak;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String speak() {
        return speak;
    }
} // class Mammals implements Animal

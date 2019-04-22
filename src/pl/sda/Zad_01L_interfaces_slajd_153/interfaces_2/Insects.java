package pl.sda.Zad_01L_interfaces_slajd_153.interfaces_2;
/*
2. Utwórz kilka różnych implementacji interfejsu Animal po jednym dla: ptaków, ssaków, ryb, gadów, owadów.
*/

public class Insects implements Animal {

    private String name;
    private String speak;

    public Insects(String name) {
        this.name = name;
        this.speak = "bzzzz...bzzzz... bzzzz...";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String speak() {
        return speak;
    }
} // class Insects implements Animal


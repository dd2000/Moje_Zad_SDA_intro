package pl.sda.Zad_01L_interfaces_slajd_153.interfaces_2;
/*
2. Utwórz kilka różnych implementacji interfejsu Animal po jednym dla: ptaków, ssaków, ryb, gadów, owadów.
*/

public class Birds implements Animal {

    private String name;
    private String speak;

    public Birds(String name) {
        this.name = name;
        this.speak = "ćwir ćwir! fiu fiu, kokoko...!";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String speak() {
        return speak;
    }
} // class Birds implements Animal

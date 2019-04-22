package pl.sda.Zad_01L_interfaces_slajd_153.interfaces_567;
/*
2. Utwórz kilka różnych implementacji interfejsu Animal po jednym dla: ptaków, ssaków, ryb, gadów, owadów.
4. Dodaj do klas zwierząt implementacje odpowiednich interfejsów:
    a. dla ryb i gadów Swimmable,
    b. dla ptaków i owadów: Flyable
*/

public class Insects implements Animal, Flyable {

    private String name;
    private String speak;
    private boolean fly;
    private int age;

    public Insects(String name, boolean fly) {
        this.name = name;
        this.speak = "bzzzz...bzzzz... bzzzz...";
        this.fly = fly;
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
    public boolean fly() {
        return fly;
    }

    @Override
    public boolean isAlive() {
        if ((MAX_AGE-age)>0) return true;
        return false;
    }

    @Override
    public int getAge() {
        return age;
    }

    public String getSpeak() {
        return speak;
    }

    public boolean isFly() {
        return fly;
    }
} // class Insects implements Animal


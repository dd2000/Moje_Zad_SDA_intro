package pl.sda.Zad_01L_interfaces_slajd_153.interfaces_8;
/*
2. Utwórz kilka różnych implementacji interfejsu Animal po jednym dla: ptaków, ssaków, ryb, gadów, owadów.
4. Dodaj do klas zwierząt implementacje odpowiednich interfejsów:
    a. dla ryb i gadów Swimmable,
    b. dla ptaków i owadów: Flyable
*/

public class Fishes implements Animal, Swimmable, Being {

    private String name;
    private String speak;
    private boolean swim;
    private int age;


    public Fishes(String name, int age) {
        this.name = name;
        this.speak = "... nie mają głosu...";
        this.swim = true;
        this.age = age;
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

    @Override
    public int getAge() {
        return age;
    }

    public String getSpeak() {
        return speak;
    }

    public boolean isSwim() {
        return swim;
    }
} // class Fishes implements Animal


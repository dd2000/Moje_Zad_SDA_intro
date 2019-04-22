package pl.sda.Zad_01L_interfaces_slajd_153.interfaces_567;
/*
2. Utwórz kilka różnych implementacji interfejsu Animal po jednym dla: ptaków, ssaków, ryb, gadów, owadów.
4. Dodaj do klas zwierząt implementacje odpowiednich interfejsów:
    a. dla ryb i gadów Swimmable,
    b. dla ptaków i owadów: Flyable
*/

public class Birds implements Animal, Flyable {

    private String name;
    private String speak;
    private boolean fly;
    private int age;

    public Birds(String name,boolean fly) {
        this.name = name;
        this.speak = "ćwir ćwir! fiu fiu, kokoko...!";
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

    public String getSpeak() {
        return speak;
    }

    public boolean isFly() {
        return fly;
    }

    @Override
    public int getAge() {
        return age;
    }
} // class Birds implements Animal

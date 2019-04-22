package pl.sda.Zad_01L_interfaces_slajd_153.interfaces_8;
/*
2. Utwórz kilka różnych implementacji interfejsu Animal po jednym dla: ptaków, ssaków, ryb, gadów, owadów.
4. Dodaj do klas zwierząt implementacje odpowiednich interfejsów:
    a. dla ryb i gadów Swimmable,
    b. dla ptaków i owadów: Flyable
*/

public class Mammals implements Animal, Being {

    private String name;
    private String speak;
    private int age;

    public Mammals(String name, int age, String speak) {
        this.name = name;
        this.speak = speak;
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
    public int getAge() {
        return age;
    }

    public String getSpeak() {
        return speak;
    }

} // class Mammals implements Animal

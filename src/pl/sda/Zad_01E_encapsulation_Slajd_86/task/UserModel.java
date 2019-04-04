package pl.sda.Zad_01E_encapsulation_Slajd_86.task;

public class UserModel {
    String firstName;
    private String lastName;
    protected final int AGE = 55;

    public String getFirstName() {
        return firstName;
    }
}

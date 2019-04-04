package pl.sda.Zad_01E_encapsulation_Slajd_86.task.User;

public class UserManager {
    public UserModel user;

    private void createUser(String firstName, String lastName, int age) {
        user = new UserModel();
    }

    protected UserModel getUser() {
        return user;
    }
}

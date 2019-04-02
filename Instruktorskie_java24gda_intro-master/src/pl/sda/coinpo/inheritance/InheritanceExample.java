package pl.sda.coinpo.inheritance;

public class InheritanceExample {

    public static void main(String[] args) {
        Animal animal = new Animal("Simba");
        System.out.println(animal);

        Lion lion = new Lion("Simba", 10);

        System.out.println(animal);
        System.out.println(lion);

        System.out.println(animal.getName());
        System.out.println(lion.getName());

        animal.move();
        lion.move();
        lion.move(50);
        lion.move("Nigeria");
    }
}
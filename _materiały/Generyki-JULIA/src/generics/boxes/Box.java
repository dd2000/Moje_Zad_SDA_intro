package pl.sda.java.intro.generics.boxes;

public class Box<T extends Fruit> {
    private T item;

    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void isRotten() {
        item.isRotten();
    }
}
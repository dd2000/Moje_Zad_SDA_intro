package pl.sda.encapsulation.task;

public class ItemModel {
    public String title;
    protected String description;
    private double price;

    private String getTitle() {
        return title;
    }

    private String getDescription() {
        return description;
    }

    private double getPrice() {
        return price;
    }
}

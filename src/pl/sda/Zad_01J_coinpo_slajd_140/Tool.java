package pl.sda.Zad_01J_coinpo_slajd_140;
/*
2. Utwórz klasę Tool, która będzie reprezentować narzędzia do kupienia w sklepie.
   Każde narzędzie powinno mieć swój model i cenę.
   Dodatkowo utwórz klasy: Hammer i Saw, które będą dziedziczyć po klasie Tool.
   Klasa Hammer powinna mieć dodatkowe pole z wagą młotka,
   a klasa Saw z długością piły.
   Utwórz klasę ToolsShop, w której utwórz kilka narzędzi i wyświetl ich ceny.
 */
public class Tool {
    private String model;
    private double price;   // cena

    // konstruktor
    public Tool(String model, double price) {
        this.model = model;
        this.price = price;
    } // konstruktor Tool

    // gettery i settery
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tool{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }


} // class Tool

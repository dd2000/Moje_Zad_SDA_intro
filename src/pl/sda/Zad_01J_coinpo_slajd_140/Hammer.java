package pl.sda.Zad_01J_coinpo_slajd_140;
/*
2. (cd) Dodatkowo utwórz klasy: Hammer i Saw, które będą dziedziczyć po klasie Tool.
   Klasa Hammer powinna mieć dodatkowe pole z wagą młotka,
   a klasa Saw z długością piły.
   Utwórz klasę ToolsShop, w której utwórz kilka narzędzi i wyświetl ich ceny.
 */
public class Hammer extends Tool{  // Hammer rozszerza klasę Tool
    private double masa;

    //konstruktor

    public Hammer(String model, double price, double masa) {
        super(model,price);
        this.masa = masa;
    } // konstruktor Hammer

    public double getMasa() {
        return masa;
    }

    @Override
    public String toString() {
        return "Hammer{" +
                " model:"+super.getModel()+
                " cena="+super.getPrice()+
                " masa=" + getMasa() +
                '}';
    }
} // class Hammer

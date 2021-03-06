package pl.sda.Zad_01J_coinpo_slajd_140;

import pl.sda.Zad_01J_coinpo_slajd_140.Tool;

/*
2. (cd) Dodatkowo utwórz klasy: Hammer i Saw, które będą dziedziczyć po klasie Tool.
   Klasa Hammer powinna mieć dodatkowe pole z wagą młotka,
   a klasa Saw z długością piły.
   Utwórz klasę ToolsShop, w której utwórz kilka narzędzi i wyświetl ich ceny.
3. Dodaj do klasy Tool metodę która zwraca opis narzędzia (model + cena).(zrobione w klasie nadrzędnej Tool)
   Dodatkowo klasy Hammer i Saw powinny rozszerzać opis() o swoje unikatowe cechy.
 */
public class Saw extends Tool {  // Hammer rozszerza klasę Tool
    private double size;

    //konstruktor

    public Saw(String model, double price, double size) {
        super(model,price);
        this.size = size;
    } // konstruktor Saw

    public double getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Saw{" +
                " model:"+getModel()+
                " cena="+getPrice()+
                " size=" + getSize() +
                '}';
    }

    public void opis(){
        System.out.println("Tool: model="+getModel()+" długość="+getSize()+ " cena="+getPrice());
    } // metoda opis nadpisuje metodę opis z klasy nadrzędnej Tool
} // class Saw

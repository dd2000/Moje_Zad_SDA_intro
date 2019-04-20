package pl.sda.Zad_01J_coinpo_slajd_140;
/*
4. (*) Utwórz klasę ShoppingCart, która będzie reprezentować koszyk z zakupami.
        Wewnątrz klasy dodaj pole ze zmienną tablicową,
        która będzie przechowywać wybrane produkty (powiedzmy, że maksymalnie można zakupić 10 narzędzi).
        Dodaj metody:
        a) do dodawania narzędzi,
        b) do wyświetlania ich listy
        c) i metodę która zwróci łączną sumę zakupów.
  */
public class ShoppingCartApp {
    private Tool[] backet = new Tool[10]; // koszyk zakupów
    private static int item = 0;

    public void toBacket(Tool t){ // metoda dodaje Tool do koszyka
        if(item<10) {
            backet[item] = t;
            item++;
        } else {
            System.out.println("Nie ma miejsca w koszyku!");
        } // if
    } // addToll()

    public void showBacket(){  // wyświetla Tools z koszyka
        for (Tool t:
             backet) {
            if(t!=null) t.opis();
        } // foreach
        System.out.println();
    } // pokazKoszyk

    public double totalBacket(){  // zwraca wartość koszyka
        double total = 0;
        for (Tool t:
                backet) {
            if(t!=null) total+=t.getPrice();
        } // foreach
        return total;
    }


} // class ShoppingCartApp

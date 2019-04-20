package pl.sda.Zad_01J_coinpo_slajd_140;
/*
2. (cd)  Utwórz klasę ToolsShop, w której utwórz kilka narzędzi i wyświetl ich ceny.
 */
public class ToolsShopTest {
    public static void main(String[] args) {

        // tworzę zestaw narzędzi - młotki i piły
        Hammer ml1 = new Hammer("Młot",15.50, 0.5);
        Hammer ml2 = new Hammer("Młot",25.50, 1);
        Hammer ml3 = new Hammer("Młot",35.50, 1.5);
        Hammer ml4 = new Hammer("Młot",45.50, 4.5);
        Saw pila5 = new Saw("Piła", 55, 5);
        Saw pila6 = new Saw("Piła", 65, 6);
        Saw pila7 = new Saw("Piła", 75, 7);
        Saw pila8 = new Saw("Piła", 85, 8);

        // info o utworzonych Tool-sach
        System.out.println(ml1.toString());
        System.out.println(ml2.toString());
        System.out.println("model: "+ml3.getModel()+" cena="+ml3.getPrice());
        System.out.println("model: "+ml4.getModel()+" cena="+ml4.getPrice());
        System.out.println(pila5.toString());
        System.out.println(pila6.toString());
        System.out.println("model: "+pila7.getModel()+" cena="+pila7.getPrice());
        System.out.println("model: "+pila8.getModel()+" cena="+pila8.getPrice());

        // test wyświetlania opisu
        ml1.opis();
        ml2.opis();
        pila5.opis();
        pila6.opis();


        // 4. - sprawdzenie
        // Tworzę koszyk zakupów
        System.out.println("\nTworzę koszyk i dodaję narzędzia do koszyka:");
        ShoppingCartApp koszyk = new ShoppingCartApp();
        // dodaję Tools do koszyka
        koszyk.toBacket(ml3);
        koszyk.toBacket(pila7);
        koszyk.toBacket(pila5);
        koszyk.toBacket(ml1);
        // wyświetlenie zawartości koszyka
        System.out.println("W koszyku:");
        koszyk.showBacket();
        System.out.println("Wartość koszyka = "+koszyk.totalBacket()+"\n");
    } // main()

}  // class ToolsShopTest

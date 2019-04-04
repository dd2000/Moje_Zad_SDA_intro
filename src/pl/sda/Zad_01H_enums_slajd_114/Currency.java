package pl.sda.Zad_01H_enums_slajd_114;
/*
1. Utwórz enum Currency, który ma reprezentować walutę.
   Ograniczmy się do 5 walut: polski złoty, dolar, euro, jen, funt brytyjski.
3. Do enum Currency dodaj pole oznaczające symbol waluty: "PLN", "USD" itp.,
5. Do enum Currency dodaj pole oznaczające kurs waluty (w stosunku do polskiego złotego)
   oraz metodę, która wyliczy wartość podanej kwoty w obcej walucie (np.: 100 PLN ~ 23 EUR).
*/

// Zad. 1. i 3.
public enum Currency {  // enum jest specjalną klasą - typ wyliczeniowy STAŁYCH wartości (typu final)
    // do STAŁEJ enum PLN przypisano skrót "zł" oraz nazwę "polski złoty" i wartość kursu przeliczenia na zł
    // przecinek oddziela kolejne wartości skłądowe dla konstruktora enum
    PLN("zł","PLN - polski złoty",1.0),
    USD("$","USD - dolar amerykański",3.81),
    Euro("€","EURO - waluta UE",3.29),
    Jen("¥","JEN japoński",0.96),
    Funt("£","GBP - funt angielski",5.03),
    CHF("₣","CHF - frank szwajcarski",3.77);
    // listę wartości enum kończy śREDNIK !

    // enum może mieć pola, konstruktory metody - jak klasa
    private String currencySymbol;    // pola enum Currency
    private String currencyName;
    private double kurs;


    // konstruktor enum Currency - widoczność pakietowa !!
    // konstruktory enuma mogą mieć tylko widoczność:
    // private albo pakietową
    Currency(String currencySymbol, String currencyName, double kurs) {  // widoczność pakietowa, tworzy enum-y
        this.currencySymbol = currencySymbol;
        this.currencyName = currencyName;
        this.kurs = kurs;
    }  // konstruktor Currency

    // getery
    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public double getKurs() {
        return kurs;
    }

    @Override
    public String toString() {
        return "\nCurrency{" +
                "\nSymbol waluty= " + currencySymbol  +
                "\ncurrencyName = " + currencyName +
                "\n}";
    }   // toString()

    // 5. Do enum Currency dodaj metodę, która wyliczy wartość podanej kwoty w obcej walucie
    // (np.: 100 PLN ~ 23 EUR).
    public static String changePlnToOther(double kwota, Currency waluta){
        return ((kwota/waluta.kurs) + " " +waluta.currencySymbol);
    } // changePlnToOther()
} // enum Currency

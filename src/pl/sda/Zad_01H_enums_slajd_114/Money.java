package pl.sda.Zad_01H_enums_slajd_114;
/*
6. (*) Zadbaj by można było na bazie reprezentacji tekstowej ("PLN", "+" itp)
   znaleźć odpowiednią wartość enum Currency i Operation.
7. (*) Utwórz klasę Money zawierającą dwa pola: currency i value.
   Nadpisz metodę do tworzenia wartości tekstowej (toString()) tak,
   żeby wyświetlała wartość z symbolem waluty, np. 40 EURO.
   Dodaj metodę exchange(Currency currency),
   która zwróci nowy obiekt Money w nowej walucie dla aktualnej wartości.
*/
public class Money {
    private Currency currency;
    private double value;

    // konstruktor Money


    public Money(double value, Currency currency) {
        this.currency = currency;
        this.value = value;
    } // konstruktor Money()

    // gettery
    public Currency getCurrency() {
        return currency;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value + " " + currency.getCurrencySymbol();
    }

    // Dodaj metodę exchange(Currency currency),
    //   która zwróci nowy obiekt Money w nowej walucie dla aktualnej wartości.
    public Money exchange(Currency curr){
        Money wynik = new Money((this.getValue()/curr.getKurs()), curr);
        return wynik;
    } // exchange()
} // Money

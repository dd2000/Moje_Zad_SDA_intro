package pl.sda.Zad_01H_enums_slajd_114;
/*
2. Utwórz enum Operation, dla którego występować będą wartości: PLUS, MINUS, MULTIPLY, DIVIDE.
3. Do enum Currency dodaj pole oznaczające symbol waluty: "PLN", "USD" itp.,
   a do Operation reprezentację tekstową: "+", "-" itp
4. Dodaj do enum Operation metodę calculate(double a, double b),
   która dla dwóch podanych liczb wykona odpowiednią operację matematyczną
   oraz wyświetli jej wywołanie w "ładny" sposób na konsoli.
   Zadbaj o przykład użycia i wykonanie kilku operacji matematycznych. [class OperationTest.java]
*/
// Zad.2. i 3.
public enum Operation {
    PLUS("+","dodawanie","suma"),
    MINUS("-","odejmowanie","różnica"),
    MULTIPLY("*","mnożenie","iloczyn"),
    DIVIDE("/","dzielenie","iloraz");  // średnik na końcu listy!

    // pola
    private String symbol;
    private String operacja;
    private String wynik;

    // konstruktor enum-a Operation

    Operation(String symbol, String operacja, String wynik) {
        this.symbol = symbol;
        this.operacja = operacja;
        this.wynik = wynik;
    }   // konstruktor Operation

    // getery


    public String getSymbol() {
        return symbol;
    }

    public String getOperacja() {
        return operacja;
    }

    public String getWynik() {
        return wynik;
    }

    // Zad. 4. metoda: calculate()
    public double calculate(double a, double b){
        double wynikOperacji=0.0;
        switch (this){
            case PLUS: wynikOperacji = a+b;
            break;
            case MINUS: wynikOperacji = a-b;
            break;
            case MULTIPLY: wynikOperacji = a*b;
            break;
            case DIVIDE: if (b!=0.0) wynikOperacji = a / b;
            break;
        } //switch
        return wynikOperacji;
    } // calculate()

} // enum Operation

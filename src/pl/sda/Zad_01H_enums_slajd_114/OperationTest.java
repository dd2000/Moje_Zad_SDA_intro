package pl.sda.Zad_01H_enums_slajd_114;
// testowanie enum-a Operation
public class OperationTest {
    public static void main(String[] args) {
        double xa=3.4, xb=5.6;
        System.out.println("\nDziałanie: "+Operation.PLUS.getOperacja()
                +" --> "+Operation.PLUS.getWynik()+" = "+
                +Operation.PLUS.calculate(xa,xb));
        System.out.println("Działanie: "+Operation.MINUS.getOperacja()
                +" --> "+Operation.MINUS.getWynik()+" = "+
                +Operation.MINUS.calculate(xa,xb));
        System.out.println("Działanie: "+Operation.MULTIPLY.getOperacja()
                +" --> "+Operation.MULTIPLY.getWynik()+" = "+
                +Operation.MULTIPLY.calculate(xa,xb));
        System.out.println("Działanie: "+Operation.DIVIDE.getOperacja()
                +" --> "+Operation.DIVIDE.getWynik()+" = "+
                +Operation.DIVIDE.calculate(xa,xb));
        // zamiana kwoty PLN na inną walutę
        double kwotaPLN = 100;
        System.out.println("\nMasz: "+kwotaPLN+" złotych.");
        System.out.println("Za "+kwotaPLN+" PLN możesz kupić: "+Currency.changePlnToOther(kwotaPLN,Currency.PLN));
        System.out.println("Za "+kwotaPLN+" PLN możesz kupić: "+Currency.changePlnToOther(kwotaPLN,Currency.USD));
        System.out.println("Za "+kwotaPLN+" PLN możesz kupić: "+Currency.changePlnToOther(kwotaPLN,Currency.Euro));
        System.out.println("Za "+kwotaPLN+" PLN możesz kupić: "+Currency.changePlnToOther(kwotaPLN,Currency.Jen));
        System.out.println("Za "+kwotaPLN+" PLN możesz kupić: "+Currency.changePlnToOther(kwotaPLN,Currency.Funt));
        System.out.println("Za "+kwotaPLN+" PLN możesz kupić: "+Currency.changePlnToOther(kwotaPLN,Currency.CHF));

        Money ilePLN = new Money(1,Currency.PLN);
        System.out.println("\nZamieniam "+ilePLN.getValue()+" jednostek"+ilePLN.getCurrency()+":");
        System.out.println(ilePLN.exchange(Currency.USD));
        System.out.println(ilePLN.exchange(Currency.CHF));
        System.out.println(ilePLN.exchange(Currency.Funt));

    } //main()
} // class OperationTest

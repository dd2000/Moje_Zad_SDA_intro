package pl.sda._1_pola_metody_statyczne.Zadanie_4;
/*  JESZCZE NIE WYKONANE
* Dodaj do klasy Math statyczne klasy wewnętrzne i zadbaj o odpowiedni podział metod.
* Przykład: Operation [multiply, divide, add, minus], Compare [min, max]
* Zmodyfikuj swoje przykłady użycia.

*/

public class MMath {

    static double Pi = 3.14;  // (b)

    static double add(double a, double b){
        return (a+b);
    }
    static double substract(double a, double b){
        return (a-b);
    }
    static double multiply(double a, double b){
        return (a*b);
    }
    static double divide(double a, double b){
        return (a/b);
    }
    static double min(double a, double b){
        if (a<b)
            return a;
        else return b;
    }
    static double max(double a, double b){
        if (a>b)
            return a;
        else return b;
    }
    static double pow(double a, double b){
        return (Math.pow(a,b));
    }
    static double pole(double r){
        return Pi*r*r;
    }

    // taki konstruktor się nie wykona, bo jest private lub: klasa jest abstract
    private MMath() {
        System.out.println("Nie można utworzyć obiektu typu MMath");
    }
}

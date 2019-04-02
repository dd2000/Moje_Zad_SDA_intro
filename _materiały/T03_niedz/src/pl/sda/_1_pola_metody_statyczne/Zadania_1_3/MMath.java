package pl.sda._1_pola_metody_statyczne.Zadania_1_3;
/*
Napisz własną klasę Math, która będzie posiadać metody statyczne:
add, subtract, multiply, divide, min, max, pow
gdzie każda z nich będzie przyjmowała dwa parametry liczbowe. Dla każdej z metod utwórz przykład użycia.

b) Dodaj do klasy Math statyczną stałą PI = 3,14, a następnie dodaj metodę do wyliczania pola koła.
W przykładzie użycia oblicz pole koła o promieniu: 8.

c) Dodaj do swojej klasy konstruktor prywatny, który nie pozwoli utworzyć instancji klasy.

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

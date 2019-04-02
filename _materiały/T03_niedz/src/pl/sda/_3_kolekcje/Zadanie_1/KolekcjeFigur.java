package pl.sda._3_kolekcje.Zadanie_1;

/*
    Bazując na kodzie utworzonym na potrzeby omawiania interfejsów,
    utwórz kolekcję figur każdego typu.
    Na podstawie utworzonej kolekcji, oblicz pola i obwody wszystkich figur znajdujących się w kolekcji.

 */

import pl.sda._3_kolekcje.Zadanie_1.interfaces.*;

import java.util.*;

public class KolekcjeFigur  {
    public static void main(String[] args) {
        List<Circle> circleList = new ArrayList<>();
        circleList.add(new Circle(5));
        circleList.add(new Circle(8));
        circleList.add(new Circle(15));

        List<Rectangle> rectangleList = new ArrayList<>();
        rectangleList.add(new Rectangle(5,4));
        rectangleList.add(new Rectangle(2,4.5));
        rectangleList.add(new Rectangle(3.5,2.5));

        double circleArea = 0.0;
        double circlePerimeter = 0.0;

        Iterator<Circle> circleIterator = circleList.iterator();
        while (circleIterator.hasNext()){
            circleArea += 1; // dodaj kolejne pole koła
        } //while
        System.out.println(circleList.size());

    } // main
} // class KolekcjeFigur

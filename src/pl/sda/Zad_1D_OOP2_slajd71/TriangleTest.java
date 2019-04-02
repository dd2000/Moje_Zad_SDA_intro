package pl.sda.Zad_1D_OOP2_slajd71;
/*
1. Utwórz klasę Triangle i napisz metodę isRectangular(),
   która jako argumenty przyjmować będzie trzy liczby całkowite.
   Metoda powinna zwrócić true, jeśli z odcinków o długości przekazanych w argumentach
   można zbudować trójkąt prostokątny. Wzór który może pomóc: c2 = a2 + b2
*/
public class TriangleTest {
    public static void main(String[] args) {
        Triangle trojkat = new Triangle();  // nowy obiekt trójkąt
        if (trojkat.isRectangular(2,4,5))   // na obiekcie trojkat wykonana jest metoda isRectangular
            System.out.println("\nTrójkąt jest prostokątny.");
        else System.out.println("\nTrójkąt NIE JEST prostokątny.");
    }   // main()
}   //  class TriangleTest

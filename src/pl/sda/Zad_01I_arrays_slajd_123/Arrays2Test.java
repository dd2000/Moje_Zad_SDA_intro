package pl.sda.Zad_01I_arrays_slajd_123;
/*
2. Napisz metodę, która jako jedyny parametr przyjmuje zmienną typu int[]
   i zwróci sumę wszystkich elementów tablicy.
*/
public class Arrays2Test {
    public static void main(String[] args) {
        // utworzenie tablicy int-ów
        int[] inty = {4,6,1,3,2,7,9,6,3,2};

        // wywołanie metody sumaInt dla tablicy inty
        sumaInt(inty);
    } // main()

    // metoda sumująca elementy tablicy intów
    public static void sumaInt(int[] tab){
        int suma = 0; // zmienna pomocnicza
        for (int i: tab) {
            suma+=i;
        }
        System.out.println("\nSuma liczb w tablicy wynosi "+suma+".");
    } // sumaInt()
} // class Arrays2Test

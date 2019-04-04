package pl.sda.Zad_01I_arrays_slajd_123;
/*
3. Napisz metodę, która jako parametr przyjmuje parametr int count
   i w wyniku zwraca tablicę wypełnioną liczbami parzystymi zaczynając od 2,
   tablica ma zawierać ilość liczb wskazanych przez parametr count.
*/
public class Arrays3Test {
    public static void main(String[] args) {
        int elementy = 7; // określenie liczby elementów w tablicy
        int[] tab = new int[elementy];
        tab = parzyste(elementy);

        // wypisanie tablicy tab
        System.out.println("\nElementy tablicy tab:");
        for (int e:
             tab) {
            System.out.print(e+" ");
        } // foreach()

    } // main()

    // metoda parzyste(...) zwracająca tablicę
    public static int[] parzyste(int count){
        int[] wynik = new int[count]; // deklaracja tablicy intów o rozmiarze count
        int w=1;
        for (int k:
             wynik) {
                wynik[w-1] = w*2;
                w++;
        } // foreach
        return wynik; // zwróć tablicę wypełnioną wartościami
    } // parzyste()
} // class Arrays3Test

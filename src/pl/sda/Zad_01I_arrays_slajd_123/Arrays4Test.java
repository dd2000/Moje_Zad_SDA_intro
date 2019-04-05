package pl.sda.Zad_01I_arrays_slajd_123;
/*
4. Napisz metodę, która jako parametr przyjmuje tablicę typu float[]
   i w wyniku swojego działania powoduje podwojenie wartości dla każdego indeksu przekazanej tablicy.
*/
public class Arrays4Test {
    public static void main(String[] args) {
        float[] ftab = {3.4f,-5,5.2f,-1,0,0.5f};
        System.out.println("\nWartości tablicy źródłowej:");
        for (float f:
                ftab) {
            System.out.print(f+" ");
        } // foreach
        // wywołanie metody podwojenie()
        podwojenie(ftab);

        System.out.println("\nPodwojone wartości tablicy źródłowej:");
        for (float f:
             ftab) {
            System.out.print(f+" ");
        } // foreach
    } // main()

    // metodę, która jako parametr przyjmuje tablicę typu float[]
    // i w wyniku swojego działania powoduje podwojenie wartości
    // dla każdego indeksu przekazanej tablicy.
    public static float[] podwojenie(float[] tab){
        int size = tab.length;
        for (int i=0; i<size; i++)
            tab[i] = 2*tab[i];
        return tab;
    } // podwojenie();
} // class Arrays4Test

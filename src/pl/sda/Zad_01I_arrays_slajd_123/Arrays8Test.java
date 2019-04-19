package pl.sda.Zad_01I_arrays_slajd_123;
/*
8. (*) Przerób metodę z zadania nr 2 tak, żeby metoda przyjmowała tablicę dwuwymiarową typu int[][]
   i liczyła sumę z wszystkich tablic (wierszy tablicy).
 */
public class Arrays8Test {
    public static void main(String[] args) {
        // utworzenie  dwuwymiarowej tablicy int-ów
        int[][] ints = {
                        {4,6,1,3,2,7,9,6,3,2},
                        {4,6,1,3,2,7,9,6,3,2},
                        {4,6,1,3,2,7,9,6,3,2},
                        {4,6,1,3,2,7,9,6,3,2},
                        {4,6,1,3,2,7,9,6,3,2}};
        System.out.println("Wiersze: "+ints.length);
        System.out.println("Kolumny: trzeba sprawdzić w każdym wierszu !!!");

        // wywołanie metody sumaInt2 dla tablicy ints
        sumaInt2(ints);
    } // main()

    // metoda sumująca elementy tablicy intów
    public static void sumaInt2(int[][] tab){
        int suma = 0, elementy=0; // zmienna pomocnicza
        int wiersze=tab.length;

        for (int[] wiersz:
             tab) {
         int kolumny = wiersz.length;
         for(int i=0; i<kolumny; i++){
             suma += wiersz[i];
             elementy++;
         } //for
        }

        System.out.println("\nSuma "+elementy+ " elementów w tablicy wynosi "+suma+".");
    } // sumaInt()
} // class Arrays8Test

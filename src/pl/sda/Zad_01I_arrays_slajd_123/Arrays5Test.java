package pl.sda.Zad_01I_arrays_slajd_123;
/*
5. Napisz metodę, która jako parametr przyjmuje zmienną typu double[]
   i wyświetla na konsoli: pierwszy, środkowy (jeden lub dwa środkowe) i ostatni element tablicy,
   a także średnią arytmetyczną wszystkich liczb z tabeli.
*/
public class Arrays5Test {
    public static void main(String[] args) {
        double[] dtab = {2, -1, 9, 5, -45, -7, -2.2, 6.5, 4.2, 4};
        System.out.println("\nTablica źródłowa:");
        for (double d:
             dtab) {
            System.out.print(d+" ");
        } // foreach

        // wywołanie metody wybieranie();
        if(dtab.length > 1)
            wybieranie(dtab);
        else if (dtab.length == 1)
                System.out.println("\n\nPierwszy, środkowy i ostatni element tablicy są takie same:"+dtab[0]);
             else System.out.println("\nTablica pusta - nie posiada elementów.");
    } // main();


    // metoda, która jako parametr przyjmuje zmienną typu double[]
    //   i wyświetla na konsoli: pierwszy, środkowy (jeden lub dwa środkowe) i ostatni element tablicy,
    //   a także średnią arytmetyczną wszystkich liczb z tabeli.
    public static void wybieranie(double[] tab){
        int size = tab.length;
        double suma = 0;
        for(int i=0; i<tab.length; i++){
            suma += tab[i];
            if (i==0) System.out.println("\n\nPierwszy element tablicy = "+tab[i]);
            if(((tab.length%2) == 0)&&(i == (tab.length/2))) System.out.println("środkowe elementy tablicy: "
                    +tab[(tab.length/2)-1]+" oraz "+tab[(tab.length/2)]);
            if(((tab.length%2) == 1)&&(i == (tab.length/2))) System.out.println("środkowy element tablicy = "
                    +tab[tab.length%2]);
            if (i == (tab.length-1)) System.out.println("Ostatni element tablicy = "+tab[i]);
        } // for
        System.out.println("\nśrednia wartość elemetu tablicy = "+(suma/tab.length));
    } // wybieranie();
} // class Array5Test

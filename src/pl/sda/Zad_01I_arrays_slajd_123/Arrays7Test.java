package pl.sda.Zad_01I_arrays_slajd_123;

import java.util.Arrays;

/*
7. Przerób każdą z poprzednich metod (poza nr 3) tak, żeby przyjmowała parametry jako varargs.
 */
public class Arrays7Test {
    public static void main(String[] args) {
        // test 1. varargs
        writeNames("Ala","Ola","Kasia","Basia","Jasia");

        // test 2.  metoda sumująca elementy int (dowolna liczba argumentów int)
        sumaInt(1,2,3,4,5,10,15);

        // test 4.
        System.out.println("\nPodwojenie wartości float będących argumentami metody:");
        float[] ntab = podwojenie(1.1f, 3f, 4.2f, -2.5f, -7f, 3.7f); // xx.yf oznacza liczbę float

        //System.out.println(podwojenie(1.1f, 3.0f, 4.2f, -2.5f, -7.0f, 3.7f).toString());
        System.out.println("ToString(ntab) wyświetla: "+ntab.toString());


        // test 5.  wybiera pierwszy, środkowy(e) i ostatni parametr wywołanej metody
        wybieranie(1.1, 3.0, 4.2, -2.5, -7.0, 3.7, 6.66, 3);


        // test 6.
        // tworzenie 6-ciu obiektów typu Car, które mogą być parametrami
        Car sam1 = new Car("Toyota","red");
        Car sam2 = new Car("Fiat","white");
        Car sam3 = new Car("Jeep","purple");
        Car sam4 = new Car("Opel","yellow");
        Car sam5 = new Car("Volkswagen","silver");
        Car sam6 = new Car("Mercedes","blue");



        System.out.println("\n\nParametry samX w odwróconej kolejności");
        //System.out.println(reverseAutos(sam1,sam2,sam3,sam4));
        for (Car auto:
                reverseAutos(sam1,sam2,sam3,sam4)) {
            System.out.println(auto.toString());
        }





    }  // main()

    // ---1. varargs String
    public static void writeNames(String... names){
        System.out.println("Podano imiona: ");
        for (String name:
             names) {
            System.out.print(name+" ");
        }  // foreach
        System.out.println();
    }  // writeNames()


    // ---2. int-y varargs
    // metoda sumująca elementy int (dowolna liczba argumentów)
    public static void sumaInt(int... ints){
        int suma = 0; // zmienna pomocnicza
        System.out.println("\nPodano argumenty:");
        for (int i: ints) {
            System.out.print(i+" ");
            suma+=i;
        }
        System.out.println("\nSuma liczb podanych jako argumenty metody wynosi "+suma+".");
    } // sumaInt()


    // 4. metodę, która jako parametr przyjmuje varargs float
    // i w wyniku swojego działania powoduje podwojenie wartości
    // dla każdego z przekazanych parametrów.
    public static float[] podwojenie(float ... floats){
        int size = floats.length;
        float[] tab = new float[size];
        int index = 0;
        for (float f:
             floats) {
            tab[index] = 2*f;
            System.out.println(f+" --> "+tab[index]);
            index++;
        } // foreach
        return tab;
    } // podwojenie();


    // 5. varargs double
    // metoda, która jako parametr przyjmuje zmienne (varargs) typu double
    //   i wyświetla na konsoli: pierwszy, środkowy (jeden lub dwa środkowe) i ostatni element tablicy,
    //   a także średnią arytmetyczną wszystkich liczb będących parametrami metody.
    public static void wybieranie(double... doubles){
        int size = doubles.length;
        double suma = 0;
        System.out.print("\nMetodę wywołano z parametrami: ");
        for (double d:
             doubles) {
            System.out.print(d+", ");
            suma+=d;
        }
        System.out.println("\nPierwszy parametr: "+doubles[0]);
        System.out.print("W środku: ");
        if((size%2)==0) System.out.print(doubles[(size/2)-1]+" oraz ");
        System.out.print(doubles[(size/2)]);

        System.out.println("\nOstatni parametr to: "+doubles[size-1]);
        System.out.println("średnia wartość elemetu tablicy = "+(suma/size));
    } // wybieranie();

    // 6. parametry Object jako varargs
    public static Car[] reverseAutos(Car... cars){
        int size =  cars.length;
        Car[] wynik = new Car[size];
        System.out.println("\nKolejność parametrów wejściowych:");
        for (Car c:
             cars) {
            size--;
            wynik[size] = c;
            System.out.println(c.toString());
        }
        System.out.println("\nKolejność wynikowa:");
        return wynik;
    } // reverseAutos()


}  // class Arrays7Test

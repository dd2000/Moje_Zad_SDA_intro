package pl.sda.Zad_01I_arrays_slajd_123;
/*
6. Napisz metodę, która jako parametr przyjmuje zmienną typu Car[]
   (klasę Car powinieneś mieć utworzoną w ramach poprzednich zadań)
   i zwróci tablicę z odwróconą kolejnością elementów.
*/
public class Arrays6Test {
    public static void main(String[] args) {
        // utworzenie tablicy Car[] sześcioelementowej
        // i zapełnienie jej kolejnymi wartościami
        Car[] auta = new Car[6];
        auta[0] = new Car("Toyota","red");
        auta[1] = new Car("Fiat","white");
        auta[2] = new Car("Jeep","purple");
        auta[3] = new Car("Opel","yellow");
        auta[4] = new Car("Volkswagen","silver");
        auta[5] = new Car("Mercedes","blue");

        System.out.println("\nTablica źródłowa:");
        for (Car c:
             auta) {
            System.out.println(c.toString());
        } // foreach

        // wywołanie metody reverseOrder()
        reverseOrder(auta);

        System.out.println("\nTablica wynikowa (odwrócona):");
        for (Car c:
                auta) {
            System.out.println(c.toString());
        } // foreach
    } // main()

    // metoda: odwracająca kolejność elementów
    public static Car[] reverseOrder(Car[] tab){
        Car temp = new Car(); // w klasie Car musi być zdefiniowany bezparametrowy konstruktor Car()
        for (int i=0; i<(tab.length/2);i++){
            // zamiana elementów miejscami
            temp = tab[i];
            tab[i] = tab[tab.length-(i+1)];
            tab[tab.length-(i+1)] = temp;
        } // for
        return tab;
    } // reverseOrder()

} // class Arrays6Test

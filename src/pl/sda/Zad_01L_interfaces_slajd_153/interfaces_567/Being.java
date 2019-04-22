package pl.sda.Zad_01L_interfaces_slajd_153.interfaces_567;
/*
5. Utwórz nowy interfejs Being i dodaj do niego:
    a. sygnaturę metody getAge()
    b. pole MAX_AGE = 100
    c. metodę domyślną: isAlive() [żyje] - która zwróci true jeżeli wiek istoty jest mniejszy od MAX_AGE.

*/


public interface Being {


    int MAX_AGE=100;

    int getAge();

    // metoda zwraca informację, czy obiekt żyje (jest nie starszy niż 100 lat)

    default boolean isAlive(){
        if ((MAX_AGE-getAge()) > 0)  return true;
        else return false;
    } // boolean isAlive()

} // interface Being

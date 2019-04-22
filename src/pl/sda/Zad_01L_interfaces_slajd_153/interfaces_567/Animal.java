package pl.sda.Zad_01L_interfaces_slajd_153.interfaces_567;
/*
1. Utwórz interfejs Animal oraz dodaj do niego sygnatury metod: getName() i speak().
2. Utwórz kilka różnych implementacji interfejsu Animal po jednym dla: ptaków, ssaków, ryb, gadów, owadów.

6. Dodaj do interfejsu Animal dziedziczenie z interfejsu Being
7. Nadpisz w jednej z klas zwierząt metodę isAlive()
*/
public interface Animal extends Being {

    // sygnatury metod
    String getName();
    String speak();
}

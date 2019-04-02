package pl.sda._1_pola_metody_statyczne;

public class _opis {
}


// Pola i metody statyczne maja dostęp TYLKO do innych metod i pół statycznych
// statyczne - to znaczy po utworzeniu cały czas pozostają w pamieci, do końca trwania aplikacji
// możemy odwoływać się do nich z różnych miejsc (obiektów) - bo cały czas są w pamięci
// metoda MAIN też jest statyczna !!!
// użycie statica powinno być ograniczone do minimum
// przykład pola count  [slajd 165] - jest cały czas w pamieci i może być modyfikowane przez różne obiektu


// bloki inicjacyjne to ciag instrukcji w nawiasach klamerkowych np.: {instrukcja1; instrukcja2;.....;instrukcjaN}
// blokin icjacyjny może być STATIC np. static{instrukcja1; instrukcja2;.....;instrukcjaN}
// bloki inicjacyjne wykonują sie przed konstruktorem !!!

// Główna klasa NIE MOŻE BYC STATYCZNA, ale statyczne mogą być klasy wewnętrzne (zdefiniowane wewnatrz klasy głównej)
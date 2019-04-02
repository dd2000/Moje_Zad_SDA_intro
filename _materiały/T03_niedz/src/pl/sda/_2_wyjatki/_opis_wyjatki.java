package pl.sda._2_wyjatki;

/*
Temat: WYJĄTKI
 */
public class _opis_wyjatki {
}

/*
 >>> Slajdy od: 175

Exception (wyjątek) czyli zdarzenie wyjatku (exception event) - np. przy dzieleniu przez zero.
Wyjatek powiniec zostac obsłużony - obsługa wyjatku: co zrobić, gdy wyjatej zajdzie.

Klasa Trowable (rzucalna) - JAVA wie, ze moze być rzucony wyjatek,
gdy nasza klasa dziedziczy po Trowable lub jej podklasach (patrz slajd 178).
            np.:
            throw new IllegalArgumentException();
            ...
            public void loadFile() throws IOException {
            ...
            }

Łapanie wyjatków:

            try {
                   …kod, w którym moze wystąpić wyjatek
            } catch (Exception e) {
                                    …  co ma się dziać, gdy wyjatek wystapi
            } finally {
                        ... wykona sie niezależnie, czy wystapił wyjatek, wykona się za każdym razem
            }


(***)  bloków "catch(){...}" może być kilka natępujacych po sobie obsługujących różne typy wyjatków


Przykłady:   --->>> package pl.sda.exceptions
                    1. ExceptionExampleBasic.java

Klasa RuntimeException - gdy podane specyficzne dane powoduja uszkodzenie działajacego kodu (wyjatki I/O)

   try...catch()...finally... jest podobne w konstrukcji i działaniu do switch...case...default...



*/
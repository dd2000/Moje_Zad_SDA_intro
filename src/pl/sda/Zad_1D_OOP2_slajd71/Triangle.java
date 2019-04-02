package pl.sda.Zad_1D_OOP2_slajd71;
/*
1. Utwórz klasę Triangle i napisz metodę isRectangular(),
   która jako argumenty przyjmować będzie trzy liczby całkowite.
   Metoda powinna zwrócić true, jeśli z odcinków o długości przekazanych w argumentach
   można zbudować trójkąt prostokątny. Wzór który może pomóc: c2 = a2 + b2

2. Przenieś kod zapisany w metodach main() klas FahrenheitConverter2Test i ComputerPrice2
   do osobnych metod, np.: convertToCelsius(double temperatureInFahrenheit), getComputerPrice()

3. W klasie FahrenheitConverter2Test dodaj metodę,
   która konwertuje temperatury w drugą stronę (Celsjusz → Fahrenheit)

4. W klasie ComputerPrice2 wydziel metody:
      getComputerPrice(),
      getMonitorPrice() i
      getComputerAndMonitorPrice().
   Ostatnia z metod ma korzystać z dwóch pierwszych.
   Zmienną VAT ustaw jako pole klasy ComputerPrice2.

5. (*) Utwórz nową klasę Temperature, która będzie posiadała pola:
           double temperature,
           String date,
           String hour.
       Klasa określa temperaturę w skali Celsjusza w konkretnym dniu i o konkretnej godzinie.
       Dodaj konstruktor inicjalizujący wszystkie trzy pola,
       metody-gettery dla każdego pola
       + dodaj metodę show(), która będzie zwracała napis w postaci:
       {date} {hour} - {temperature} °C, np: 2018-10-01 10:45 - 13 °C.

6. (*) Dodaj do klasy Temperature metodę showInFahrenheit(),
       która zwróci taki sam napis jak wyżej, tylko w skali Fahrenheit.
       Do konwersji temperatur użyj klasy FahrenheitConverter2Test.
*/
public class Triangle {

    public boolean isRectangular(int a, int b, int c){
        if ((a*a) == (b*b+c*c)) return true;
        if ((b*b) == (a*a+c*c)) return true;
        if ((c*c) == (b*b+a*a)) return true;
        return false;
    } // isRectangular()

}   // class Triangle

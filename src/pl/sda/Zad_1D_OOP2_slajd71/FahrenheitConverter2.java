package pl.sda.Zad_1D_OOP2_slajd71;
/*  Slajd 72 #OOP2

2. Przenieś kod zapisany w metodach main() klas FahrenheitConverter2Test
   do osobnych metod, np.: convertToCelsius(double temperatureInFahrenheit)
3. W klasie FahrenheitConverter2Test dodaj metodę,
   która konwertuje temperatury w drugą stronę (Celsjusz → Fahrenheit)

*/
public class FahrenheitConverter2 {
    // nie tworzę pól, bo nie przechowuję wartości tempC i tempF
    //private double tempC;
    //private double tempF;

    // nie tworzę konstruktora - konstruktor domyślny bezparametrowy!

    // Zad. 2. i 3.
    public double convertToCelsjus(double temperatureInFahrenheit) {
        return ((temperatureInFahrenheit - 32)/(9.0/5));
    }   // convertToCelsjus()

    public double convertToFahrenheit(double temperatureInCelsjus) {
        return ((temperatureInCelsjus*9.0/5.0) + 32);
    }   // convertToFahrenheit()



}   // class FahrenheitConverter2

package pl.sda.Zad_1A_DataTypes_slajd34;
/*
Program FahrenheitConverter2Test - slajd 34
Zadanie 7.

 7. W osobnej klasie FahrenheitConverter2Test,
    w metodzie main() napisz program przekształcający
    dane o temperaturze podanej w skali Fahrenheit do skali Celsjusza.
    Dane wejściowe (temperatura w skali Fahrenheit)
    podać w inicjacji odpowiedniej zmiennej w programie.
    Sprawdź czy program poprawnie oblicza temperatury dla danych:
    32 °F = 0 °C; 212 °F = 100 °C
*/

public class FahrenheitConverter {
    public static void main(String[] args) {
        double tempF = 32;
        double tempC = (tempF - 32)/(9.0/5);
        System.out.println("\nTemperatura "+tempF+" stopni Fahrenheita to "+tempC+" stopni Celsjusza.");
    }   // main
}   // class FahrenheitConverter2Test

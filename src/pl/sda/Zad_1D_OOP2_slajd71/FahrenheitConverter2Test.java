package pl.sda.Zad_1D_OOP2_slajd71;
/*
                         Program FahrenheitConverter - slajd 34 Zadanie 7.
                         Zrobione wcześniej: Zad_1A_DataTypes
                         7. W osobnej klasie FahrenheitConverter2Test,
                            w metodzie main() napisz program przekształcający
                            dane o temperaturze podanej w skali Fahrenheit do skali Celsjusza.
                            Dane wejściowe (temperatura w skali Fahrenheit)
                            podać w inicjacji odpowiedniej zmiennej w programie.
                            Sprawdź czy program poprawnie oblicza temperatury dla danych:
                            32 °F = 0 °C; 212 °F = 100 °C

*/

public class FahrenheitConverter2Test {
    public static void main(String[] args) {
        double tempF = 212;
        double tempC = 100;

        // tworzenie obiektu tempX klasy FahrenheitConwerter2
        FahrenheitConverter2 tempX = new FahrenheitConverter2();

        System.out.println("\nTemperatura "+tempF+" stopni Fahrenheita to "
                              +tempX.convertToCelsjus(tempF)+" stopni Celsjusza.");
        System.out.println("\nTemperatura "+tempC+" stopni Celsjusza to "
                +tempX.convertToFahrenheit(tempC)+" stopni Fahrenheita.");
    }   // main()
}   // class FahrenheitConverter2Test

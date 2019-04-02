package pl.sda.Zad_1D_OOP2_slajd71;

public class TemperatureTest {
    public static void main(String[] args) {

        // utworzenie obiektu klasy Temperature
        Temperature myTemp = new Temperature("28.03.2019 r.","22:33",12.5);

        myTemp.show();    // wypisuje informacje o temperaturze w stopniach Celsjusza
        myTemp.showInFahrenheit();  // wypisuje informacje o temperaturze w stopniach Fahrenheita

    }   // main()
}

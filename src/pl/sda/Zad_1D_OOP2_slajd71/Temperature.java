package pl.sda.Zad_1D_OOP2_slajd71;
/*
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
public class Temperature {
    private double temperature;
    private String date;
    private String hour;
    // konstruktor

    public Temperature(String date, String hour, double temperature) {
        this.temperature = temperature;
        this.date = date;
        this.hour = hour;
    }

    // metody-gettery dla każdego pola

    public double getTemperature() {
        return temperature;
    }

    public String getDate() {
        return date;
    }

    public String getHour() {
        return hour;
    }

    // + dodaj metodę show(), która będzie zwracała napis w postaci:
    //       {date} {hour} - {temperature} °C, np: 2018-10-01 10:45 - 13 °C.

    public void show(){
        System.out.println(getDate()+", "+getHour()+" - "+getTemperature()+" °C.");
    }  // show() [in Celsius]


    // Dodaj do klasy Temperature metodę showInFahrenheit(),
    //  która zwróci taki sam napis jak wyżej, tylko w skali Fahrenheit.
    // Do konwersji temperatur użyj klasy FahrenheitConverter2Test.

    public void showInFahrenheit(){
        FahrenheitConverter2 tempF = new FahrenheitConverter2();

        System.out.println(getDate()+", "+getHour()+" - "+tempF.convertToFahrenheit(getTemperature())+" °F.");
    }  // showInFahrenheit()


}   // class Temperature

package pl.sda.Zad_1A_DataTypes_slajd34;

/*
Program zmiene - slajd 34
Zadania 1-6

7. W osobnej klasie FahrenheitConverter2Test,
   w metodzie main() napisz program przekształcający
   dane o temperaturze podanej w skali Fahrenheit do skali Celsjusza.
   Dane wejściowe (temperatura w skali Fahrenheit)
   podać w inicjacji odpowiedniej zmiennej w programie.
   Sprawdź czy program poprawnie oblicza temperatury dla danych:
		32 °F = 0 °C; 212 °F = 100 °C

8. W osobnej klasie ComputerPrice2, w metodzie main() napisz program
   obliczający cenę komputera na podstawie jego części.
   Program ma wypisać na konsolę osobno cenę samego komputera:
   płyta główna, procesor, pamięć RAM, dysk twardy
   i osobno cenę komputera i monitora.
   W cenie należy uwzględnić podatek VAT = 23%.

 */
public class Variables_Zad_1_6_Slajd_34 { // nazwa klasy musi być taka sama, jak nazwa pliku *java
    public static void main(String[] args) {
        // 1. Napisz program, który utworzy dwie zmienne,
        //   a następnie wypisze na ekran ich sumę, różnicę i iloczyn.

//        // wczytuję z klawiatury wartość zmiennej a
//        // w konsoli JAVA liczby zmiennoprzecinkowe wprowadzaj z PRZECINKIEM !!! nie kropką !
//
//        Scanner in = new Scanner(System.in); // tworzenie strumienia wejścia z klawiatury
//        System.out.print("\n\na= ");
//        // tworzę dwie zmienne typu double
//        double a = in.nextDouble();    // wczytanie z klawiatury wartości zmiennej  a typu double
//        // wczytuję z klawiatury wartość zmiennej b
//        System.out.print("\nb= ");
//        double b = in.nextDouble();    // wczytanie z klawiatury zmiennej typu double
//
//        // wypisuję na ekran ich sumę, różnicę i iloczyn liczb wczytanych do zmiennych a i b
//        System.out.println("Suma: "+a+"+"+b+" = "+(a+b));
//        System.out.println("Różnica: "+a+"-"+b+" = "+(a-b));
//        System.out.println("Iloczyn: "+a+"*"+b+" = "+(a*b));

        // 2. Napisz program, który tworzy jedną zmienną,
        //   a następnie wypisze na ekran jej wartość podniesioną do 3 potęgi.

//        double c;   // deklaracja zmiennej c (double)
//        System.out.print("\nc= ");
//        c = in.nextDouble();
//        System.out.println("Trzecia potęga liczby: "+c+" = "+(c*c*c)+"\n");

        // 3. Napisz program, który utworzy jedną zmienną,
        //   a następnie wypisze na ekran tekst:
        //   true jeżeli wartość tej zmiennej jest liczbą parzystą lub
        //   false w przeciwnym przypadku.

//        int digit;
//        System.out.print("\ndigit(całkowita)= ");
//        digit = in.nextInt();
//        System.out.println("Kolejny komunikat określi, czy digit jest parzysta (true), czy nie (false):");
//        System.out.println(((digit%2) == 0));

        // 4. Napisz program, który utworzy jedną zmienną,
        //   a następnie wypisze na ekran tekst:
        //   true jeżeli wartość tej zmiennej jest podzielna przez 3 i jednocześnie przez 5
        //   lub false w przeciwnym przypadku.
        // program wykorzystuje tę samą zmienną digit, co w zadaniu 3.

//        System.out.println("Kolejny komunikat określi, czy digit jest podzielna przez 3 i jednocześnie przez 5:");
//        System.out.println(((digit%3) == 0) && ((digit%5) == 0));

        // 5. Wyświetl na ekranie pięć pierwszych liter alfabetu:
        //    łacińskiego (zaczyna się od kodu: 65),
        //    hebrajskiego (zaczyna się od: 1488) i
        //    tybetańskiego (zaczyna się od: 3840)

        System.out.println("łacińskie:");
        for (int i=0; i<5;i++){
            System.out.print((char)(65+i) + " ");
        } // for
        System.out.println();

        System.out.println("hebrajskie:");
        for (int i=0; i<5;i++){
            System.out.print((char)(1488+i) + " ");
        } // for
        System.out.println();

        System.out.println("tybetańskie");
        for (int i=0; i<5;i++){
            System.out.print((char)(3840+i) + " ");
        } // for
        System.out.println();




        // 6. Wyświetl na ekranie w jednej linijce znaki (char)
        //   dla kodów: 74, 65, 86, 65, 32, 8658, 32, 9786

        System.out.println("Znaki: 74, 65, 86, 65, 32, 8658, 32, 9786");
        System.out.println(""+ (char)74 + (char)65 + (char)86 + (char)65 + (char)32 + (char)8658 + (char)32 + (char)9786);
        // do łańcucha pustego dołaczane są kolejne znaki



    } // main
}   // class Variables_Zad_1_6_Slajd_34

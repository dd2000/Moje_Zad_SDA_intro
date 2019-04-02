package pl.sda.Zad_1B_Statements_slajd42;
/*
1. Napisz program, który wypisze na ekran konsoli,
   czy dana liczba całkowita znajduje się w przedziale 1-10, 11-100, 101-1000, 1001-10000,
   czy też może jest mniejsza od 0 lub większa od 10000.
   Parametrem wejściowym niech będzie zmienna zainicjowana na początku programu.

2. Napisz program, który wypisze na ekran konsoli
   słowo oznaczające ocenę dla podanej cyfry.
   Np. dla 1 - "niedostateczny", 2 - "mierny" itp.
   Obsłuż przypadek gdy cyfra jest poza skalą ocen.

3. Napisz program, który wypisze na ekran konsoli cyfrę arabską
   dla podanej liczby rzymskiej (od 1 do 9).
   Czyli np. dla 'I' wypisze 1, dla 'V' 5 itp.
   Obsłuż przypadek gdy podana liczba rzymska jest nieprawidłowa.

4. Napisz program, który wypisze na ekran konsoli,
   czy podany kod Unicode jest liczbą (0-9), małą literą (a-z) czy też wielką literą (A-Z).
   Kody każdej z grup znaków następują po sobie,
   więc wystarczy znaleźć kod np. dla litery 'a' i 'z' i sprawdzić,
   czy podany kod zawiera się w tym przedziale.

5. Napisz program, który dla podanej liczby wypisze na ekran konsoli dzień tygodnia
   (dla 1 - "poniedziałek", 2 - "wtorek" itp).
   Dodatkowo wyświetl, ile dni zostało do weekendu, dla poniedziałku - 5 dni, wtorku - 4 itp.

6. * Zobacz w jaki sposób można pobrać dane od użytkownika (z konsoli)
   - analizując klasę: pl.sda.statements.ScannerApp.
   Spróbuj dodać wczytywanie liczb z konsoli do każdego z zadań powyżej.

   odp.6:
   Aby pobierać dane od użytkownika z kondoli, należy utworzyć nowy obiekt klasy Scaner,
   a przy jej tworzeniu podać parametr: System.in    -->>  Scanner in = new Scanner(System.in);
   Do zadeklarowanej wcześniej zmiennej (ważny typ !!! zmiennej)
   wywołujemy na obiekcie typu Scanner odpowiednią metodę, np.:

         import java.util.Scanner;
         public Scanner in = new Scanner(System.in);

         byte bajt = in.nextByte();
         int  i = in.nextInt();
         double liczbaD = in.nextDouble();
         float liczbaF = in.nextFloat();
         String tekst = in.nextLine();

 */


public class Zadania_1_6_Slajd_42 {
    public static void main(String[] args) {

//      (*) do zadania 6.

//         Scanner in = new Scanner(System.in);
//
//         byte bajt = in.nextByte();
//         int  i = in.nextInt();
//         double liczbaD = in.nextDouble();
//         String tekst = in.nextLine();




        // Zad.1 slajd 42
        //  1. Napisz program, który wypisze na ekran konsoli,
        //     czy dana liczba całkowita znajduje się w przedziale 1-10, 11-100, 101-1000, 1001-10000,
        //     czy też może jest mniejsza od 0 lub większa od 10000.
        //     Parametrem wejściowym niech będzie zmienna zainicjowana na początku programu.


//        int liczba = -33333;
//        System.out.println("\nLiczba = "+ liczba);
//        if (liczba < 0) {
//            System.out.println("Liczba jest mniejsza od zera.");
//        } else {
//            if (liczba <=10) {
//                System.out.println("Liczba w przedziale <1,10>");
//            } else {
//                if (liczba <= 100) {
//                    System.out.println("Liczba w przedziale <11,100>");
//                } else {
//                    if (liczba <= 1000) {
//                        System.out.println("Liczba w przedziale <101,1000>");
//                    } else {
//                        if (liczba <= 10000) {
//                            System.out.println("Liczba w przedziale <1001,10000>");
//                        } else {
//                            System.out.println("Liczba większa, niż 10000.");
//                        }
//                    }
//                }
//            }
//        }

        // Zad.2 slajd 42
        // 2. Napisz program, który wypisze na ekran konsoli
        //    słowo oznaczające ocenę dla podanej cyfry.
        //    Np. dla 1 - "niedostateczny", 2 - "mierny" itp.
        //    Obsłuż przypadek gdy cyfra jest poza skalą ocen.

//    int ocena = 7;
//        System.out.print("\nStopień = "+ocena+" czyli ocena: ");
//        switch (ocena) {
//            case 1:
//                System.out.println("niedostateczny.");
//                break;
//            case 2:
//                System.out.println("dopuszczający.");
//                break;
//            case 3:
//                System.out.println("dostateczny.");
//                break;
//            case 4:
//                System.out.println("dobry.");
//                break;
//            case 5:
//                System.out.println("bardzo dobry.");
//                break;
//            case 6:
//                System.out.println("celujący.");
//                break;
//            default:
//                System.out.println("poza skalą ocen.");
//        };    // switch


        // Zad.3.
        // 3. Napisz program, który wypisze na ekran konsoli cyfrę arabską
        //    dla podanej liczby rzymskiej (od 1 do 9).
        //    Czyli np. dla 'I' wypisze 1, dla 'V' 5 itp.
        //    Obsłuż przypadek gdy podana liczba rzymska jest nieprawidłowa.

//        String roman = "IIV";       // łańcuch, który zawiera (lub nie) cyfrę rzymską
//        if ( !( roman.equals("0")       // gdy łańcuch nie jest jedną z cyfr rzymskich
//                || roman.equals("I")
//                || roman.equals("II")
//                || roman.equals("III")
//                || roman.equals("IV")
//                || roman.equals("V")
//                || roman.equals("VI")
//                || roman.equals("VII")
//                || roman.equals("VIII")
//                || roman.equals("IX") ))
//        {
//            System.out.println("\nTo nie jest cyfra rzymska z zakresu 0-IX.");
//        } else {
//            System.out.print("\nCyfra rzymska " + roman + " odpowiada cyfrze arabskiej ");
//            if (roman.equals("0")) System.out.println("0.");
//            if (roman.equals("I")) System.out.println("1.");
//            if (roman.equals("II")) System.out.println("2.");
//            if (roman.equals("III")) System.out.println("3.");
//            if (roman.equals("IV")) System.out.println("4.");
//            if (roman.equals("V")) System.out.println("5.");
//            if (roman.equals("VI")) System.out.println("6.");
//            if (roman.equals("VII")) System.out.println("7.");
//            if (roman.equals("VIII")) System.out.println("8.");
//            if (roman.equals("IX")) System.out.println("9.");
//        }


        //  Zad.4.
        // 4. Napisz program, który wypisze na ekran konsoli,
        //    czy podany kod Unicode jest liczbą (0-9), małą literą (a-z) czy też wielką literą (A-Z).
        //    Kody każdej z grup znaków następują po sobie,
        //    więc wystarczy znaleźć kod np. dla litery 'a' i 'z' i sprawdzić,
        //    czy podany kod zawiera się w tym przedziale.

//        int kod = 147;
//        System.out.println("\nKod Unicode "+kod+" odpowiada znakowi: "+(char)kod);
//        if ((kod>='0') && (kod<='9')) System.out.println("Jest cyfrą.");
//        if ((kod>='a') && (kod<='z')) System.out.println("Jest małą literą.");
//        if ((kod>='A') && (kod<='Z')) System.out.println("Jest WIELKĄ literą.");


        //  Zad.5.
        // 5. Napisz program, który dla podanej liczby wypisze na ekran konsoli dzień tygodnia
        //    (dla 1 - "poniedziałek", 2 - "wtorek" itp).
        //    Dodatkowo wyświetl, ile dni zostało do weekendu, dla poniedziałku - 5 dni, wtorku - 4 itp.

        int dni = 2;
        if ((5-dni)>0){
            System.out.println("\nDni do weekendu: "+(5-dni)+"");
        } else {
            System.out.println("\nHurrrraaa! WEEKEND!");
        }   // if
        switch(dni){
            case 1:
                System.out.println("Jest poniedziałek.");
                break;
            case 2:
                System.out.println("Jest wtorek.");
                break;
            case 3:
                System.out.println("Jest środa.");
                break;
            case 4:
                System.out.println("Jest czwartek.");
                break;
            case 5:
                System.out.println("Jest piątek.");
                break;
            case 6:
                System.out.println("Jest sobota.");
                break;
            case 7:
                System.out.println("Jest niedziela.");
                break;
            default:
                System.out.println("to nie jest numer dnia tygodnia");
        }   // switch

    }   // main
}   // class Zadania_1_6_Slajd_42

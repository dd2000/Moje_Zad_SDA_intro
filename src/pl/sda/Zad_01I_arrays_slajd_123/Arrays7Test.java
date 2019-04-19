package pl.sda.Zad_01I_arrays_slajd_123;
/*
7. Przerób każdą z poprzednich metod (poza nr 3) tak, żeby przyjmowała parametry jako varargs.
 */
public class Arrays7Test {
    public static void main(String[] args) {
        // test 1. varargs
        writeNames("Ala","Ola","Kasia","Basia","Jasia");

    }  // main()

    // 1. varargs
    public static void writeNames(String... names){
        System.out.println("Podano imiona: ");
        for (String name:
             names) {
            System.out.print(name+" ");
        }  // foreach
        System.out.println();
    }  // writeNames()

}  // class Arrays7Test

package pl.sda._1_pola_metody_statyczne.Zadania_1_3;

public class MMathTest {

    public static void main(String[] args) {
        double a=5.0;
        double b=4.0;
        double promien = 8.0;
        System.out.println("add:"+ MMath.add(a,b));
        System.out.println("substract:"+ MMath.substract(a,b));
        System.out.println("multiply:"+ MMath.multiply(a,b));
        System.out.println("divide:"+ MMath.divide(a,b));
        System.out.println("pow:"+ MMath.pow(a,b));
        System.out.println("min:"+ MMath.min(a,b));
        System.out.println("max:"+ MMath.max(a,b));
        System.out.println("Pole:"+ MMath.pole(promien));

/*      MMath mm = new MMath();  // nie da sie wykonać, bo klasa MMath jest abstract  */
        //MMath mm = new MMath();
    } // main
} // MMathTest

package pl.sda.Zad_01K_abstra_slajd146.abstra_5;

public class Food5Test {

    public static void main(String[] args) {
        System.out.println();
        Ham ham = new Ham("Szynka z pieca");
        Salad salad = new Salad("Sałatka warzywna");
        Carrot carrot = new Carrot("Bukiet marchewkowy");
        Chicken chicken = new Chicken("Złoty kurczak opiekany");
        System.out.println(salad.describe());
        System.out.println(ham.describe());
        System.out.println(carrot.describe());
        System.out.println(chicken.describe());
    } // main();
} // class Food6Test

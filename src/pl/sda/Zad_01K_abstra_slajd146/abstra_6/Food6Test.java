package pl.sda.Zad_01K_abstra_slajd146.abstra_6;
/*
dodano inne klasy i obiekty Food
dwiema metodami utworzono przepisy (Recipes)

 */
public class Food6Test {

    public static void main(String[] args) {
        System.out.println();
        Ham ham = new Ham("Szynka z pieca");
        Ham karkowka = new Ham("Karkówka pieczona");
        Ham becon = new Ham("Bekon smażony");
        Salad salad = new Salad("Sałatka warzywna");
        Carrot carrot = new Carrot("Bukiet marchewkowy");
        Chicken chicken = new Chicken("Złoty kurczak opiekany");
        Oil oil1 = new Oil("Olej kujawski");
        Oil oil2 = new Oil("Olej słonecznikowy");
        Oil oliwa = new Oil("Oliwa z oliwek");
        Fish tunczyk = new Fish("Tuńczyk oceaniczny");
        Fish dorsz = new Fish("Dorsz bałtycki");
        Fish losos = new Fish("Łosoś norweski ");
        Potato ziemniak = new Potato("Ziemniak gotowany");
        Potato frytki = new Potato("Frytki na oleju");

        // test: przykładowe opisy Food
        System.out.println(salad.describe());
        System.out.println(ham.describe());
        System.out.println(carrot.describe());
        System.out.println(chicken.describe());

        // przepisy/zestawy
        Recipe obiad1 = new Recipe("Zestaw obiadowy", karkowka,frytki,carrot,dorsz);
        System.out.println("\nDodaję sałatę do obiad1:");
        obiad1.addIngredientToRecipe(salad);
        System.out.println("\nWypisuję składniki obiad1:");
        obiad1.printIngredients();
        System.out.println("\nDrukuję opis obiad1:");
        obiad1.decribe();
    } // main();
} // class Food6Test

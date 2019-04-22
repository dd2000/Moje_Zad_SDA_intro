package pl.sda.Zad_01K_abstra_slajd146.abstra_5;

/*
1. Utwórz klasę abstrakcyjną o nazwie Food i dodaj do niej metodę abstrakcyjną getTaste(),
   która zwraca String z opisem smaku jedzenia Dodaj klasy: Chicken, Ham, Carrot, Salad
   rozszerzające klasę Food oraz zaimplementuj w każdej z nich wymaganą metodę.
3. Dodaj do klasy Food metodę abstrakcyjną getType(),
   która zwróci rodzaj jedzenia w postaci enuma (utwórz enum np.: FoodType).
   W klasach Meat i Vegetable zaimplementuj nową metodę.
4. W klasie Food dodaj pole name i zwykłą metodę (gettera) do pobierania nazwy.
   Stwórz konstruktor, który będzie ustawiał pole name.
   Stwórz odpowiednie konstruktory w klasach pochodnych.
                 Food
              /       \
           Meat       Vegetable
          /    \      /       \
      Chicken  Ham   Carrot   Salad

5. W klasie Food dodaj metodę describe(), która wypisze na ekran informacje o nazwie, typie i smaku jedzenia.
   Sprawdź swój kod, stwórz po jednym obiekcie z każdej klasy: Chicken, Ham, Carrot, Salad
   i wyświetl na ekran ich opis.
 */
public abstract class Food {

    private String name;

    // konstruktor
    public Food(String name) {
        this.name = name;
    } // konstruktor


    // metody abstrakcyjne - bez ciała/implementacji
    public abstract String getTaste();
    public abstract FoodType getType();


    public String describe() { // - met. zwraca opis - również z klas potomnych
        return "Nazwa:"+this.getName()+" typ:"+this.getType()+" smak:"+this.getTaste();
    } // describe

    // getter
    public String getName() {
        return name;
    } // getName();


} // class Food

package pl.sda.Zad_01K_abstra_slajd146.abstra_678;
/*
6. (*) Stwórz klasę Recipe ['przepis'], która zawierać będzie
   nazwę i spis składników ['ingredients'] (obiektów klasy Food).

   a) Dodaj konstruktor który ustawi nazwę przepisu i wszystkie składniki(jako varargs)
   b) i drugi, który ustawi nazwę przepisu i ilość składników (jako liczbę).

   c) Dodaj metodę do dodawania składników do listy.
 */

// ---------------
public class Recipe {
    private String name;
    private Food[] ingredients;

    // a) konstruktor z listą varargs: ustawia nazwę przepisu i varargs ->listę składników
    public Recipe(String name, Food... ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    } // konstruktor1

    // b) konstruktor z liczbą składników w tablicy listy składników
    public Recipe(String name, int ingredientsCount) {
        this.name = name;
        this.ingredients = new Food[ingredientsCount];
    } // konstruktor2


    // c) metoda dodaje składnik do listy(tablicy) składników w przepisie,
    // gdy w tablicy składników jest miejsce na kolejny składnik
    public Recipe addIngredientToRecipe(Food ingredient){
        // sprawdź rozmiar tablicy składników
        int size = ingredients.length;
        int nextIndex = -1; // następny wolny index tablicy
        for(int i=0; i<size; i++){
            if (ingredients[i]==null){  // i-ty element jest wolny
                nextIndex = i;
                break;
            } // if
        } // for
        if (nextIndex == -1) {
            System.out.println("\nLista składników pełna, nie można dodać składnika do listy.\n");
        } else {
            ingredients[nextIndex] = ingredient;
        }
        return this;
    } // addIngredientToRecipe()

    //getter
    public Food[] getIngredients() {
        return ingredients;
    }

    // metoda wypisuje składniki przepisu
    public void printIngredients() {
        System.out.println("\nIngredients(składniki) w "+name+" to: ");
        for (Food ingredient : getIngredients()) {
            System.out.print(ingredient.getName() + ", ");
        }
        System.out.println();
    } //printIngredients()

    // metoda wyświetla opis składników przepisu
    public void decribe() {
        System.out.println("\nDescripion (opis) składników przepisu: "+name+":\n");
        for (Food ingredient : getIngredients()) {
            System.out.println(ingredient.describe());
        }
    } // decribe()

} // class Recipe

package pl.sda.Zad_01K_abstra_slajd146.abstra_678;

public enum FoodType {
    MEAT("typ mięsny"),
    FISH("typ rybny"),
    VEGETABLE("typ wegetariański");


    private String type;

    // konstruktor
    FoodType(String type) {
        this.type = type;
    } // konstruktor enum-ów

} // enum FoodType

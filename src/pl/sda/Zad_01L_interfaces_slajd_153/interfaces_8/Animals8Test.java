package pl.sda.Zad_01L_interfaces_slajd_153.interfaces_8;
/*
8. Stwórz obiekty dla każdego zwierzęcia i wyświetl informacje o nich (nazwę, wiek, mowę, czy żyją?)
 */
public class Animals8Test {
    public static void main(String[] args) {
        Insects insect = new Insects("osa",1,true);
        System.out.println(insect.getName()+" "+insect.getAge()
                           +" (lat), czy żyje? "+insect.isAlive()+", wydaje dźwięk: "+insect.getSpeak());
        Fishes fish = new Fishes("węgorz",12);
        System.out.println(fish.getName()+" "+fish.getAge()
                +" (lat), czy żyje? "+fish.isAlive()+", wydaje dźwięk: "+fish.getSpeak());
        Birds bird = new Birds("słowik",15,true);
        System.out.println(bird.getName()+" "+bird.getAge()
                +" (lat), czy żyje? "+bird.isAlive()+", wydaje dźwięk: "+bird.getSpeak());
        Reptiles reptile1 = new Reptiles("żmija",6);
        System.out.println(reptile1.getName()+" "+reptile1.getAge()
                +" (lat), czy żyje? "+reptile1.isAlive()+", wydaje dźwięk: "+reptile1.getSpeak());
        Reptiles dino = new Reptiles("dinozaur",1000000);
        System.out.println(dino.getName()+" "+dino.getAge()
                +" (lat), czy żyje? "+dino.isAlive()+", wydaje dźwięk: "+dino.getSpeak());
        Mammals ssak1 = new Mammals("krowa", 5,"muuu....muuu...muuu...!");
        System.out.println(ssak1.getName()+" "+ssak1.getAge()
                +" (lat), czy żyje? "+ssak1.isAlive()+", wydaje dźwięk: "+ssak1.getSpeak());

    } // main();
} // class Animals8Test

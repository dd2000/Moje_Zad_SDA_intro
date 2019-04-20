package pl.sda.Zad_01I_arrays_slajd_123;

import java.io.IOException;
import java.util.Scanner;

/*
9. (*) Napisz klasę, która pozwala tworzyć mapę gry w statki dla pojedynczego użytkownika.
   Mapa powinna być tworzona na bazie dwuwymiarowej tablicy.
   Zadbaj o metody pozwalające tworzyć statki na mapie,
   a sam konstruktor klasy powinien pozwalać na utworzenie planszy o zadanych wymiarach.
   Utwórz także przykład użycia.
 */
public class Arrays9Test {

 //   private static Object InterruptedException;

    static void cls(){
        try
        {
            new ProcessBuilder("cmd", " /c ", "cls").inheritIO().start().waitFor();
            //for (int i =0;i<25;i++) System.out.println();
        }
        catch( Exception e)
        {
            System.out.print(e);
        }
    } // cls();

// ---------------
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("enter");
        String stin = in.nextLine();

        cls();// System.console();

        plansza();
        //Runtime.getRuntime().exec("cmd /? cls");

    } // main();

// --------------------
    public static void plansza(){
        cls();   // \u9580 to trafiony punkt czyli X

        System.out.println();
        System.out.println("    "+" 1 "+" "+" 2 "+" "+" 3 "+" "+" 4 "+" "+" 5 "+" "+" 6 "+" "+" 7 "+" "+" 8 "+" "+" 9 "+" "+" 10");
        // znaki ramek dla UTF-8
        System.out.println("   "+"╔"+"═══"+((char) 9572)+"═══"+((char) 9572)+"═══"+((char) 9572)+"═══"+((char) 9572)+"═══"+((char) 9572)+"═══"+((char) 9572)+"═══"+((char) 9572)+"═══"+((char) 9572)+"═══"+((char) 9572)+"═══"+((char) 9559));
        System.out.println(" A "+((char) 9553)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9553)+" A"  );
        System.out.println("   "+((char) 9567)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9553)  );
        System.out.println(" B "+((char) 9553)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9553)+" B"  );
        System.out.println("   "+((char) 9567)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9553)  );
        System.out.println(" C "+((char) 9553)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9553)+" C"  );
        System.out.println("   "+((char) 9567)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9553)  );
        System.out.println(" D "+((char) 9553)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9553)+" D"  );
        System.out.println("   "+((char) 9567)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9553)  );
        System.out.println(" E "+((char) 9553)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9553)+" E"  );
        System.out.println("   "+((char) 9567)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9553)  );
        System.out.println(" F "+((char) 9553)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9553)+" F"  );
        System.out.println("   "+((char) 9567)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9553)  );
        System.out.println(" G "+((char) 9553)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9553)+" G"  );
        System.out.println("   "+((char) 9567)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9553)  );
        System.out.println(" H "+((char) 9553)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9553)+" H"  );
        System.out.println("   "+((char) 9567)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9553)  );
        System.out.println(" I "+((char) 9553)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9553)+" I"  );
        System.out.println("   "+((char) 9567)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9532)+"---"+((char) 9553)  );
        System.out.println(" J "+((char) 9553)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9474)+"   "+((char) 9553)+" J"  );
        System.out.println("   "+((char) 9562) +"═══"+ ((char) 9575)+"═══"+((char) 9575)+"═══"+((char) 9575)+"═══"+((char) 9575)+"═══"+((char) 9575)+"═══"+((char) 9575)+"═══"+((char) 9575)+"═══"+((char) 9575)+"═══"+((char) 9575)+"═══"+((char) 9565)  );
        System.out.println("    "+" 1 "+" "+" 2 "+" "+" 3 "+" "+" 4 "+" "+" 5 "+" "+" 6 "+" "+" 7 "+" "+" 8 "+" "+" 9 "+" "+" 10");

    }  // plansza

} // class  Array9Test

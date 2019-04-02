package pl.sda.Zad_1A_DataTypes_slajd34;
/*
Program zmiene - slajd 34
Zadanie 8.

8. W osobnej klasie ComputerPrice2, w metodzie main() napisz program
   obliczający cenę komputera na podstawie jego części.
   Program ma wypisać na konsolę osobno cenę samego komputera:
   płyta główna, procesor, pamięć RAM, dysk twardy
   i osobno cenę komputera i monitora.
   W cenie należy uwzględnić podatek VAT = 23%.
 */
public class ComputerPrice {
    public static void main(String[] args) {
      double cenaNettoMB = 355;
      double cenaNettoCPU = 1199;
      double cenaNettoRAM = 799;
      double cenaNettoHDD = 299;
      double cenaNettoCase = 199;
      double cenaNettoMonitor = 599;
      double podatekVAT = 0.23;
      double cenaNetto, cenaBrutto;
      cenaNetto=cenaNettoCase + cenaNettoCPU + cenaNettoHDD + cenaNettoMB + cenaNettoRAM;
      System.out.println("Cena netto komputera (bez monitora): "+cenaNetto);
      System.out.println("Cena brutto komputera (bez monitora): "+ (cenaNetto+cenaNetto*podatekVAT));
      System.out.println("Cena brutto komputera z monitorem: "+ (cenaNetto+cenaNettoMonitor+(cenaNetto+cenaNettoMonitor)*podatekVAT));
    }   // main
}  // class ComputerPrice2

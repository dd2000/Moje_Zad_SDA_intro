package pl.sda.Zad_1D_OOP2_slajd71;
/*

          Program zmiene - slajd 34 -->> zrobione w pakiecie Zad_1A_DataTypes
          Zadanie 8.
          8. W osobnej klasie ComputerPrice2, w metodzie main() napisz program
             obliczający cenę komputera na podstawie jego części.
             Program ma wypisać na konsolę osobno cenę samego komputera:
             płyta główna, procesor, pamięć RAM, dysk twardy
             i osobno cenę komputera i monitora.
             W cenie należy uwzględnić podatek VAT = 23%.

Zadanie 2. slajd72
2. Przenieś kod zapisany w metodach main() klas FahrenheitConverter2Test i ComputerPrice2
   do osobnych metod, np.: convertToCelsius(double temperatureInFahrenheit), getComputerPrice()

 */
public class ComputerPrice2 {
      private double cenaNettoMB;
      private double cenaNettoCPU;
      private double cenaNettoRAM;
      private double cenaNettoHDD;
      private double cenaNettoCase;
      private double cenaNettoMonitor;
      private double podatekVAT;

      // konstruktor
      public ComputerPrice2(double cenaNettoMB,
                          double cenaNettoCPU,
                          double cenaNettoRAM,
                          double cenaNettoHDD,
                          double cenaNettoCase,
                          double cenaNettoMonitor,
                          double podatekVAT) {
        this.cenaNettoMB = cenaNettoMB;
        this.cenaNettoCPU = cenaNettoCPU;
        this.cenaNettoRAM = cenaNettoRAM;
        this.cenaNettoHDD = cenaNettoHDD;
        this.cenaNettoCase = cenaNettoCase;
        this.cenaNettoMonitor = cenaNettoMonitor;
        this.podatekVAT = podatekVAT;
    }

    public void getComputerPrice(){ // oblicza i wyświetla ceny komputera
          double cenaNetto;
          cenaNetto=cenaNettoCase + cenaNettoCPU + cenaNettoHDD + cenaNettoMB + cenaNettoRAM;
          System.out.println("Cena netto komputera (bez monitora): "+cenaNetto);
          System.out.println("Cena brutto komputera (bez monitora): "+ (cenaNetto+cenaNetto*this.podatekVAT));
          System.out.println("Cena brutto komputera z monitorem: "+ (cenaNetto+this.cenaNettoMonitor+(cenaNetto+this.cenaNettoMonitor)*this.podatekVAT));
      } // getComputerPrice()


}  // class ComputerPrice2

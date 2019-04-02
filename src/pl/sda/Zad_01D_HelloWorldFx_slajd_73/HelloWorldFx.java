package pl.sda.Zad_01D_HelloWorldFx_slajd_73;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;

import static java.awt.Color.CYAN;
import static java.awt.Color.cyan;

/*
1. Zmodyfikuj klasę HelloWorldFx:
    a. Zmień tekst przycisku
    b. Zmień tekst dla obiektu typu Label
2. Dodaj do klasy HelloWorldFx kontrolki typu:
    a. TextField
    b. Button
    c. Label
3. * Spraw by po kliknięciu przycisku dodanego w pkt. 2b
    tekst wpisany do kontrolki typu TextField został skopiowany do kontrolki typu Label.
*/
public class HelloWorldFx extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //oryginal
        Label label = new Label("Label: Witaj w świecie JavaFX!");  // etykieta (tekst) wewnątrz okna

        // 2c) utworzenie kontrolki Label2 - dodanie w wierszu: box.getChildren().addAll(label, label2, button);
        Label label2 = new Label("Label2: Stworzyłeś sam tę kontrolkę LABEL!");  // etykieta (tekst) wewnątrz okna


        //oryginal
        Button button = new Button("Kliknij mnie!");
        button.setOnAction(e -> System.out.println("Button1 was clicked!"));

        // 2b) utworzenie kolejnego przycisku: button2; dodanie w wierszu: box.getChildren().addAll(label, button2,label2, button);
        Button button2 = new Button("Kliknij button2!");
        button2.setOnMousePressed(evnt -> System.out.println("Dziękuję! - button2")); // setOnAction(e -> System.out.println("Button2 kliknięty!"));

        // 2a) utworzenie kontrolki TextField; dodanie w wierszu: box.getChildren().addAll(lista kontrolek...)
        TextField poleTekstowe = new TextField("Ala ma kota."); // to pole tekstowe ma szerokość całego okna
        //poleTekstowe.Color.cyan --> java.awt.Color.cyan [AWT] --> nie jest kompatybilne z SwingFX
        // Jak zmienić kolor tła pola tekstowego? Skomplikowane?  ...setBackground(???)
        System.out.println("\nTekst pola tekstowego: "+poleTekstowe.getText()+"\n");

        // 3. łączenie ewentów kontrolek: Spraw by po kliknięciu przycisku dodanego w pkt. 2b (button2)
        //    tekst wpisany do kontrolki typu TextField został skopiowany do kontrolki typu Label (label2).
        button2.setOnAction(e -> label2.setText("Label 2: \n"+poleTekstowe.getText()));


        //oryginal
        //  --------------- tworzenie okna głównego programu --------------------
        VBox box = new VBox();
        box.setAlignment(Pos.CENTER);
        box.getChildren().addAll(label, button, label2, button2, poleTekstowe); //kolejność wyświetlania/ułożenia kontrolek

        primaryStage.setTitle("Hello World - Mój JavaFX");  // tekst - pasek tytułowy okna
        primaryStage.setScene(new Scene(box, 400, 200)); // szerokość i wysokość okna
        primaryStage.show();
    }
}

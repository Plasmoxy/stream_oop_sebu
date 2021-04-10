package app;

import controller.AplikaciaController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.*;
import view.AplikaciaView;

import java.util.ArrayList;
import java.util.Date;

public class Aplikacia extends Application {

    public AplikaciaView aview;
    public AplikaciaController acontroler;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Databaza.load();

        aview = new AplikaciaView();
        acontroler = new AplikaciaController(aview);

        primaryStage.setWidth(900);
        primaryStage.setHeight(600);
        primaryStage.setTitle("stream");
        primaryStage.setScene(aview.getScene());
        primaryStage.show();
    }

    public static void main(String[] args) {

        launch(args); // nakopni javafx appku

        /*
        Zapalky z = new Zapalky("CBA");
        Jablko j = new Jablko("3.4");
        z.vypisMeno();
        j.vypisMeno();
        j.spadniZoStromu();

        String jablkoveMeno = j.getMeno();
        System.out.println(jablkoveMeno);
         */

        /*
        Produkt p1 = new Zapalky("CBA");
        Produkt p2 = new Jablko("3.4");
        Produkt[] produkty = {p1, p2};
        */
        // alt: Produkt[] produkty = {new Zapalky("CBA"), new Jablko("3.4")};


        /* // poly:
        Zapalky z = new Zapalky("CBA");
        Jablko j = new Jablko("3.4");

        ArrayList<Produkt> produkty = new ArrayList<>();
        produkty.add(z);
        produkty.add(j);
        produkty.add(new Saris());

        for (Produkt p : produkty) {
            p.getName();
        }

        Named[] pomenovane = {z, j, new Saris()};
        for (Named n : pomenovane) {
            System.out.println("Meno : " + n.getName());
        }
        */


        /*
        Nakup n = new Nakup();
        n.getProdukty().add(new Saris());
        n.getProdukty().add(new Zapalky("PIPE"));

        Databaza.getInstance().nakupy.add(n);
        Databaza.getInstance().vypisNakupy();
         */

    }
}

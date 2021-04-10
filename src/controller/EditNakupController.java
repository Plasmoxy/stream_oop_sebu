package controller;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import model.*;
import view.EditNakupView;

import java.util.stream.Collectors;

public class EditNakupController {

    EditNakupView view;
    Nakup edited;

    public EditNakupController(EditNakupView v, Nakup edited) {
        view = v;
        this.edited = edited;

        view.pridajSaris.setOnAction(e -> {
            edited.getProdukty().add(new Saris());
            refreshProdukty();
        });

        view.pridajZapalky.setOnAction(e -> {
            edited.getProdukty().add(new Zapalky("CBA"));
            refreshProdukty();
        });

        refreshProdukty();
    }

    public void refreshProdukty() {

        // alternativa konverzie z Product -> Node
        // cez java 8 streamy

        view.produktyBox.getChildren().setAll(
                edited.getProdukty().stream().map(produkt -> {
                    HBox produktBox = new HBox();

                    // text produktu
                    produktBox.getChildren().add(new Text(produkt.getName()));

                    // delete
                    Button del = new Button("X");
                    produktBox.getChildren().add(del);
                    del.setOnAction(e -> {
                        edited.getProdukty().remove(produkt);
                        refreshProdukty();
                    });

                    return produktBox;
                }).collect(Collectors.toList())
        );

        double sum = 0;
        for (Produkt p : edited.getProdukty()) {
            sum += p.getCena();
        }

        view.cena.setText("Cena : " + Double.toString(sum) + " + €");



    }

}

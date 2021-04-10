package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Databaza;
import model.Nakup;
import model.Saris;
import view.AplikaciaView;
import view.EditNakupView;

import java.util.ArrayList;

public class AplikaciaController {

    AplikaciaView view;

    public AplikaciaController(AplikaciaView view) {
        this.view = view;

        // nastav refresh button, nech zobrazi nakupy odznova
        view.refresh.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                refreshNakupy();
            }
        });

        view.novyNakupBtn.setOnAction((actionEvent) -> {
            Nakup demo = new Nakup();
            demo.getProdukty().add(new Saris());

            Databaza.getInstance().nakupy.add(demo);
            refreshNakupy();
        });

        refreshNakupy();
    }

    public void refreshNakupy() {
        ArrayList<Nakup> nakupy = Databaza.getInstance().nakupy;
        ArrayList<Node> nodes = new ArrayList<>();

        for (Nakup n : nakupy) {
            // text
            Text t = new Text(n.getVypis());
            nodes.add(t);

            // delet button
            Button b = new Button("X");
            nodes.add(b);
            b.setOnAction(e -> {
                Databaza.getInstance().nakupy.remove(n);
                refreshNakupy();
            });

            // edit btn
            Button editb = new Button("Edit");
            nodes.add(editb);
            editb.setOnAction(e -> {

                // nove okno pre edit nakupu
                Stage stage = new Stage();
                EditNakupView view = new EditNakupView();
                EditNakupController ctrl = new EditNakupController(view, n);
                stage.setTitle("Editujem nakup - " + n.getVypis());
                stage.setWidth(600);
                stage.setHeight(600);
                stage.setScene(view.getScene());
                stage.show();

            });

        }

        view.boxSNakupmi.getChildren().setAll(nodes);

        // toto by trebalo robit cez observer
        Databaza.save();
    }

}

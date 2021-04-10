package view;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class EditNakupView {

    private Scene sc;
    private VBox box;
    private Text titulok;
    public VBox produktyBox;
    public Text cena;

    public Button pridajSaris = new Button("Add Saris");
    public Button pridajZapalky = new Button("Add Zapalky");


    public EditNakupView() {
        ScrollPane pane = new ScrollPane();
        box = new VBox();
        box.setSpacing(20);
        pane.setContent(box);

        titulok = new Text("");
        box.getChildren().add(titulok);

        box.getChildren().add(pridajSaris);
        box.getChildren().add(pridajZapalky);

        box.getChildren().add(new Text("Produkty: "));
        produktyBox = new VBox();
        box.getChildren().add(produktyBox);

        cena = new Text("Cena : 0€");
        box.getChildren().add(cena);

        sc = new Scene(pane);
    }

    public Scene getScene() {
        return sc;
    }

    public void setNazov(String nazov) {
        titulok.setText("Editovat nakup - " + nazov);
    }

}

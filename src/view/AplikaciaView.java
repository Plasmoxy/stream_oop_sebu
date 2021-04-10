package view;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class AplikaciaView {

    public ScrollPane pane;
    public VBox box;
    public Button novyNakupBtn;
    public Scene scene;
    public VBox boxSNakupmi;
    public Button refresh;

    public AplikaciaView() {
        pane = new ScrollPane();
        box = new VBox();
        box.setSpacing(10);
        pane.setContent(box);

        refresh = new Button("Refresh");
        box.getChildren().add(refresh);

        box.getChildren().add(new Text("VITAJCE U NAS!"));
        box.getChildren().add(new Text("Novy nakup: "));

        novyNakupBtn = new Button("Novy nakup");
        box.getChildren().add(novyNakupBtn);

        box.getChildren().add(new Text("nakupy: "));
        boxSNakupmi = new VBox();
        box.getChildren().add(boxSNakupmi);

        // scena
        scene = new Scene(pane);
    }

    public Scene getScene() {
        return scene;
    }

}

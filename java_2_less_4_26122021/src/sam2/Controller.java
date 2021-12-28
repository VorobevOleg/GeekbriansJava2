package sam2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

import java.util.Random;

public class Controller {
    Random random = new Random();
    @FXML
    public VBox vbox;

    @FXML
    public void clickAddBtn(ActionEvent actionEvent) {
        int x = random.nextInt(100);
        Button button = new Button("btn # "+ x);
        button.setOnAction(event -> {
            System.out.println(x);
        });

        vbox.getChildren().add(button);
    }
}

package sam1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Controller {

    @FXML
    public Button btn1;
    @FXML
    public Slider slider;
    @FXML
    public Label label;

    @FXML
    public void clickClose(ActionEvent actionEvent) {
        Platform.runLater(() -> {
            Stage stage = (Stage) btn1.getScene().getWindow();
            stage.setTitle("buy...");
            stage.close();
        });
    }

    @FXML
    public void onMouseReleased(MouseEvent mouseEvent) {
        label.setText(String.format("slider: %.2f", slider.getValue()));
    }
}

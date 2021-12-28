package sam3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public TextField textField;
    @FXML
    public TextArea textArea;

    @FXML
    public void clickBtn1(ActionEvent actionEvent) {
        System.out.println("hello");
    }

    @FXML
    public void clickBtnSendText(ActionEvent actionEvent) {
        textArea.appendText(textField.getText() + "\n");
        textField.clear();
        textField.requestFocus();
    }
}

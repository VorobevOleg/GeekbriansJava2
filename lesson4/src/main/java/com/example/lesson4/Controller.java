package com.example.lesson4;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    public TextArea mainTextArea;
    public TextField mainTextField;

    @FXML
    protected void onSendButtonClick() {
        mainTextArea.appendText(mainTextField.getText() + "\n");
        mainTextField.setText("");
    }
}
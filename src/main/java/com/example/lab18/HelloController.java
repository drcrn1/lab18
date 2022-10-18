package com.example.lab18;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class HelloController {
    @FXML
    TextArea text;

    @FXML
    TextField message;

    @FXML
    Button button;

    @FXML
    public void buttonClick(){
        String f = message.getText();
        text.setText("Your message: " + f + "\n");
        message.setText("");
        message.requestFocus();
    }

}
package org.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField nameField;

    @FXML
    protected void onHelloButtonClick(ActionEvent e) {
        System.out.println("Hello, " + nameField.getText());
        System.out.println("Button pressed: " + e.getSource());
    }
}
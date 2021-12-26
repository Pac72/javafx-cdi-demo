package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

import javax.inject.Inject;

public class MainController {

    @Inject
    private RandomService randomService;

    @FXML
    private Text message;

    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) {
        message.setText(String.valueOf(randomService.nextInt()));
    }
}

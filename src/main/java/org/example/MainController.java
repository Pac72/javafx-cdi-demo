package org.example;

import jakarta.inject.Inject;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

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

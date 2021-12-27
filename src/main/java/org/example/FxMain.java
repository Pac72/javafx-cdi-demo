package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.inject.Inject;
import java.io.IOException;
import java.io.InputStream;

public class FxMain {

    @Inject
    private FXMLLoader fxmlLoader;

    public void start(Stage stage, Application.Parameters parameters) throws IOException {
        try (InputStream fxml = MainController.class.getResourceAsStream("/ui.fxml")) {
            Parent root = fxmlLoader.load(fxml);
            stage.setScene(new Scene(root));
            stage.show();
        }
    }
}

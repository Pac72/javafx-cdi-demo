package org.example;

import javafx.application.Application;
import javafx.stage.Stage;
import org.jboss.weld.environment.se.Weld;
import java.io.IOException;

public class MainApp extends Application {

    private Weld weld;

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void init() {
        weld = new Weld();
    }

    @Override
    public void start( Stage stage ) throws IOException {
        weld.initialize().select(FxMain.class).get().start(stage, getParameters());
    }

    @Override
    public void stop() {
        weld.shutdown();
    }
}

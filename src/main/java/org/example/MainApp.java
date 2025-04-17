package org.example;

import jakarta.enterprise.inject.spi.Bean;
import jakarta.enterprise.inject.spi.BeanManager;
import javafx.application.Application;
import javafx.stage.Stage;
import org.apache.webbeans.config.WebBeansContext;
import org.apache.webbeans.spi.ContainerLifecycle;
import java.io.IOException;

public class MainApp extends Application {

    private final ContainerLifecycle lifecycle;

    public MainApp() {
        lifecycle = WebBeansContext.getInstance().getService(ContainerLifecycle.class);
    }

    public static void main(String[] args) {
        MainApp mainApp = new MainApp();
        mainApp.go(args);
    }

    public void go(String[] args) {
        Application.launch(args);
    }

    @Override
    public void init() {
        lifecycle.startApplication(null);
    }

    @Override
    public void start( Stage stage ) throws IOException {
        final BeanManager beanManager = lifecycle.getBeanManager();
        final Bean<?> bean = beanManager.getBeans("FxMain").iterator().next();
        final FxMain fxMain = (FxMain) beanManager.getReference(bean, FxMain.class, beanManager.createCreationalContext(bean));
        fxMain.start(stage, getParameters());
    }

    @Override
    public void stop() {
        lifecycle.stopApplication(null);
    }
}

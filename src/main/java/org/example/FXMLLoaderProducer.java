package org.example;

import jakarta.enterprise.inject.Instance;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import javafx.fxml.FXMLLoader;
import javafx.util.Callback;

import java.nio.charset.StandardCharsets;

public class FXMLLoaderProducer {
    @Inject
    Instance<Object> instance;

    @Produces
    public FXMLLoader createLoader() {
        return new FXMLLoader(null, null, null, new Callback<Class<?>, Object>() {
            @Override public Object call(Class<?> param) {
                return instance.select(param).get();
            }
        }, StandardCharsets.UTF_8);
    }
}

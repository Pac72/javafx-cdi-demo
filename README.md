# javafx-cdi-demo revamped

Original Jboss Weld CDI replaced with OpenWebBeans.

## Requirements

Java 21+  
Maven

## Compile

    mvn clean install

## Run

    java --module-path target/lib --add-modules javafx.controls,javafx.fxml target/javafx-cdi-demo-1.0-SNAPSHOT.jar org.example.Main

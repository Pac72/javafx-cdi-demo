# javafx-cdi-demo revamped

Original Jboss Weld CDI replaced with OpenWebBeans.

## Requirements

Java 21+  
Maven

## Compile

From project root directory, launch:

    mvn clean install

## Run

From project root directory, launch:

    java --module-path target/lib --add-modules javafx.controls,javafx.fxml -cp target/javafx-cdi-demo-1.0-SNAPSHOT.jar:target/lib/* org.example.Main

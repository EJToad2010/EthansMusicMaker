package com.jung.ethansmusicmaker;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        // Create a Start button that prints a debug message when clicked
        Button btn = new Button("Start");

        btn.setOnAction(e -> {
            System.out.println("Clicked");
        });

        VBox root = new VBox(10);
        root.getChildren().add(btn);

        // Draw the button at the center of the screen
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(btn);

        // Create the scene (window) for the application
        Scene scene = new Scene(stackPane, 1280, 720);

        stage.setTitle("Ethan's Music Maker");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
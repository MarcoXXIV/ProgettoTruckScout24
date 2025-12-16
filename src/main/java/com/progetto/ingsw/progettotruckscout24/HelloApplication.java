package com.progetto.ingsw.progettotruckscout24;

import com.progetto.ingsw.progettotruckscout24.View.SceneHandler;
import javafx.application.Application;

import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        SceneHandler sceneHandler = SceneHandler.getInstance();
        sceneHandler.init(stage);
    }

    public static void main(String[] args) {
        launch();
    }
}
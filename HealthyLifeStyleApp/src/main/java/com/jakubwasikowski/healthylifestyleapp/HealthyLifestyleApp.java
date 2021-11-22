package com.jakubwasikowski.healthylifestyleapp;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.util.Objects;

public class HealthyLifestyleApp extends Application {

    //Overriden start method used to start application with suitable properties, called after init method had returned and there is no problem with DB connection
    @Override
    public void start(Stage stage) {
        //Try-Catch block used in case of problem with loading an application
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("HealthyLifestyleApp.fxml")));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            //Stage style used not to show upper bar
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Overriden init method to protect application from lack of connection with database. App will automatically close when there will be problem with DB
    @Override
    public void init() throws Exception {
        super.init();
        if (!DataBaseConnection.getInstance().open()) {
            System.out.println("Problem with connection to the database");
            Platform.exit();
        }
    }

    // Overriden stop method to close connection with database while stopping an application
    @Override
    public void stop() throws Exception {
        super.stop();
        DataBaseConnection.getInstance().close();
    }

    public static void main(String[] args) {
        launch();
    }
}
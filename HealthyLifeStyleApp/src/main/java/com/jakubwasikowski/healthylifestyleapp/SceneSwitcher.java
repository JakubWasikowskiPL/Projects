package com.jakubwasikowski.healthylifestyleapp;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.net.URL;


public class SceneSwitcher {

    //Method used to switch scenes taking as arguments current pane and url to the wanted tab
    public static void switchScene(StackPane pane, URL urlName) {
        //Try-Catch block used in case of any unexpected exception
        try {
            Parent root = FXMLLoader.load(urlName);
            Stage currentStage = (Stage) pane.getScene().getWindow();
            currentStage.getScene().setRoot(root);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

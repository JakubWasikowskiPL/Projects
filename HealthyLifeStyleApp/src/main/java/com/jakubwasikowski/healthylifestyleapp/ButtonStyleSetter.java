package com.jakubwasikowski.healthylifestyleapp;

import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;

//Class used to set styles for hovered and exited elements
final class ButtonStyleSetter {

    //Button style setter for hovering and exiting
    public static void onHover(Button button) {
        button.setStyle("-fx-background-color: #377ce8;");
    }

    public static void onExit(Button button) {
        button.setStyle("-fx-background-color: #222831;");
    }

    //Button bar style setter for hovering and exiting
    public static void onHover(ButtonBar buttonBar) {
        buttonBar.setStyle("-fx-background-color: #377ce8;");
    }

    public static void onExit(ButtonBar buttonBar) {
        buttonBar.setStyle("-fx-background-color: white;");
    }
}

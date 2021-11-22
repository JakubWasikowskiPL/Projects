package com.jakubwasikowski.healthylifestyleapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class HealthyLifestyleAppController {

    //ELEMENTS OF THE GUI USED FOR ACTION
    @FXML
    private StackPane stackPaneMain;

    @FXML
    private Button btnBMI;

    @FXML
    private Button btnDiet;

    @FXML
    private Button btnTraining;

    @FXML
    private Button btnExit;

    @FXML
    private Button btnCalories;


    //METHODS
    //USED TO MOVE BETWEEN TABS
    //Method used to move to BMI tab
    @FXML
    void onMouseClicked_btnBMI() {
        SceneSwitcher.switchScene(stackPaneMain,getClass().getResource("BMICalculatorScreen.fxml"));
    }
    //Method used to move to Calories tab
    @FXML
    void onMouseClicked_btnCalories() {
        SceneSwitcher.switchScene(stackPaneMain,getClass().getResource("CaloriesCalculatorScreen.fxml"));
    }
    //Method used to move to Diet tab
    @FXML
    void onMouseClicked_btnDiet() {
        SceneSwitcher.switchScene(stackPaneMain,getClass().getResource("DietScreen.fxml"));
    }
    //Method used to move to exit an application
    @FXML
    void onMouseClicked_btnExit() {
            System.exit(0);
    }

    //Method used to move to Training tab
    @FXML
    void onMouseClicked_btnTraining() {
    }


    //USED TO SET STYLE OF THE BUTTONS AFTER HOVERING AND EXITING
    //On hover methods
    @FXML
    void onMouseEntered_btnBMI() {
        ButtonStyleSetter.onHover(btnBMI);
    }

    @FXML
    void onMouseEntered_btnCalories() {
        ButtonStyleSetter.onHover(btnCalories);
    }

    @FXML
    void onMouseEntered_btnDiet() {
        ButtonStyleSetter.onHover(btnDiet);
    }

    @FXML
    void onMouseEntered_btnExit() {
        ButtonStyleSetter.onHover(btnExit);
    }

    @FXML
    void onMouseEntered_btnTraining() {
        ButtonStyleSetter.onHover(btnTraining);
    }

    //On exit methods
    @FXML
    void onMouseExited_btnBMI() {
        ButtonStyleSetter.onExit(btnBMI);
    }

    @FXML
    void onMouseExited_btnDiet() {
        ButtonStyleSetter.onExit(btnDiet);
    }

    @FXML
    void onMouseExited_btnCalories() {
        ButtonStyleSetter.onExit(btnCalories);
    }

    @FXML
    void onMouseExited_btnExit() {
        ButtonStyleSetter.onExit(btnExit);
    }

    @FXML
    void onMouseExited_btnTraining() {
        ButtonStyleSetter.onExit(btnTraining);
    }

}

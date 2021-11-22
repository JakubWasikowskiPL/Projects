package com.jakubwasikowski.healthylifestyleapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;

public class DietScreenController {

    //ELEMENTS OF THE GUI USED FOR ACTION
    @FXML
    private Button btnOverpressureDiet;

    @FXML
    private Button btnDabrowskaDiet;

    @FXML
    private Button btnVeganDiet;

    @FXML
    private Button btnOveractiveTGDiet;

    @FXML
    private Button btnRefluxDiet;

    @FXML
    private Button btnJuiceDiet;

    @FXML
    private Button btnSirtDiet;

    @FXML
    private Button btnKetoDiet;

    @FXML
    private Button btnIfDiet;

    @FXML
    private Button btnDashDiet;

    @FXML
    private Button btnGlutenFreeDiet;

    @FXML
    private Button btnBack;

    @FXML
    private Button btnDunkanDiet;

    @FXML
    private Button btnInsulineDiet;

    @FXML
    private Button btnLightDiet;

    @FXML
    private Button btnPaleoDiet;

    @FXML
    private Button btnHashimotoDiet;

    @FXML
    private StackPane spDiet;

    @FXML
    private TextArea taDescription;


    //METHODS

    //USED TO DISPLAY CONTENT OR MOVE BACK
    //Method used to move us back to the main menu after clicking back button
    @FXML
    void onMouseClicked_btnBack() {
        SceneSwitcher.switchScene(spDiet, getClass().getResource("HealthyLifestyleApp.fxml"));
    }

    //Method used display description of the Dabrowska Diet
    @FXML
    void onMouseClicked_btnDabrowskaDiet() {
        taDescription.setText(DataBaseConnection.getInstance().queryDietDescription(3));
    }

    //Method used display description of the Dash Diet
    @FXML
    void onMouseClicked_btnDashDiet() {
        taDescription.setText(DataBaseConnection.getInstance().queryDietDescription(2));
    }

    //Method used display description of the Dunkan Diet
    @FXML
    void onMouseClicked_btnDunkanDiet() {
        taDescription.setText(DataBaseConnection.getInstance().queryDietDescription(4));
    }

    //Method used display description of the Gluten Free Diet
    @FXML
    void onMouseClicked_btnGlutenFreeDiet() {
        taDescription.setText(DataBaseConnection.getInstance().queryDietDescription(1));
    }

    //Method used display description of the Hashimoto Diet
    @FXML
    void onMouseClicked_btnHashimotoDiet() {
        taDescription.setText(DataBaseConnection.getInstance().queryDietDescription(10));
    }

    //Method used display description of the IF Diet
    @FXML
    void onMouseClicked_btnIfDiet() {
        taDescription.setText(DataBaseConnection.getInstance().queryDietDescription(5));
    }

    //Method used display description of the Insuline Diet
    @FXML
    void onMouseClicked_btnInsulineDiet() {
        taDescription.setText(DataBaseConnection.getInstance().queryDietDescription(6));
    }

    //Method used display description of the Juice Diet
    @FXML
    void onMouseClicked_btnJuiceDiet() {
        taDescription.setText(DataBaseConnection.getInstance().queryDietDescription(15));
    }

    //Method used display description of the Keto Diet
    @FXML
    void onMouseClicked_btnKetoDiet() {
        taDescription.setText(DataBaseConnection.getInstance().queryDietDescription(7));
    }

    //Method used display description of the Light Diet
    @FXML
    void onMouseClicked_btnLightDiet() {
        taDescription.setText(DataBaseConnection.getInstance().queryDietDescription(8));
    }

    //Method used display description of the Overactive Thyroid Gland Diet
    @FXML
    void onMouseClicked_btnOveractiveTGDiet() {
        taDescription.setText(DataBaseConnection.getInstance().queryDietDescription(12));
    }

    //Method used display description of the Overpressure Diet
    @FXML
    void onMouseClicked_btnOverpressureDiet() {
        taDescription.setText(DataBaseConnection.getInstance().queryDietDescription(11));
    }

    //Method used display description of the Paleo Diet
    @FXML
    void onMouseClicked_btnPaleoDiet() {
        taDescription.setText(DataBaseConnection.getInstance().queryDietDescription(9));
    }

    //Method used display description of the Reflux Diet
    @FXML
    void onMouseClicked_btnRefluxDiet() {
        taDescription.setText(DataBaseConnection.getInstance().queryDietDescription(13));
    }

    //Method used display description of the Sirt Diet
    @FXML
    void onMouseClicked_btnSirtDiet() {
        taDescription.setText(DataBaseConnection.getInstance().queryDietDescription(14));
    }

    //Method used display description of the Vegan Diet
    @FXML
    void onMouseClicked_btnVeganDiet() {
        taDescription.setText(DataBaseConnection.getInstance().queryDietDescription(16));
    }


    //USED TO SET STYLE OF THE BUTTONS AFTER HOVERING AND EXITING
    //On hover methods
    @FXML
    void onMouseEntered_btnBack() {
        ButtonStyleSetter.onHover(btnBack);
    }

    @FXML
    void onMouseEntered_btnDabrowskaDiet() {
        ButtonStyleSetter.onHover(btnDabrowskaDiet);
    }

    @FXML
    void onMouseEntered_btnDashDiet() {
        ButtonStyleSetter.onHover(btnDashDiet);
    }

    @FXML
    void onMouseEntered_btnDunkanDiet() {
        ButtonStyleSetter.onHover(btnDunkanDiet);
    }

    @FXML
    void onMouseEntered_btnGlutenFreeDiet() {
        ButtonStyleSetter.onHover(btnGlutenFreeDiet);
    }

    @FXML
    void onMouseEntered_btnHashimotoDiet() {
        ButtonStyleSetter.onHover(btnHashimotoDiet);
    }

    @FXML
    void onMouseEntered_btnIfDiet() {
        ButtonStyleSetter.onHover(btnIfDiet);
    }

    @FXML
    void onMouseEntered_btnInsulineDiet() {
        ButtonStyleSetter.onHover(btnInsulineDiet);
    }

    @FXML
    void onMouseEntered_btnJuiceDiet() {
        ButtonStyleSetter.onHover(btnJuiceDiet);
    }

    @FXML
    void onMouseEntered_btnKetoDiet() {
        ButtonStyleSetter.onHover(btnKetoDiet);
    }

    @FXML
    void onMouseEntered_btnLightDiet() {
        ButtonStyleSetter.onHover(btnLightDiet);
    }

    @FXML
    void onMouseEntered_btnOveractiveTGDiet() {
        ButtonStyleSetter.onHover(btnOveractiveTGDiet);
    }

    @FXML
    void onMouseEntered_btnOverpressureDiet() {
        ButtonStyleSetter.onHover(btnOverpressureDiet);
    }

    @FXML
    void onMouseEntered_btnPaleoDiet() {
        ButtonStyleSetter.onHover(btnPaleoDiet);
    }

    @FXML
    void onMouseEntered_btnRefluxDiet() {
        ButtonStyleSetter.onHover(btnRefluxDiet);
    }

    @FXML
    void onMouseEntered_btnSirtDiet() {
        ButtonStyleSetter.onHover(btnSirtDiet);
    }

    @FXML
    void onMouseEntered_btnVeganDiet() {
        ButtonStyleSetter.onHover(btnVeganDiet);
    }

    //On exit methods
    @FXML
    void onMouseExited_btnBack() {
        ButtonStyleSetter.onExit(btnBack);
    }

    @FXML
    void onMouseExited_btnDabrowskaDiet() {
        ButtonStyleSetter.onExit(btnDabrowskaDiet);
    }

    @FXML
    void onMouseExited_btnDashDiet() {
        ButtonStyleSetter.onExit(btnDashDiet);
    }

    @FXML
    void onMouseExited_btnGlutenFreeDiet() {
        ButtonStyleSetter.onExit(btnGlutenFreeDiet);
    }

    @FXML
    void onMouseExited_btnHashimotoDiet() {
        ButtonStyleSetter.onExit(btnHashimotoDiet);
    }

    @FXML
    void onMouseExited_btnIfDiet() {
        ButtonStyleSetter.onExit(btnIfDiet);
    }

    @FXML
    void onMouseExited_btnInsulineDiet() {
        ButtonStyleSetter.onExit(btnInsulineDiet);
    }

    @FXML
    void onMouseExited_btnJuiceDiet() {
        ButtonStyleSetter.onExit(btnJuiceDiet);
    }

    @FXML
    void onMouseExited_btnKetoDiet() {
        ButtonStyleSetter.onExit(btnKetoDiet);
    }

    @FXML
    void onMouseExited_btnLightDiet() {
        ButtonStyleSetter.onExit(btnLightDiet);
    }

    @FXML
    void onMouseExited_btnOveractiveTGDiet() {
        ButtonStyleSetter.onExit(btnOveractiveTGDiet);
    }

    @FXML
    void onMouseExited_btnOverpressureDiet() {
        ButtonStyleSetter.onExit(btnOverpressureDiet);
    }

    @FXML
    void onMouseExited_btnPaleoDiet() {
        ButtonStyleSetter.onExit(btnPaleoDiet);
    }

    @FXML
    void onMouseExited_btnRefluxDiet() {
        ButtonStyleSetter.onExit(btnRefluxDiet);
    }

    @FXML
    void onMouseExited_btnSirtDiet() {
        ButtonStyleSetter.onExit(btnSirtDiet);
    }

    @FXML
    void onMouseExited_btnVeganDiet() {
        ButtonStyleSetter.onExit(btnVeganDiet);
    }

    @FXML
    void onMouseExited_btnDunkanDiet() {
        ButtonStyleSetter.onExit(btnDunkanDiet);
    }

}

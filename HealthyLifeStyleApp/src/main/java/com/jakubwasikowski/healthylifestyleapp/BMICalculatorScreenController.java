package com.jakubwasikowski.healthylifestyleapp;

import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;

import java.text.DecimalFormat;

//Class used to calculate Body Mass Index value
public class BMICalculatorScreenController {

    //In this case decimal format is used to display text with two decimal points
    private static final DecimalFormat df = new DecimalFormat("0.00");

    private RadioButton btnFemale;
    private ToggleGroup tgGender;
    private RadioButton btnMale;

    //Elements of the GUI used for calculations
    @FXML
    private BarChart<?, ?> barChartBMI;

    @FXML
    private StackPane stackPaneBMI;

    @FXML
    private TextField lblWeight;

    @FXML
    private TextField lblHeight;

    @FXML
    private ButtonBar btnbBack;

    @FXML
    private Label lblResult;

    //METHODS
    //Method used to move us back to the main menu after clicking back button
    @FXML
    void onMouseClicked_btnbBack() {
        SceneSwitcher.switchScene(stackPaneBMI, getClass().getResource("HealthyLifestyleApp.fxml"));
    }

    //Method used to calculate and display entered data after clicking calculate button
    @FXML
    void onMouseClicked_btnCalculate() {

        //Try-Catch block used in case of unexpected exceptions
        try {
            String stringWeight = lblWeight.getText();
            String stringHeight = lblHeight.getText();
            //Condition used to check if all the data was entered and there are no empty fields.
            if (!stringWeight.equals("") && !stringHeight.equals("")) {

                //Try-Catch block used in case if user entered other charts than numbers
                try {

                    // String values parsed to double and in case of height variable change from [cm] to [m] for calculation purposes
                    double weight = Double.parseDouble(stringWeight);
                    double height = (Double.parseDouble(stringHeight)) / 100;

                    //Condition used to check if entered values are in the possible range
                    if (height > 0 & weight > 0 && height < 2.90 & weight < 600) {
                        double calculatedBMI = weight / (height * height);
                        lblResult.setText(String.valueOf(df.format(calculatedBMI)));
                    } else {
                        lblResult.setText("Podane wartości muszą być w zakresach: \n Wzrost: 0-290  Waga: 0-600");
                    }
                } catch (NumberFormatException nfe) {
                    lblResult.setText("Podaj wartości numeryczne");
                }

            } else {
                lblResult.setText("Podaj wszystkie niezbędne dane");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //Methods used change colours of the back button bar after hovering and exiting
    @FXML
    void onMouseEntered_btnbBack() {
        ButtonStyleSetter.onHover(btnbBack);
    }

    @FXML
    void onMouseExited_btnbBack() {
        ButtonStyleSetter.onExit(btnbBack);
    }

}

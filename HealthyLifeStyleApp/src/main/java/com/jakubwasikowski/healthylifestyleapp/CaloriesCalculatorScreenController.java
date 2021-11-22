package com.jakubwasikowski.healthylifestyleapp;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;

import java.text.DecimalFormat;

public class CaloriesCalculatorScreenController {
    //CONSTANTS AND VARIABLES
    //In this case decimal format is used to display text with without any decimal points
    private static final DecimalFormat df = new DecimalFormat("0");
    private static final int CARBPROTDIVIDER = 4;
    private static final int FATDIVIDER = 9;

    //Variables related to the nutrients
    private static double carbohydratesGramature = 0.0;
    private static double fatGramature = 0.0;
    private static double proteinGramature = 0.0;

    //Elements of the GUI used in the process of calculation
    @FXML
    private TextField tfWeight;

    @FXML
    private TextField tfHeight;

    @FXML
    private TextField tfAge;

    @FXML
    private ButtonBar btnBack;

    @FXML
    private Label lblResult;

    @FXML
    private RadioButton rbtnFemale;

    @FXML
    private RadioButton rbtnHardWork;

    @FXML
    private RadioButton rbtnMale;

    @FXML
    private RadioButton rbtnLowSedentaryLifestyle;

    @FXML
    private RadioButton rbtnSedentaryLifestyle;

    @FXML
    private RadioButton rbtnStandingWork;

    @FXML
    private RadioButton rbtnWorkRequiringAA;

    @FXML
    private StackPane spCalories;

    @FXML
    private ToggleGroup tgActivity;

    @FXML
    private ToggleGroup tgGender;

    @FXML
    private PieChart pcCalories;

    //METHODS
    //Method used to move us back to the main menu after clicking back button
    @FXML
    void onMouseClicked_btnBack() {
        SceneSwitcher.switchScene(spCalories, getClass().getResource("HealthyLifestyleApp.fxml"));
    }

    //Method used to calculate and display entered data after clicking calculate button
    @FXML
    void onMouseClicked_btnCalculate() {

        //Try-Catch block used in case of unexpected exceptions
        try {
            //Saving entered data for weight, height and age to the local variables
            String stringWeight = tfWeight.getText();
            String stringHeight = tfHeight.getText();
            String stringAge = tfAge.getText();

            //Condition used to check if all the data was entered and there are no empty fields.
            if (!stringWeight.equals("") && !stringHeight.equals("") && !stringAge.equals("")) {

                //Try-Catch block used in case if user entered other charts than numbers
                try {
                    //Parsing number values from String to double and int
                    double weight = Double.parseDouble(stringWeight);
                    double height = (Double.parseDouble(stringHeight));
                    int age = (Integer.parseInt(stringAge));

                    //Condition used to check if entered values are in the possible range
                    if (height > 0 & weight > 0 & age > 0 && height < 290 & weight < 600 & age < 120) {
                        double calculatedCalories;

                        //Conditions used to check if user selected gender and to proceed proper calculations
                        if (rbtnFemale.isSelected()) {
                            calculatedCalories = PPMCalculator.femalePPMCalculator(weight, height, age) * calculatePAL();
                            calculateNutrients(calculatedCalories);
                            drawPieChart();
                            lblResult.setText(String.valueOf(df.format(calculatedCalories)));
                        } else if (rbtnMale.isSelected()) {
                            calculatedCalories = PPMCalculator.malePPMCalculator(weight, height, age) * calculatePAL();
                            calculateNutrients(calculatedCalories);
                            drawPieChart();
                            lblResult.setText(String.valueOf(df.format(calculatedCalories)));
                        } else {
                            lblResult.setText("Zaznacz płeć");
                        }
                    } else {
                        lblResult.setText("Podane wartości muszą być w zakresach: \n Wzrost: 0-290  Waga: 0-600  Wiek: 0-120 ");
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

    //Methods used change colours of the back button after hovering and exiting
    @FXML
    void onMouseEntered_btnBack() {
        ButtonStyleSetter.onHover(btnBack);
    }

    @FXML
    void onMouseExited_btnBack() {
        ButtonStyleSetter.onExit(btnBack);
    }

    //Method used to return physical activity level for selected radio button
    private double calculatePAL() {
        if (rbtnSedentaryLifestyle.isSelected()) {
            return 1.3;
        } else if (rbtnLowSedentaryLifestyle.isSelected()) {
            return 1.5;
        } else if (rbtnWorkRequiringAA.isSelected()) {
            return 1.7;
        } else if (rbtnStandingWork.isSelected()) {
            return 1.9;
        } else if (rbtnHardWork.isSelected()) {
            return 2.4;
        } else {
            return 0.0;
        }
    }

    //Method used to calculate nutrients
    private void calculateNutrients(double calories) {
        carbohydratesGramature = (calories * 0.55) / CARBPROTDIVIDER;
        proteinGramature = (calories * 0.15) / CARBPROTDIVIDER;
        fatGramature = (calories * 0.30) / FATDIVIDER;
    }

    //Nutrient getters
    public static double getCarbohydratesGramature() {
        return carbohydratesGramature;
    }

    public static double getFatGramature() {
        return fatGramature;
    }

    public static double getProteinGramature() {
        return proteinGramature;
    }

    //Method used to draw Nutrients pie chart
    private void drawPieChart() {
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data(("Białko = " + df.format(getProteinGramature())), (getProteinGramature())),
                new PieChart.Data(("Tłuszcze = " + df.format(getFatGramature())), (getFatGramature())),
                new PieChart.Data(("Węglowodany = " + df.format(getCarbohydratesGramature())), (getCarbohydratesGramature())));
        pcCalories.setData(pieChartData);
    }

}

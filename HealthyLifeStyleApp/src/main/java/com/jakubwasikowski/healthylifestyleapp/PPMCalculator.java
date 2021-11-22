package com.jakubwasikowski.healthylifestyleapp;

//Class used to calculate basal metabolic rate
public class PPMCalculator {

    //Method used to calculate basal metabolic rate for male
    public static double malePPMCalculator(double weight, double height, int age) {
        return (655.1 + (9.567 * weight) + (1.85 * height) - (4.68 * age));
    }

    //Method used to calculate basal metabolic rate for female
    public static double femalePPMCalculator(double weight, double height, int age) {
        return (66.47 + (13.7 * weight) + (5 * height) - (6.76 * age));
    }
}

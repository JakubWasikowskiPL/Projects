module com.jakubwasikowski.healthylifestyleapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.jakubwasikowski.healthylifestyleapp to javafx.fxml;
    exports com.jakubwasikowski.healthylifestyleapp;
}
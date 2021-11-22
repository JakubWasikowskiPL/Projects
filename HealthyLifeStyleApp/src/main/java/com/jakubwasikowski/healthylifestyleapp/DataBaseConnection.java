package com.jakubwasikowski.healthylifestyleapp;

import java.sql.*;

public class DataBaseConnection {

    //CONSTANTS AND VARIABLES
    //Constants and variables used in the process of connection and query
    private Connection conn;
    private static final String DB_NAME = "HealthyLifestyleAppDB.db";
    private static final String CONNECTION_STRING = "jdbc:sqlite:src//main//resources//com//jakubwasikowski//healthylifestyleapp//" + DB_NAME;
    private static final String TABLE_DIETS = "Diets";
    private static final String COLUMN_DIET_ID = "ID";
    private static final String COLUMN_DIET_DESCRIPTION = "Description";
    private static final String QUERY_DIETS =
            "SELECT " + COLUMN_DIET_DESCRIPTION + " FROM " + TABLE_DIETS +
                    " WHERE " + COLUMN_DIET_ID + " = ";

    //DataBaseConnection instance used in the form of Singleton pattern
    private static final DataBaseConnection instance = new DataBaseConnection();


    //METHODS
    //Getter for database connection instance used in starting and closing of the app
    public static DataBaseConnection getInstance() {
        return instance;
    }

    //Method used to connect to the database
    public boolean open() {
        try {
            conn = DriverManager.getConnection(CONNECTION_STRING);
            return true;
        } catch (SQLException e) {
            System.out.println("Problem with connection to the database: " + e.getMessage());
            return false;
        }
    }

    //Method used to close database connection to the database
    public void close() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println("Problem with closing database connection: " + e.getMessage());
        }
    }

    //Method used to query description for the diets in the Diets tab
    public String queryDietDescription(int id) {
        String query = QUERY_DIETS + id;
        try (Statement statement = conn.createStatement();
             ResultSet results = statement.executeQuery(query)) {
            return results.getString(1);
        } catch (SQLException e) {
            System.out.println("Problem with the query: " + e.getMessage());
            return null;
        }
    }

}

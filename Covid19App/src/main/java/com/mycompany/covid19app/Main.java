package com.mycompany.covid19app;

// imports
import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static ArrayList<Covid19App> getAllProvincialDetails() {
        ArrayList<Covid19App> detailsList = new ArrayList<>();
        try {
            // Load the JDBC driver
            //Class.forName("com.microsoft,sqlserver.jdbc.SQLServerDriver");

            // Establish the database connection
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=covid19_app",
                    "Jae",
                    "jaebird");
            // Execute SQL query to fetch data
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM CovidCases");

            // Process the result set
            while (rs.next()) {
                String province = rs.getString("Province");
                int totalCases = rs.getInt("TotalCases");
                double percentageTotal = rs.getDouble("PercentageTotal");

                Covid19App details = new Covid19App(province, totalCases, percentageTotal);
                detailsList.add(details);
            }

            // Close the connection
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return detailsList;
    }

    public static void printProvincialDetails(ArrayList<Covid19App> detailsList) {
        for (Covid19App details : detailsList) {
            System.out.println("Province: " + details.getProvince());
            System.out.println("Total Cases: " + details.getTotalCases());
            System.out.println("Percentage Total: " + details.getPercentageTotal());
            System.out.println("------------------------------------------");
        }
    }

    public static void main(String[] args) {
        System.out.println("COVID-19 Provincial Statistics:");
        ArrayList<Covid19App> detailsList = getAllProvincialDetails();
        printProvincialDetails(detailsList);
    }
} 


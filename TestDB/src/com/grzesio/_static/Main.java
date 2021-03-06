package com.grzesio._static;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

//        try( Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\sqlite\\testjava.db");
//             Statement statement = conn.createStatement()) {
//           statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)");

        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\sqlite\\testjava.db");
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS contacts "+
                                "(name TEXT, phone INTEGER, email TEXT)");

            statement.close();
            conn.close();

        } catch(SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }

    }
}

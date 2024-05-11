/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package historylog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.*;

/**
 *
 * @author عسثق
 */
public class DataBaseLogger {

    String url = "jdbc:mysql://localhost:3306/cocktaildatabase";
    String username = "root";
    String password = "";
    String date, time;

    
    public void logDB(String daten, String timen, String ingredients, double price, double calories, String color, int rate) throws ClassNotFoundException {
        date = "" + daten;
        time = "" + timen;

        Class.forName("com.mysql.jdbc.Driver");

        String insertSql = "INSERT INTO cocktailhistory (date, time, ingredients, price, calories, color, rate) VALUES ( \"" + date + "\",\"" + time + "\",\"" + ingredients + "\"," + price + calories + ",\"" + color + "\"," + rate + ")";

        try (Connection con = DriverManager.getConnection(url, username, password); PreparedStatement preparedStmt = con.prepareStatement(insertSql)) {
            preparedStmt.setString(1, date);
            preparedStmt.setString(2, time);
            preparedStmt.setString(3, ingredients);
            preparedStmt.setDouble(4, price);
            preparedStmt.setDouble(5, calories);
            preparedStmt.setString(6, color);
            preparedStmt.setInt(7, rate);
            preparedStmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package historylog;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author عسثق
 */
public class DataBaseLoggerTwo {

    String url = "jdbc:mysql://localhost:3306/cocktaildatabase";
    String username = "root";
    String password = "";

    public void logDB(String info) throws ClassNotFoundException {

        String insertSql = "INSERT INTO myhistory (info) VALUES(" + "\"" + info + "\"" + ")";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
//            Statement statement = conn.createStatement();
//            ResultSet resultSet = statement.executeQuery("select * from history");
//            while (resultSet.next()) {
//                System.out.println(resultSet.getInt(1) + " - " + resultSet.getString(2));
//            }
            PreparedStatement preparedStmt = conn.prepareStatement(insertSql);
            preparedStmt.execute();

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

}
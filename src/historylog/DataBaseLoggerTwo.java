/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package historylog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author عسثق
 */
public class DataBaseLoggerTwo {
    
     String url="jdbc:mysql://localhost:3306/cocktaildatabase";
    String username="root";
    String password="";
    

    public void logDB(String info) throws ClassNotFoundException {
     
            
           Class.forName("com.mysql.cj.jdbc.Driver");



String insertSql = "INSERT INTO history (info) VALUES(" + "\"" + info + "\"" + ")";

            try (Connection con = DriverManager.getConnection(url, username, password);
                 PreparedStatement preparedStmt = con.prepareStatement(insertSql)) {

 preparedStmt.execute();

            } catch (SQLException e) {
                System.out.println(e);
            }

        }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalmanagement;

import java.sql.*;
/**
 *
 * @author Cxllmegenius
 */
public class DBConnect {
    Connection conn = null;
    Statement stm = null;
    // public ResultSet rs;
    
    private String databaseName = "car_rental_system";
    private String url = "jdbc:mysql://127.0.0.1:3306/"+databaseName;
    private String username = "root";
    private String password = "";



    public void getConnect() {
       
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
            stm = conn.createStatement();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    
   }

    public Statement getStatement() {
        return this.stm;
    }   

    public Connection getConnection() {
        return this.conn;
    }


    public void disconect() {
        try {
            stm.close();
            conn.close();
            System.out.println("Disconnected from database");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    
    
}

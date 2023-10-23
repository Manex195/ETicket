/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eticketmain;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
import java.sql.*;
/**
 *
 * @author manexphringsangma
 */
public class Connect {
    Connection con;
    Statement st;
    Connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // password should be the password of the mysql server.
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
            st = con.createStatement();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eticketmain;

import javax.swing.JFrame;
import javax.swing.*;
//import java.sql.*;

public class ETicketMain extends JFrame {
    public static void main(String[] args) {
        preview max = new preview();
//        AdminPannel max = new AdminPannel();
        max.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        max.setSize(650, 425);
        max.setLocationRelativeTo(null);
        max.setVisible(true);
    }
}

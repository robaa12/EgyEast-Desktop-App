/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.egyeastlogin;

import ChoosePlan.Chooseplan;
import EgyEast.Home;
import FavPage.FavFrame;
import MovieFrame.MoviesFrame;
import UserAccount.User_account;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Robaa
 */
public class EgyEastLogin {
    
    public static Connection dbConn(){
    try  {
        String sqlUser= "sa";
        String sqlPass = "1234";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String conUrl = "jdbc:sqlserver://localhost:1433;instance=ELMALKY\\SQLEXPRESS;databaseName=EgyEasts;encrypt=true;trustServerCertificate=true";
        Connection conn = DriverManager.getConnection(conUrl , sqlUser , sqlPass);
         return conn;
         }
        catch(Exception ex){
           ex.printStackTrace();
           return null;
    }
    
    }
    public static ResultSet retriveData(String SQL){
                try {
               PreparedStatement ps = conn.prepareStatement(SQL);
               return  ps.executeQuery();
            } catch (SQLException ex) {
                Logger.getLogger(EgyEastLogin.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
    }
    public static void updateData(String SQL){
                    try {
               PreparedStatement ps = conn.prepareStatement(SQL); 
                 ps.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(EgyEastLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    public static Home home;
    public static NewJFrame main;
    public static SignUp signup;
    public static Login login;
    public static MoviesFrame movieframe;
    public static Chooseplan chooseplan;
    public static Connection conn = dbConn();
    public static ResultSet user_data;
    public static FavFrame favFrame;
    public static User_account user_account;
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                    
                    main = new NewJFrame();
                    main.setVisible(true);            
            }
        });
         dbConn();
    }
}

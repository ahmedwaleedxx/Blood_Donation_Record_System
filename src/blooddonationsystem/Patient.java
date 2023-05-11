/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blooddonationsystem;

import java.sql.*;
import javax.swing.JOptionPane;
import static blooddonationsystem.PatientRequests.*;


/**
 *
 * @author ahmed
 */
public class Patient  {
Connection con = javaconnect.connectdb();
    PreparedStatement ps = null;
    ResultSet rs = null;
    static int PatientId;
     static String PatientUsername;
    static String PatientPassword;
    static int PatientAge;
    String PatientEmail;
    private int phonenumber;
    private char gender;
    static String type;
    String bloodtype;
    String address;
    
   
  
// PatientLogin()
// MakeRequest()
// PatientEditAccount()

    public Patient(){
        
    }

    public void PatientLogin(String PatientUsername, String PatientPassword) {
          this.PatientUsername = PatientUsername;
        this.PatientPassword = PatientPassword;
        String patientlogin = "SELECT * FROM Person WHERE username=? AND password=? AND Type='Patient'";
        try {
            ps = con.prepareStatement(patientlogin);
            ps.setString(1, PatientUsername);
            ps.setString(2, PatientPassword);
            rs = ps.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Login Successfully... \n Welcome  "+PatientUsername);
                new PatientMenu().setVisible(true);
            } else if (PatientUsername.equals("") || PatientPassword.equals("")) {
                JOptionPane.showMessageDialog(null, "PLEASE ENTER ALL FIELDS...");

            } else {

                JOptionPane.showMessageDialog(null, "Wrong username or password");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
     public static void sendrequest(int id, String name, String bType , int age, String status , String type){
     try {

            Connection con = javaconnect.connectdb();

            PreparedStatement add = con.prepareStatement("insert into request values(?,?,?,?,?,?)");

            add.setInt(1, id);
            add.setString(2, name);
            add.setString(3, bType);
            add.setInt(4, age);
            add.setString(5, "Pending");
            add.setString(6, "Patient");
            add.executeUpdate();
            JOptionPane.showMessageDialog(null, "Request has been sent to the bloodbank...");
        } catch (SQLException e) {
         JOptionPane.showMessageDialog(null, "Error \nYou cannot Send more than one request...");
        }
    }
   
        
  
}
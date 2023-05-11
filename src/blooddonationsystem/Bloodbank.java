/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blooddonationsystem;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author ahmed
 */
public class Bloodbank {
    Connection con = javaconnect.connectdb();
    PreparedStatement ps = null;
    ResultSet rs = null;
private int BBankId ;
private String BName ;
String Busername;
private String BAddress ;
private String BEmail ;
private int BPhone;
private static int donations;
String Bpassword;
// AddBlood()
// DeleteBlood()
// EditBlood()
 public void BLogin(String username, String password) {
          this.Busername = username;
        this.Bpassword = password;
        String patientlogin = "SELECT * FROM BLOODBANK WHERE username=? AND password=?";
        try {
            ps = con.prepareStatement(patientlogin);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Login Successfully... \n Welcome  "+username);
               new BloodbankMenu().setVisible(true);
            } else if (username.equals("") || password.equals("")) {
                JOptionPane.showMessageDialog(null, "PLEASE ENTER ALL FIELDS...");

            } else {

                JOptionPane.showMessageDialog(null, "Wrong username or password");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
 
 public void AddBloodBank(int id, String name, String address, String email, int phone, int donations, String username, String password){
  try {
                Connection con = javaconnect.connectdb();

                PreparedStatement add = con.prepareStatement("insert into BloodBank values(?,?,?,?,?,?,?,?)");

                add.setInt(1, id);
                add.setString(2, name);
                add.setString(3, address);
                add.setString(4, email);
                add.setInt(5, phone);
                add.setInt(6, donations);
                add.setString(7, password);
                add.setString(8, username);

                int row = add.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Bloodbank Saved Successfully");
                new ManageBloodBanks().setVisible(true);

            } catch (SQLException e) {
                 JOptionPane.showMessageDialog(null, e);
            }   
 }
 public void UpdateBloodBank(String name, String location, String email, int number, int donations, String username, String password, int id){
      try {

              
                String query = "UPDATE Bue.BloodBank set  bname= '" + name + "', baddress='" + location + "' , bemail='" + email + "' , bphone= " + number + " , donations= " + donations+", username='"+username+"', password='"+password+ "'  WHERE bbid= " + id;

                Statement s = con.createStatement();
                s.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Bloodbank Updated Successfully...");
         
                new ManageBloodBanks().setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
 }
 public void DeleteBloodBank(int id){
       try {
                Connection con = javaconnect.connectdb();
                String query = "DELETE FROM bue.bloodbank WHERE BBId=" + id;
                PreparedStatement delete = con.prepareStatement(query);
                Statement s = con.createStatement();
                s.executeUpdate(query);
 

                JOptionPane.showMessageDialog(null, "Bloodbank Deleted Successfully...");
           new ManageBloodBanks().setVisible(true);

            } catch (Exception e) {
                e.printStackTrace();
            }
 }
 
 
}

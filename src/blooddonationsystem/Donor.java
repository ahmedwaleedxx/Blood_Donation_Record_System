/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blooddonationsystem;

import static blooddonationsystem.DonationRequest.age;
import static blooddonationsystem.DonationRequest.bloodtype;
import static blooddonationsystem.DonationRequest.id;
import static blooddonationsystem.DonationRequest.name;
import javax.swing.*;
import java.sql.*;



/**
 *
 * @author ahmed
 */
public class Donor  {

    Connection con = javaconnect.connectdb();
    PreparedStatement ps = null;
    ResultSet rs = null;

    private int DonorId;
    static String DonorUsername;
    static String DonorPassword;
    private int DonorAge;
    String DonorEmail;
    int phonenumber;
    char gender;
    String type;
    private String bloodtype;
    private String address;
    
    //  DonorLogin()
// checkForLastDonationTime()
// DonorEditAccount()
    public Donor() {
    }

    public void DonorLogin(String DonorUsername, String DonorPassword) {

       this.DonorUsername = DonorUsername;
        this.DonorPassword = DonorPassword;
        String donorlogin = "SELECT * FROM Person WHERE username=? AND password=? AND Type='Donor'";
        try {
            ps = con.prepareStatement(donorlogin);
            ps.setString(1, DonorUsername);
            ps.setString(2, DonorPassword);
            rs = ps.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Login Successfully... \n Welcome  "+DonorUsername);
                new DonorMenu().setVisible(true);
                
            } else if (DonorUsername.equals("") || DonorPassword.equals("")) {
                JOptionPane.showMessageDialog(null, "PLEASE ENTER ALL FIELDS...");

            } else {

                JOptionPane.showMessageDialog(null, "Wrong username or password");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    
    
public void sendrequest(int id, String name, String bloodtype, int age){
     try {

            Connection con = javaconnect.connectdb();

            PreparedStatement add = con.prepareStatement("insert into request values(?,?,?,?,?,?)");

            add.setInt(1, id);
            add.setString(2, name);
            add.setString(3, bloodtype);
            add.setInt(4, age);
            add.setString(5, "Pending");
            add.setString(6, "Donor");
            add.executeUpdate();
            JOptionPane.showMessageDialog(null, "Request Sent Successfully...");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
}


}

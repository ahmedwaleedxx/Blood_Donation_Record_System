/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blooddonationsystem;



import blooddonationsystem.HospitalRequest;
import blooddonationsystem.javaconnect;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author ahmed
 */
public class Hospital {
Connection con = javaconnect.connectdb();
    PreparedStatement ps = null;
    ResultSet rs = null;
    private int HospitalId;
    private String HospitalName;
    private String HospitalLocation;
    private String HospitalEmail;
    private String HospitalNumber;
    String husername;
    String hpassword;
    
//MakeBloodRequest()
// PurchaseBlood()
    public void HLogin(String username, String password) {
          this.husername = username;
        this.hpassword = password;
        String patientlogin = "SELECT * FROM HOSPITAL WHERE username=? AND password=?";
        try {
            ps = con.prepareStatement(patientlogin);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Login Successfully... \n Welcome  "+username);
               new HospitalMenu().setVisible(true);
            } else if (username.equals("") || password.equals("")) {
                JOptionPane.showMessageDialog(null, "PLEASE ENTER ALL FIELDS...");

            } else {

                JOptionPane.showMessageDialog(null, "Wrong username or password");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    
    
    public void DeleteHospital(int id){
         try {
                Connection con = javaconnect.connectdb();
                
                String query="DELETE FROM bue.hospital WHERE Hospitalid="+id;
                PreparedStatement add = con.prepareStatement(query);
                Statement s=con.createStatement();
                s.executeUpdate(query);
               
                
                JOptionPane.showMessageDialog(null, "Hospital Deleted Successfully...");
               new ManageHospitals().setVisible(true);

            } catch (Exception e) {
                e.printStackTrace();
            }
    }

public void AddHospital(int id, String name, String location, String email, int number, String username, String password){
    
   
  try {
                Connection con = javaconnect.connectdb();

                PreparedStatement add = con.prepareStatement("insert into Hospital values(?,?,?,?,?,?,?)");
                add.setInt(1, id);
                add.setString(2, name);
                add.setString(3, location);
                add.setString(4, email);
                add.setInt(5, number);
                add.setString(6, username);
                add.setString(7, password);
                int row = add.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Hospital Saved Successfully");
                new ManageHospitals().setVisible(true);
                

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
}

 public void updatehospital(String name, String location, String email, int phone, String username, String password, int id ){
                  try {

                
                String query = "UPDATE Bue.hospital set  hospitalname= '" + name + "', hospitallocation='" + location + "' , hospitalemail='" + email + "', hospitalnumber=" +phone +", username='"+username+"', password='" +password+ "'  WHERE hospitalid= " + id;

                Statement s = con.createStatement();
                s.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Hospital Updated Successfully...");
                
                new ManageHospitals().setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    


public void sendrequest(String name, int id, int age, String bloodtype) {
      
            try {
                

                PreparedStatement add = con.prepareStatement("insert into request values(?,?,?,?,?,?)");
                add.setInt(1, id);
                add.setString(2, name);
                add.setString(3, bloodtype);
                add.setInt(4, age);
              add.setString(5,"Pending");
              add.setString(6, "Hospital");

                int row = add.executeUpdate();

                JOptionPane.showMessageDialog(null, "Request Sent Successfully...");
//                status.setText("Blood Request Pending...");
//                this.setVisible(false);

            } catch (Exception e) {
               JOptionPane.showMessageDialog(null, "You have entered an existing ID");
            }
        }
    }

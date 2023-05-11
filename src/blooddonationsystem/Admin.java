/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blooddonationsystem;

import java.sql.*;

import javax.swing.JOptionPane;

/**
 *
 * @author ahmed
 */
public class Admin  {

    Connection con = javaconnect.connectdb();
    PreparedStatement ps = null;
    ResultSet rs = null;
    int AdminId;
   static String AdminUsername;
    static String AdminPassword;
    int AdminAge;
    String AdminEmail;
    int phoneNumber;
    char gender;
    String type;
    String bloodtype;
    String address;

    public Admin() {
    }

// AdminEditAccount()
// AdminLogin()
// AccountInfo()
// viewReport()
    public void AdminLogin(String AdminUsername, String AdminPassword) {

        this.AdminUsername = AdminUsername;
        this.AdminPassword = AdminPassword;
        String adminlogin = "SELECT * FROM Person WHERE username=? AND password=? AND Type='Admin'";
        try {
            ps = con.prepareStatement(adminlogin);
            ps.setString(1, AdminUsername);
            ps.setString(2, AdminPassword);
            rs = ps.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Login Successfully...  \n Welcome  " + AdminUsername);
                new AdminMenu().setVisible(true);
                new Login().setVisible(false);
            } else if (AdminUsername.equals("") || AdminPassword.equals("")) {
                JOptionPane.showMessageDialog(null, "PLEASE ENTER ALL FIELDS...");

            } else {

                JOptionPane.showMessageDialog(null, "Wrong username or password");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public static void AddAccount(String uname , String pw , int uage , int uid , String mail , int pnum , String uadd , char ugender , String utype, String ubtype)
    {
        try {
                Connection con = javaconnect.connectdb();

                PreparedStatement add = con.prepareStatement("insert into Person values(?,?,?,?,?,?,?,?,?,?)");
                add.setString(1, uname);
                add.setString(2, pw);
                add.setInt(3, uage);
                add.setInt(4, uid);
                add.setString(5, mail);
                add.setInt(6, pnum);
                add.setString(7, uadd);
                add.setString(8,""+ugender);
                add.setString(9, utype);
                add.setString(10, ubtype);
int row=add.executeUpdate();
        JOptionPane.showMessageDialog(null, "Account Added Successfully...");
        new ManageAccounts().setVisible(true);
        
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "FAILED...");
            }
            
    }
  
          public static void deleteaccount(int id){
       
            try {
                Connection con = javaconnect.connectdb();
                
                String query = "DELETE FROM bue.person WHERE id =" + id;
                PreparedStatement add = con.prepareStatement(query);
                Statement s = con.createStatement();
                s.executeUpdate(query);
               JOptionPane.showMessageDialog(null, "Account Deleted Successfully...");
               

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "FAILED...");
            }
        
          
    }
    public  void UpdateAccount(String username, String password, int age, String email, int phone, String address, char gender, String type, String bloodtype, int id)
    {
             try {
                
               
                String query = "UPDATE Bue.person set  username= '" +username+"', password='"+password+"', age= "+age+" , email='"+email+"', phone= "+phone+" , address='"+address+"', gender= '"+gender+"', type='"+type+"', bloodtype='"+bloodtype+"' WHERE id= "+id;
                
                Statement s = con.createStatement();
                s.executeUpdate(query);
               
                JOptionPane.showMessageDialog(null, "Account Updated Successfully, \nAn email has been sent to the user with the update");
                
                new ManageAccounts().setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "FAILED...");
            }
        }
    }

//    public void accdetails(String username, String password) {
//        int age; int id; String mail; int phone; String address = null;
//char sex; String type = null;
//String blood;
//        try {
//            AdminLogin(null, password); 
//            String sql = "SELECT * FROM Person where password= '"+password+"'";
             
//              this.AdminId = AdminId;
//        this.AdminUsername = username;
//        this.AdminPassword = password;
//        this.AdminAge = age;
//        this.AdminEmail = mail;
//        this.phoneNumber = phone;
//        this.gender = sex;
//        this.type = type;
//        this.bloodtype = blood;
//        this.address = address;
//            Statement s = con.createStatement();
//
//while (rs.next()){
//    ps.setString(1, AdminUsername);
//
//            ps.setString(2, password);
//            ps.setInt(3, AdminAge);
//            ps.setInt(4, AdminId);
//            ps.setString(5, AdminEmail);
//            ps.setInt(6, phoneNumber);
//            ps.setString(7, address);
//            ps.setInt(7, gender);
//            ps.setString(8, type);
//            ps.setString(10, bloodtype);
//}
//            rs= s.executeQuery(sql);
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Failed...");
//            
//        }
//    }

  


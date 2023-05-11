/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blooddonationsystem;

import java.sql.*;
;
import java.util.*;
import javax.swing.JOptionPane;
import static blooddonationsystem.Admin.*;
import static blooddonationsystem.Patient.*;
import static blooddonationsystem.Donor.*;

/**
 *
 * @author ahmed
 */


public class Accountdetails extends javax.swing.JFrame {

    PreparedStatement ps = null;
    ResultSet rs = null;
    Statement st;
    

    public Accountdetails() {
        initComponents();
        accdetails();
    }

    public void accdetails() {
        Connection conn = javaconnect.connectdb();

        try {
            String sql = "SELECT * FROM PERSON WHERE username='" +AdminUsername + "' OR username='"+PatientUsername+"'OR username='"+DonorUsername+ "' AND password='"+AdminPassword + "' OR password='"+PatientPassword+"'OR password='"+DonorPassword+ "'";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                username.setText(rs.getString("username"));
                password.setText(rs.getString("password"));
                age.setText(rs.getString("age"));
                id.setText(rs.getString("id"));
                email.setText(rs.getString("email"));
                phone.setText(rs.getString("phone"));
                address.setText(rs.getString("address"));
                gender.setText(rs.getString("gender"));
                type.setText(rs.getString("type"));
                bloodtype.setText(rs.getString("bloodtype"));
            }
            rs.close();
            st.close();
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"FAILED... ");
        }
    }

// ArrayList<Admin> admins;
//    
//   Connection conn=javaconnect.connectdb();
//    public Accountdetails(Admin admin, ArrayList<Admin> admins, Connection con)
//    {
//       
//        current = admin;
//        this.admins = admins;
//        this.conn = con;
//        initComponents();
//        id.setText("" + admin.AdminId);
//        username.setText(admin.AdminUsername);
//        password.setText(admin.AdminPassword);
//        age.setText(""+admin.AdminAge);
//        email.setText(admin.AdminEmail);
//        address.setText(admin.address);
//         phone.setText("" + admin.phoneNumber);
//        gender.setText(""+admin.gender);
//        bloodtype.setText(admin.bloodtype);
//        type.setText(admin.type);
//    }
//
//public void showdetails() throws SQLException{
//    Admin a = new Admin();
//    String sql="SELECT * FROM PERSON WHERE USERNAME='"+a.AdminUsername+"' AND PASSWORD="+a.AdminPassword;
//    username.setText(a.AdminUsername);
//    password.setText(a.AdminPassword);
//    age.setText(""+a.AdminAge);
//    email.setText(a.AdminEmail);
//    address.setText(a.address);
//    phone.setText(""+a.phoneNumber);
//    gender.setText(""+a.gender);
//    bloodtype.setText(a.bloodtype);
//    type.setText(a.type);
//    rs=st.executeQuery(sql);
//}
//     public void showdetails(){
//         try{
//rs=st.executeQuery(sql);
//while(rs.next()){
//username.setText(rs.getString("username"));
//
//}
//
//rs.close();
//st.close();
//conn.close();
//} catch (SQLException ex) {
//JOptionPane.showMessageDialog(this, "Connection failed");
//}
//     }
//    ArrayList<Admin> admins;
//
//    Connection conn;
//    public Accountdetails(Admin admin, ArrayList<Admin> admins, Connection conn)
//    {
//        current = admin;
//        this.admins = admins;
//        this.conn = conn;
//        initComponents();
//        name.setText("" + admin.AdminId);
//        
//    }
//    
//    Admin a1;
//public void admindetails(){
//    Connection con = javaconnect.connectdb();
//    Statement st;
//        try {
//            st = con.createStatement();
//                ResultSet rs=st.executeQuery("SELECT * FROM Person WHERE Type= 'Admin' ");
//while(rs.next()){
//    name.setText(""+rs.getString(a1.AdminUsername));
//}
//        } catch (SQLException ex) {
//            Logger.getLogger(Accountdetails.class.getName()).log(Level.SEVERE, null, ex);
//        }
//}
//     private void admindetails() {
//        try {
//Connection con = javaconnect.connectdb();
//    Statement st = con.createStatement();
//    ResultSet rs = st.executeQuery("select * from Person where type = 'Admin' " );
//Admin a=new Admin();
//            
//       
//name.setText(""+a.AdminUsername);
//        } catch (SQLException ex) {
//
//            ex.printStackTrace();
//
//        }
//
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        name2 = new javax.swing.JLabel();
        name3 = new javax.swing.JLabel();
        name4 = new javax.swing.JLabel();
        name5 = new javax.swing.JLabel();
        name6 = new javax.swing.JLabel();
        name7 = new javax.swing.JLabel();
        name8 = new javax.swing.JLabel();
        name9 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        bloodtype = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("Age");

        name1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        name1.setForeground(new java.awt.Color(255, 255, 255));
        name1.setText("Blood Type");

        name2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        name2.setForeground(new java.awt.Color(255, 255, 255));
        name2.setText("Email");

        name3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        name3.setForeground(new java.awt.Color(255, 255, 255));
        name3.setText("ID");

        name4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        name4.setForeground(new java.awt.Color(255, 255, 255));
        name4.setText("Address");

        name5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        name5.setForeground(new java.awt.Color(255, 255, 255));
        name5.setText("Phone");

        name6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        name6.setForeground(new java.awt.Color(255, 255, 255));
        name6.setText("Type");

        name7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        name7.setForeground(new java.awt.Color(255, 255, 255));
        name7.setText("Gender");

        name8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        name8.setForeground(new java.awt.Color(255, 255, 255));
        name8.setText("Password");

        name9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        name9.setForeground(new java.awt.Color(255, 255, 255));
        name9.setText("Username");

        username.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));

        password.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));

        bloodtype.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bloodtype.setForeground(new java.awt.Color(255, 255, 255));

        age.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        age.setForeground(new java.awt.Color(255, 255, 255));

        id.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));

        email.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));

        phone.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        phone.setForeground(new java.awt.Color(255, 255, 255));

        gender.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        gender.setForeground(new java.awt.Color(255, 255, 255));

        address.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        address.setForeground(new java.awt.Color(255, 255, 255));

        type.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        type.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Engravers MT", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Account Details");

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Back to menu");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 125, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name6)
                    .addComponent(name7)
                    .addComponent(name4)
                    .addComponent(name5)
                    .addComponent(name2)
                    .addComponent(name3)
                    .addComponent(name1)
                    .addComponent(name)
                    .addComponent(name8)
                    .addComponent(name9))
                .addGap(172, 172, 172)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bloodtype, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(age, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bloodtype, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(address, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(type, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addComponent(jButton4))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      if(type.getText().equals("Admin")){
          new AdminMenu().setVisible(true);
      }else if(type.getText().equals("Patient"))
      {
          new PatientMenu().setVisible(true);
          this.setVisible(false);
      }
      else{
          new DonorMenu().setVisible(true);
          this.setVisible(false);
      }
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Accountdetails.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Accountdetails.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Accountdetails.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Accountdetails.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Accountdetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JLabel age;
    private javax.swing.JLabel bloodtype;
    private javax.swing.JLabel email;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel id;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel name3;
    private javax.swing.JLabel name4;
    private javax.swing.JLabel name5;
    private javax.swing.JLabel name6;
    private javax.swing.JLabel name7;
    private javax.swing.JLabel name8;
    private javax.swing.JLabel name9;
    private javax.swing.JLabel password;
    private javax.swing.JLabel phone;
    private javax.swing.JLabel type;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}

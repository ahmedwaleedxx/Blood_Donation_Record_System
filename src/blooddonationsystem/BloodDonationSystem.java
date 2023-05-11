/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blooddonationsystem;

import javax.swing.*;

/**
 *
 * @author ahmed
 */
public class BloodDonationSystem {

    static void welcome() {
        // this is to lunch the gui by the splash :-
        splash welcome = new splash();
        welcome.setVisible(true);
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(40);
                welcome.percentage.setText(i + " %");
                welcome.progressbar.setValue(i);
                if (i <= 50) {
                    welcome.status.setText("LOADING.....");
                }
                else if (i >= 50) {
                   welcome.status.setText("CONNECTING...");
                }
                if (i == 100) {
                     welcome.status.setText("CONNECTED SUCCESSFULLY");
                    JOptionPane.showMessageDialog(null, "Welcome to \n BLOOD DONATION RECORD SYSTEM");
                       new chooseuser().setVisible(true);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        welcome.dispose();
    }

    public static void main(String[] args) {
        welcome();
        
     

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blooddonationsystem;

/**
 *
 * @author ahmed
 */
public class DonorController {
    public static void verifysendrequest(int id, String name, String bloodtype, int age){
        Donor d=new Donor();
        d.sendrequest(id, name, bloodtype, age);
    }
}

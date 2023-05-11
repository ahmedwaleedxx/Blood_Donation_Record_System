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
public class BloodBankController {
    public static void verifyaddbloodbank(int id, String name, String address, String email, int phone, int donations, String username, String password){
        Bloodbank b=new Bloodbank();
        b.AddBloodBank(id, name, address, email, phone, donations, username, password);
    }
    public static void verifyupdatebloodbank(String name, String location, String email, int number, int donations, String username, String password, int id){
        Bloodbank b=new Bloodbank();
        b.UpdateBloodBank(name, location, email, number, donations, username, password, id);
    }
    public static void deletebloodbank(int id){
        Bloodbank b=new Bloodbank();
        b.DeleteBloodBank(id);
    }
}

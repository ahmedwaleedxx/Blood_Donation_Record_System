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


public class HospitalController {


public static void verifyaddhospital(int id, String name, String location, String email, int number, String username, String password){
 Hospital h=new Hospital();
    h.AddHospital(id, name, location, email, number, username, password);
}
public static void verifyupdatehospital(String name, String location, String email, int phone, String username, String password, int id ){
    Hospital h=new Hospital();
    h.updatehospital(name, location, email, phone, username, password, id);
}
public static void verifydeletehospital(int id){
    Hospital h=new Hospital();
    h.DeleteHospital(id);
}
public static void verifysendrequest(String name, int id, int age, String bloodtype){
    Hospital h=new Hospital();
    h.sendrequest(name, id, age, bloodtype);
}

}

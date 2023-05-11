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
public class AdminController {
    public static void VerifyAddAccount(String uname , String pw , int uage , int uid , String mail , int pnum , String uadd , char ugender , String utype, String ubtype)
    {
        Admin.AddAccount(uname, pw, uage, uid, mail, pnum, uadd, ugender, utype, ubtype);
    }
    public static void verifydeleteaccount(int id){
        Admin.deleteaccount(id);
    }
    public static void verifyupdateaccount(String username, String password, int age, String email, int phone, String address, char gender, String type, String bloodtype, int id)
    {
        Admin a=new Admin();
        a.UpdateAccount(username, password, age, email, phone, address, gender, type, bloodtype, id);
    }
    
}

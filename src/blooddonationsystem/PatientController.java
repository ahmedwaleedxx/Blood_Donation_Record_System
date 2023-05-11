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
public class PatientController {
 public static void VerifySendRequest(int id, String name, String bType , int age, String status , String type) 
  {
      Patient.sendrequest( id, name, bType ,  age,  status , type);
  }

    
   
}

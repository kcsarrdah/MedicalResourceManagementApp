/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mrmapp;

import java.util.ArrayList;
import models.user;
import java.util.HashMap;
import models.city;
import models.community;
import models.communityAdmin;
import models.doctor;
import models.hospital;
import models.patient;

/**
 *
 * @author kcsar
 */
public class MRMApp {
    public static HashMap<String, user> users = new HashMap<String, user>();
    public static HashMap<String, doctor> doctors = new HashMap<String, doctor>();
    public static HashMap<String, patient> patients = new HashMap<String, patient>();
    public static HashMap<String, hospital> hospitals = new HashMap<String, hospital>();
    public static HashMap<String, community> communities = new HashMap<String, community>();
    public static HashMap<String, communityAdmin> communityAdmins = new HashMap<String, communityAdmin>();
    public static ArrayList<String> cities = new ArrayList<String>();
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        user albert = new user("albert", "123456789", "doctor"); 
        user robin = new user("robin", "1234567890", "communityAdmin"); 
        user parvati = new user("parvati", "123456789012", "patient");
        user jagrawal = new user("jagrawal", "whydoiexist", "person");
        user krishnna = new user("krishnna", "password", "systemAdmin");
        
        users.put(albert.getUsername(), albert);
        users.put(robin.getUsername(), robin);
        users.put(parvati.getUsername(), parvati);
        users.put(jagrawal.getUsername(), jagrawal);
        users.put(krishnna.getUsername(), krishnna);
        
        
        LoginPage lp = new LoginPage();
        lp.show();
    }
    
}

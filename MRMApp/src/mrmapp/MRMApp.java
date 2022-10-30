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
import models.encounter;
import models.hospital;
import models.house;
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
    public static HashMap<String, house> houses = new HashMap<String, house>();
    public static ArrayList<String> cities = new ArrayList<String>();
    public static ArrayList<encounter> encounters = new ArrayList<encounter>();
    
    public static String cityName = "";
    public static String commName = "";
    
   
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Hardcoding values for ease
        cities.add("pune");
        cities.add("Boston");
        cities.add("Mumbai");
        
        user albert = new user("albert", "123456789", "doctor"); 
        user robin = new user("robin", "1234567890", "communityAdmin"); 
        user parvati = new user("parvati", "123456789012", "Doctor");
        user jagrawal = new user("jagrawal", "whydoiexist", "person");
        user krishnna = new user("krishnna", "password", "systemAdmin");
        
        users.put(albert.getUsername(), albert);
        users.put(robin.getUsername(), robin);
        users.put(parvati.getUsername(), parvati);
        users.put(jagrawal.getUsername(), jagrawal);
        users.put(krishnna.getUsername(), krishnna);
        
        community MissionHill = new community("Mission Hill", 02120, "Boston");
        community MarketYard = new community("Market Yard", 411037, "pune");
        community Roxbury = new community("Roxbury", 02121, "Boston");
        community Panvel = new community("Panvel", 411050, "Mumbai");
        
        communities.put(MissionHill.getName(), MissionHill);
        communities.put(MarketYard.getName(), MarketYard);
        communities.put(Roxbury.getName(), Roxbury);
        communities.put(Panvel.getName(), Panvel);
        
        
        doctor rick = new doctor(1000, "hospitalA", "Richard", "Bu", 28, "male", "houseA", "Roxbury", 02120, "Boston");
        doctor mike = new doctor(1001,"hospitalB", "Michael", "Wu", 38, "male", "houseB", "MissionHill", 02120, "Boston");
        doctor par = new doctor(1002, "hospitalc", "parvati", "saraswati", 42, "female", "houseC", "MarketYard", 411037, "Pune");
        
        doctors.put(rick.getFirstName(), rick);
        doctors.put(mike.getFirstName(), mike);
        doctors.put(par.getFirstName(), par);
        
        hospital a = new hospital("a", "Market Yard", 411037, "pune");
        hospital b = new hospital("b", "Roxbury", 02120, "Boston");
        hospital c = new hospital("c", "Mission Hill", 02120, "Boston");
        hospital d = new hospital("d", "Panvel", 411037, "Mumbai");
        
        
        hospitals.put(a.getHospitalName(), a);
        hospitals.put(b.getHospitalName(), b);
        hospitals.put(c.getHospitalName(), c);
        hospitals.put(d.getHospitalName(), d);
        
        communityAdmin ca = new communityAdmin("robin", "robin", "Male", "MissionHill", 02120,"Boston");
        communityAdmin ca2 = new communityAdmin("Ram", "Ram", "Male", "Market Yard", 411037,"Pune");
        communityAdmins.put(ca.getUsername(), ca);
        communityAdmins.put(ca2.getUsername(), ca2);
        
        
        LoginPage lp = new LoginPage();
        lp.show();
    }
    
}

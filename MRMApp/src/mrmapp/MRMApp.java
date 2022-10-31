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
    public static String docUserName = "";
    public static String docName = "";
    
   
    

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
        
        
        doctor rick = new doctor("Richard",1000, "a", "Richard", "Bu", 28, "male", "houseA", "Roxbury", 02120, "Boston");
        doctor mike = new doctor("Michael",1001,"b", "Michael", "Wu", 38, "male", "houseB", "MissionHill", 02120, "Boston");
        doctor par = new doctor("parvati",1002, "c", "parvati", "saraswati", 42, "female", "houseC", "MarketYard", 411037, "Pune");
        
        doctors.put(rick.getUserName(), rick);
        doctors.put(mike.getUserName(), mike);
        doctors.put(par.getUserName(), par);
        
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
        
        //encounter e1 = new encounter("shreya", "parvati", 'Sun Jan 01 00:00:00 PKT 2017', 10011, 1002, 24, 39.46, 100);
        
        
        LoginPage lp = new LoginPage();
        lp.show();
    }
    
}

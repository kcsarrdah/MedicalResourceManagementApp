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
    public static HashMap<Integer, hospital> hospitals = new HashMap<Integer, hospital>();
    public static HashMap<String, community> communities = new HashMap<String, community>();
    public static HashMap<String, communityAdmin> communityAdmins = new HashMap<String, communityAdmin>();
    public static HashMap<String, house> houses = new HashMap<String, house>();
    public static ArrayList<String> cities = new ArrayList<String>();
    public static ArrayList<encounter> encounters = new ArrayList<encounter>();
    
    public static String cityName = "";
    public static String commName = "";
    public static String docUserName = "";
    public static String docName = "";
    public static String patUserName = "";
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Hardcoding values for ease
        cities.add("pune");
        cities.add("Boston");
        cities.add("Mumbai");
        
        user albert = new user("albert", "123456789", "Doctor"); 
        user robin = new user("robin", "1234567890", "communityAdmin"); 
        user parvati = new user("parvati", "123456789012", "Doctor");
        user jagrawal = new user("jagrawal", "whydoiexist", "Patient");
        user krishnna = new user("krishnna", "password", "systemAdmin");
        user anannyaa = new user("anannya", "123", "Patient"); 
        user adityaa = new user("aditya", "124", "Patient"); 
        user Sankalp = new user("twofaced", "125", "Patient"); 
        user michael = new user("Michael", "000", "Doctor");
        
        users.put(albert.getUsername(), albert);
        users.put(robin.getUsername(), robin);
        users.put(parvati.getUsername(), parvati);
        users.put(jagrawal.getUsername(), jagrawal);
        users.put(krishnna.getUsername(), krishnna);
        users.put(anannyaa.getUsername(), anannyaa);
        users.put(adityaa.getUsername(), adityaa);
        users.put(Sankalp.getUsername(), Sankalp);
        users.put(michael.getUsername(), michael);
        
        community MissionHill = new community("Mission Hill", 02120, "Boston");
        community MarketYard = new community("Market Yard", 411037, "pune");
        community Roxbury = new community("Roxbury", 02121, "Boston");
        community Panvel = new community("Panvel", 411050, "Mumbai");
        
        communities.put(MissionHill.getName(), MissionHill);
        communities.put(MarketYard.getName(), MarketYard);
        communities.put(Roxbury.getName(), Roxbury);
        communities.put(Panvel.getName(), Panvel);
        
        
        doctor rick = new doctor("Richard",1000, "a", "Richard", "Bu", 28, "male", "houseA", "Roxbury", 02120, "Boston");
        doctor mike = new doctor("Michael",1001,"b", "Michael", "Wu", 38, "male", "houseB", "Mission Hill", 02120, "Boston");
        doctor par = new doctor("parvati",1002, "c", "parvati", "saraswati", 42, "female", "houseC", "MarketYard", 411037, "Pune");
        
        doctors.put(rick.getUserName(), rick);
        doctors.put(mike.getUserName(), mike);
        doctors.put(par.getUserName(), par);
        
        hospital a = new hospital(123, "a", "Market Yard", 411037, "pune");
        hospital b = new hospital(124, "b", "Roxbury", 02120, "Boston");
        hospital c = new hospital(1234, "c", "MissionHill", 02120, "Boston");
        hospital d = new hospital(234, "d", "Panvel", 411037, "Mumbai");
        
        
        hospitals.put(a.getHospitalID(), a);
        hospitals.put(b.getHospitalID(), b);
        hospitals.put(c.getHospitalID(), c);
        hospitals.put(d.getHospitalID(), d);
        
        communityAdmin ca = new communityAdmin("robin", "robin", "Male", "MissionHill", 02120,"Boston");
        communityAdmin ca2 = new communityAdmin("Ram", "Ram", "Male", "Market Yard", 411037,"Pune");
        communityAdmins.put(ca.getUsername(), ca);
        communityAdmins.put(ca2.getUsername(), ca2);
        
        
        patient anannya = new patient(100, "anannya", "123", "a", "Anannya", "Sethiya", 22, "female", "house", "Roxbury", 02120, "Boston");
        patient aditya = new patient(101, "aditya", "124", "b", "Aditya", "Khaire", 22, "male", "houseB", "Panvel", 411037, "Mumbai");
        patient pandey = new patient(102, "twofaced", "125", "c", "Sankalp", "Pandey", 22, "male", "hosueC", "Market Yard", 411037, "pune");
        
        patients.put(anannya.getUsername(), anannya);
        patients.put(aditya.getUsername(), aditya);
        patients.put(pandey.getUsername(), pandey);
        
        
        System.out.println("here");
        
        LoginPage lp = new LoginPage();
        lp.show();
    }
    
}

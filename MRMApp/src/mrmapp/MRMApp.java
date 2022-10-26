/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mrmapp;

import java.util.ArrayList;
import models.user;
import java.util.HashMap;

/**
 *
 * @author kcsar
 */
public class MRMApp {
    static HashMap<String, user> users = new HashMap<String, user>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        user albert = new user("albertisatest", "123456789", "doctor"); 
        user robin = new user("robinisatest", "1234567890", "patient"); 
        user parvati = new user("parvatiisatest", "123456789012", "person");
        user jagrawal = new user("jaggu", "whydoiexist", "person");
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

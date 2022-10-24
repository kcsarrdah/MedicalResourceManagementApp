/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Date;

/**
 *
 * @author kcsar
 */
public class user {
    private String username;
    private String password;
    private String type;
    
     user(String username, String password) {
        this.username = username;
        this.password = password;
        this.type = type;
    }
     
     public String getUserName() {
        return username;
    }
     public String getPassword() {
        return password;
    }
     public void setUserName(String username) {
        this.username = username;
    }
    public void setpassword(String password) {
        this.password = password;
    }
     
}

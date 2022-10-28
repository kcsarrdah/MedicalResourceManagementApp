/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author kcsar
 */
public class communityAdmin extends community{
    
    private String username;
    private String name;
    private String gender;

    public communityAdmin(String username, String name, String gender, String communityName, int zip, String cityName){
        super(communityName, zip, cityName);
        this.setUsername(username);
        this.setGender(gender);
        this.setAdminName(name);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAdminName() {
        return name;
    }

    public void setAdminName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
}



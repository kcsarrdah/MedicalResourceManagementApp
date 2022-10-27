/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author kcsar
 */
public class house extends community{
    
    private String houseName;

    public house(String houseName,  String communityName, int zip, String cityName) {
        super(communityName, zip, cityName);
        this.setHouseName(houseName);
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }   
    
}

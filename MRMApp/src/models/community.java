/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author kcsar
 */
public class community extends city{
    private String communityName;
    private int zip;
    

    public community(String communityName, int zip, String cityName) {
        super(cityName);
        this.setName(communityName);
        this.setZip(zip);
    }

    public String getName() {
        return communityName;
    }

    public void setName(String communityName){
        this.communityName = communityName;
    }
    
    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
}

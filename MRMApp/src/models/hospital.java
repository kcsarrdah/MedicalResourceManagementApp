/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author kcsar
 */
public class hospital extends community{
    private String hospitalName;
    private int hospitalID;


    public hospital(int hospitalID, String hospitalName, String communityName, int zip, String cityName) {
        super(communityName, zip, cityName);
        this.setHospitalName(hospitalName);
        this.setHospitalID(hospitalID);
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String name) {
        this.hospitalName = name;
    }
    
    public int getHospitalID() {
        return hospitalID;
    }

    public void setHospitalID(int hospitalID) {
        this.hospitalID = hospitalID;
    }
    
}

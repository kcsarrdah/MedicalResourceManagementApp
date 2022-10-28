/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author kcsar
 */
public class doctor extends person{
    private String hospitalName; 

    public doctor(String hospitalName, String firstName, String lastName, int age, String gender, String houseName, String communityName, int zip, String cityName) {
        super(firstName, lastName, age, gender, houseName, communityName, zip, cityName);
        this.setHospitalName(hospitalName);
    }



    public String getHospitalName(){
        return hospitalName;
    }

    public void setHospitalName(String hospital) {
        this.hospitalName = hospital;
    }
    
}

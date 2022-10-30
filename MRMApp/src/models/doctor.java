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
    private int doctorID;
    private String userName;


    public doctor(String userName, int doctorID, String hospitalName, String firstName, String lastName, int age, String gender, String houseName, String communityName, int zip, String cityName) {
        super(firstName, lastName, age, gender, houseName, communityName, zip, cityName);
        this.setHospitalName(hospitalName);
        this.setUserName(userName);
        this.setDoctorID(doctorID);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public String getHospitalName(){
        return hospitalName;
    }

    public void setHospitalName(String hospital) {
        this.hospitalName = hospital;
    }
    
}

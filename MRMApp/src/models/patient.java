/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author kcsar
 */
public class patient extends person{
    
    private String username;
    private String password;
    private String hospitalName;
    
    public patient(String username, String password, String hospitalName, String firstName, String lastName, int age, String gender, String houseName, String communityName, int zip, String cityName) {
        super(firstName, lastName, age, gender, houseName, communityName, zip, cityName);
        this.setUsername(username);
        this.setPassword(password);
        
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }


}

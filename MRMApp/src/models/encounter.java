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
public class encounter extends vitalSigns{
    private String patientName;
    private String doctorName;
    private Date date;
    private int patientID;
    private int doctorID;
    private String hospitalName;


    public encounter(String patientName, String doctorName,String hospitalName, Date date, int patientID, int doctorID, float bloodPressure, float heartRate, float temperature) {
        super(bloodPressure, heartRate, temperature);
        this.setPatientName(patientName);
        this.setDoctorName(doctorName);
        this.setDate(date);
        this.setPatientID(patientID);
        this.setDoctorID(doctorID);
        this.setHospitalName(hospitalName);
    }



    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }
    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
}

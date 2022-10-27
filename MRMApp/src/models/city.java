/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import static mrmapp.MRMApp.cities;

/**
 *
 * @author kcsar
 */
public class city {
    private String cityName;

    public city(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String name) {
        this.cityName = cityName;
    }
    public static void addCity(String city){
        cities.add(city);
    }
}
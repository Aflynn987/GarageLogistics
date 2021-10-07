/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garagecars;

/**
 * SecondHandCars.java
 * @author Aaron - x19404024
 * 03/01/2021
 */
public class SecondHandCars extends GarageCars {
    // Variables
    // Int
    private int currentMileage;
    
    // Default Constructor
    public SecondHandCars(){
        super();
        currentMileage = 0;
    }
    
    // Overloaded Constructor
    public SecondHandCars(int currentMileage, String make, String registration, double price){
        super(make, registration, price);
        this.currentMileage = currentMileage;
    }

    // Getters & Setters
    // Get Current Mileage
    public int getCurrentMileage() {
        return currentMileage;
    }

    // Set Current Mileage
    public void setCurrentMileage(int currentMileage) {
        this.currentMileage = currentMileage;
    }
     
}

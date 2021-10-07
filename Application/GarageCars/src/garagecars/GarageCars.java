/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garagecars;

/**
 * GarageCars.java
 * @author Aaron - x19404024
 * 03/01/2021
 */
public class GarageCars {
    // Variables
    // String
    protected String make;
    protected String registration;
    // Double
    protected double price;
    
    // Overloaded Constructor
    public GarageCars(String make, String registration, double price) {
        this.make = make;
        this.registration = registration;
        this.price = price;
    }
    
    // Default Constructor
    public GarageCars(){
        make = " ";
        registration = "";
        price = 0.0;
    }

    // Getters & Setters
    // Get Car Make
    public String getMake() {
        return make;
    }

    // Set Car Make
    public void setMake(String make) {
        this.make = make;
    }

    // Get car Registration
    public String getRegistration() {
        return registration;
    }

    // Set car Registration
    public void setRegistration(String registration) {
        this.registration = registration;
    }

    // Get car Price
    public double getPrice() {
        return price;
    }

    // Set car Price
    public void setPrice(double price) {
        this.price = price;
    }
    
    
            
            
            
}

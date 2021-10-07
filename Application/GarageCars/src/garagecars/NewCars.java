/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garagecars;

/**
 * NewCars.java
 * @author Aaron - x19404024
 * 03/01/2021
 */
public class NewCars extends GarageCars {
    // Variables
    // Double
    private double VRT;
 
    // Default Constructor
    public NewCars(){
        super();
        VRT = 0.0;
    }
    
    
    // Overloaded Constructor
    public NewCars(double VRT, String make, String registration, double price){
        super(make, registration, price);
        this.VRT = VRT;
    }

    // Getters & Setters
    // Get VRT
    public double getVRT() {
        return VRT;
    }

    // Set VRT
    public void setVRT(double VRT) {
        this.VRT = VRT;
    }
   
    
}

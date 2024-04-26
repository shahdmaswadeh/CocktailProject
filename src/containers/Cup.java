/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package containers;

import java.util.ArrayList;
import ingredients.Ingredient;
import ingredients.Color;

/**
 *
 * @author عسثق
 */
public abstract class Cup extends Container {
    
   
    private double numberOfCups;
    private double price;
    
    //sizes are : small (250 ml) , medium (350 ml) , large (450 ml);

    public Cup( double price, double capacity, String name, Cocktail cocktail,double numberOfCups) {
        super(capacity, name, cocktail);
        this.numberOfCups=numberOfCups;
       
        this.price = price;
    }

   

    

   

    public double getNumberOfCups() {
        return numberOfCups;
    }

    public void setNumberOfCups(double numberOfCups) {
        this.numberOfCups = numberOfCups;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
    public String getInfo()
    {
        return super.getInfo()+"\nPrice: "+price;
    }
    
    
    
    
    
   
    
    
}

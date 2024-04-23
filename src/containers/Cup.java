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
    
    private double price ;
    private int numberOfCups;
    
    //sizes are : small (250 ml) , medium (350 ml) , large (450 ml);

    public Cup(double price, int numberOfCups, double capacity, String name, double cocktailVolume, Cocktail cocktail) {
        super(capacity, name, cocktailVolume, cocktail);
        this.price = price;
        this.numberOfCups = numberOfCups;
    }

    

  
    
    
    
    
    

    
    
    
}

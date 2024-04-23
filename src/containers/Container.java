/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package containers;
import ingredients.Color;

/**
 *
 * @author عسثق
 */
public abstract class Container {
    private double capacity;
    private String name;
    private double cocktailVolume;
    private Cocktail cocktail;

    public double getCapacity() {
        return capacity;
    }

    
    
    public  abstract double getTotalCalories();
    
    public double getTotalVolume()
    {
         //umimplemented yet 
        
        return cocktailVolume;
    }
    
    public Color getCocktailColor()
    {
        //umimplemented yet
        Color c =new Color(1,1,1);
        return c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCocktailVolume() {
        return cocktailVolume;
    }

    public void setCocktailVolume(double cocktailVolume) {
        this.cocktailVolume = cocktailVolume;
    }
    
    
    
    
    
    public String getInfo()
    {
        return "Name : "+this.name+"\nCapacity :"+this.capacity;
    }
    
   
    
    
    
}

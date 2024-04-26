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
    private Cocktail cocktail;

    public Container(double capacity, String name, Cocktail cocktail) {
        this.capacity = capacity;
        this.name = name;
        this.cocktail = cocktail;
    }

   
    
    public Container()
    {
        
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getCocktailColor() {
        return cocktail.getColor();
    }
    
    public String getColorString()
    {
        return "("+cocktail.getColor().getRed()+" , "+cocktail.getColor().getGreen()+" , "+cocktail.getColor().getBlue()+")" ;
    }
    
    public double getCocktailCalories() {
        return cocktail.getCalories();
    }
    
    public double getCocktailVolume() {
        return cocktail.getVolume();
    }
    
   

    public void setCocktailVolume(double volume) {
        this.cocktail.setVolume(volume);
    }
    
     public void setCocktailCalories(double calories) {
        this.cocktail.setCalories(calories);
    }
     
      public void setCocktailColor(Color color) {
        this.cocktail.setColor(color);
    }
    
    

    
    
    
    public String getInfo()
    {
        return "Name : "+this.name+"\nCapacity :"+this.capacity;
    }
    
   
    
    
    
}

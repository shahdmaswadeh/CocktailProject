/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ingredients;
import containers.Blender;

/**
 *
 * @author عسثق
 */
public abstract class Ingredient {
    private String name;
    private double calories;

    public Ingredient(String name, double calories) {
        this.name = name;
        this.calories = calories;
    }
    //comment
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }
    public void addToBlender(Blender b)
    {
        
        b.addIngredient(this);
    }
    
   public String getInfo()
   {
       return "Name : "+this.name+"\nCalories : "+this.calories;
   }

   
    

    
    
    
    
}

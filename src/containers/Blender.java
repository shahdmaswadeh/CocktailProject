/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package containers;

import containers.Cocktail;
import java.util.ArrayList;

import ingredients.*;
import ingredients.Color;



/**
 *
 * @author عسثق
 */
public class Blender extends Container{
   
    boolean blended;
    
    ArrayList<Ingredient>ingredientList=new ArrayList();
    
    
//constructor 
    
    public Blender()
    {
        
        
    }
    
    public Blender(boolean blended, Cocktail cocktail, double capacity, String name, double cocktailVolume) {
        super(2000, "Blender", 0, new Cocktail());
        this.blended = blended;
        
    }
    
   
    
//setter and getters

   
    

    

    public ArrayList<Ingredient> getIngredientList() {
        return ingredientList;
    }

    public void setIngredientList(ArrayList<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    }
    
    
 //the rest methods    
    public void addIngredient(Ingredient ingredient)
    {
        ingredientList.add(ingredient);
    }
    
     public void addIngredient(ColoredIngredient ingredient)
    {
        ingredientList.add(ingredient);
    }
    
    
    public void blend()
    {
        blended=true;
        //before that we calculate the resulting color ,volume and calories 
        super.setCocktail(new Cocktail(new Color(1,1,1),123,123));
        //here we intialize a new cocktail object 
        
    }
    
    public void pour(Cup cup)
    {
        
    }
    
    public String getInfo()
    {
        if(blended == false)
          return "Capacity : "+this.getCapacity()+"Ingredients :"+ingredientList;
        else 
            return "Capacity : "+this.getCapacity()+"\nIngredients :"+ingredientList+"\nColor : "+getCocktailColor();
   
    }

    @Override
    public Color getCocktailColor() {
        return new Color(1,1,1); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public double getTotalVolume() {
        return 5; //rated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    public double getTotalCalories(){
        return 6;
    }
    
    

    
    
}

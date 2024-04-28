/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package containers;

import containers.Cocktail;
import java.util.ArrayList;
import liquids.*;
import exceptions.*;

import ingredients.*;




/**
 *
 * @author عسثق
 */
public class Blender extends Container{
   
    private boolean blended;
    private int coloredIngredientCount=0;
    
    
    ArrayList<Ingredient>ingredientList=new ArrayList();
    //ArrayList<ColoredIngredient>coloredIngredientList=new ArrayList();
    
//constructor 
    
    //the capacity is always 2000 ml 
    
    
    public Blender() {
        super(2000, "Blender", new Cocktail());
        this.blended = false;
    }

   

   
    
//setter and getters

   
    

    

    public ArrayList<Ingredient> getIngredientList() {
        return ingredientList;
    }

   
    
    
 //the rest methods    
    public void addIngredient(Ingredient ingredient) throws BlenderOverFlowException
    {
        if(ingredient instanceof ColoredIngredient)
        {
            if(this.getCapacity()-this.getCocktailVolume() < ((ColoredIngredient)ingredient).getVolume())
                throw new BlenderOverFlowException();
            else
            {
            ingredientList.add(ingredient);
            coloredIngredientCount++;
            this.setCocktailVolume(getCocktailVolume()+((ColoredIngredient)ingredient).getVolume());
            
            }
                
        }
        else
        {
            ingredientList.add(ingredient);
        }
        
       this.setCocktailCalories(getCocktailCalories()+ingredient.getCalories());
        
       
       
            
    }
    

    
    
    public void blend()throws BlenderIsEmptyException
    {
        if(isEmpty())
            throw new BlenderIsEmptyException();
        blended=true;
        
        double redSum=0,greenSum=0,blueSum=0;
        
        
        
        
        for(Ingredient i: ingredientList)
        {
             if(i instanceof ColoredIngredient)
             {
             redSum+=((ColoredIngredient)i).getColor().getRed();
             greenSum+=((ColoredIngredient)i).getColor().getGreen();
             blueSum+=((ColoredIngredient)i).getColor().getBlue(); 
             double finalRed=redSum/coloredIngredientCount;
             double finalGreen=greenSum/coloredIngredientCount;
             double finalBlue=blueSum/coloredIngredientCount;
       
             setCocktailColor(new Color(finalRed,finalGreen,finalBlue));
             
             }
        }
        
    }
    
    
    
    public Cup pour(Cup cup) throws Exception
    {
        
        
       
        

        
        //1- if the blender is empty it throws an exception
          if(isEmpty())
          {
             throw new BlenderIsEmptyException();
             
          }
          //if the cocktail volume is larger than the cup:
          
          else if(getCocktailVolume() > cup.getCapacity()){
              //cocktail volume in cup = the cup's capacity
              cup.setCocktailVolume(cup.getCapacity());
              //calculate calories in the cocktail cup
              cup.setCocktailCalories(cup.getCapacity()*(this.getCocktailCalories()/this.getCocktailVolume()));
              //reduce the volume in the blender
             this.setCocktailVolume(this.getCocktailVolume()- cup.getCapacity());
              //throe an exception
              throw new CupOverFlowException();
              
          }
          //if the cocktail is smaller than the cup size 
          else {
              //the volume & calories in the cup are same in the blender 
              cup.setCocktailVolume(this.getCocktailVolume());
              cup.setCocktailCalories(this.getCocktailCalories());
              //blender is now empty 
              this.setCocktailVolume(0);
              this.setCocktailCalories(0);
              
          }
           
      return cup;  
    }
    
    @Override
    public String getInfo()
    {
      
        { 
//       info="Blender info :/nCapacity :"+getCapacity()+"\nIngredients :\n [";
//       for(Ingredient i:ingredientList)
//       {
//           info+=i.getName()+" , ";
//       }
//       for(ColoredIngredient c:coloredIngredientList)
//       {
//           info+=c.getName()+" , ";
//       }
//       info+=" ]\nCalories :"+this.getCocktailCalories()+"\nVolume :"+this.getCocktailVolume();
//       
//       
//       
//       if(blended ==true)
//           info+=getCocktailColor();
        }
String info="Ingredients: \nFruits: \n";

        for (int i=0;i<ingredientList.size();++i)
        {
            if (ingredientList.get(i) instanceof Liquid)
                info+="\nLiquids: \n";
            else if (ingredientList.get(i) instanceof toppings.Toppings)
            {        
                info+="\nToppings: \n";
                
            }
            else if (ingredientList.get(i) instanceof Sugar)
                continue;
           info+=ingredientList.get(i).getName()+"  ";
        }
       
    if(blended ==true)
         info+=this.getColorString();
   
   return info;
    }

   
public boolean isEmpty()
{
    return this.getCocktailVolume()==0;
}

    @Override
    public String getColorString() {
        if(!isEmpty())
           return super.getColorString(); 
        else
            return"No Color to display";
    }
    
    
    
   
    
    

    
    
}

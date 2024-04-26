/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package containers;

import containers.Cocktail;
import java.util.ArrayList;
import liquids.*;
import exceptions.BlenderIsEmptyException;

import ingredients.*;




/**
 *
 * @author عسثق
 */
public class Blender extends Container{
   
    boolean blended;
    
    ArrayList<Ingredient>ingredientList=new ArrayList();
    ArrayList<ColoredIngredient>coloredIngredientList=new ArrayList();
    
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
    public void addIngredient(Ingredient ingredient)
    {
        //for the ingredients without volume and color
        ingredientList.add(ingredient);
         this.setCocktailCalories(getCocktailCalories()+ingredient.getCalories());
            
    }
    
     public void addIngredient(ColoredIngredient ingredient)
    {
        //for colored ingredients 
        coloredIngredientList.add(ingredient);
        this.setCocktailVolume(getCocktailVolume()+ingredient.getVolume());
        this.setCocktailCalories(getCocktailCalories()+ingredient.getCalories());
    }
    
    
    public void blend()
    {
        blended=true;
        
        double redSum=0,greenSum=0,blueSum=0;
        
        
        
        
        for(ColoredIngredient c:coloredIngredientList)
        {
             
             redSum+=c.getColor().getRed();
             greenSum+=c.getColor().getGreen();
             blueSum+=c.getColor().getBlue();    
        }
        double finalRed=redSum/coloredIngredientList.size();
        double finalGreen=greenSum/coloredIngredientList.size();
        double finalBlue=blueSum/coloredIngredientList.size();
       
        setCocktailColor(new Color(finalRed,finalGreen,finalBlue));
    }
    
    public void pour(int size) throws BlenderIsEmptyException
    {
        Cup cup;
        double no;
        if(size ==1 )
        { no=SmallCup.getCupCapacity();
           cup = new SmallCup(no);}
         else if (size == 2)
         {no=MediumCup.getCupCapacity();
           cup = new MediumCup(no);}
           else
             {no=LargeCup.getCupCapacity();
           cup = new LargeCup(no);}
        
        
          if(isEmpty())
          {
             throw new BlenderIsEmptyException(); 
          }
           
        
        
        
        
        
        
        
        
        
        
        
        
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
         info+=getCocktailColor();
   
   return info;
    }

   
public boolean isEmpty()
{
    return this.getCocktailVolume()==0;
}
    
    
    
   
    
    

    
    
}

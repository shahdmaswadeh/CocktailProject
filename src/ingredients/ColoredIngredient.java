/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ingredients;

import containers.Blender;
import exceptions.BlenderOverFlowException;

/**
 *
 * @author عسثق
 */
public abstract class ColoredIngredient extends Ingredient {
    private Color color;
    private double volume;

    public ColoredIngredient(Color color, double volume, String name, double calories) {
        super(name, calories);
        this.color = color;
        this.volume = volume;
    }

   

    

    public Color getColor() {
        return color;
    }

    @Override
    public void addToBlender(Blender b) throws BlenderOverFlowException {
        
        if(this.volume> b.getCapacity()-b.getCocktailVolume())
            throw new BlenderOverFlowException();
        else
            super.addToBlender(b); 
    }
    
    

    

    public double getVolume() {
        return volume;
    }

  

    @Override
    public String getInfo() {
        return super.getInfo()+"\nColor : "+this.color+"\nVolume : "+this.volume;
    }
    
    
    
    
    
    
    
}

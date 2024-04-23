/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ingredients;

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

    

    public double getVolume() {
        return volume;
    }

  

    @Override
    public String getInfo() {
        return super.getInfo()+"\nColor : "+this.color+"\nVolume : "+this.volume;
    }
    
    
    
    
    
    
    
}

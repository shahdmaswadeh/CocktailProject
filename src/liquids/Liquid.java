/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package liquids;
import ingredients.Color;
import ingredients.ColoredIngredient;

/**
 *
 * @author عسثق
 */
public abstract class Liquid extends ColoredIngredient {

    public Liquid(Color color, String name, double calories) {
        super(color, 250, name, calories);
    }
    
    
    
}

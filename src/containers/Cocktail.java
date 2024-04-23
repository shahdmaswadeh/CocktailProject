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
public class Cocktail {
    private Color color;
    private double calories;
    private double volume;

    public Cocktail(Color color, double calories, double volume) {
        this.color = color;
        this.calories = calories;
        this.volume = volume;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    
    public String getInfo()
    {
        return "Calories : "+this.calories+"\nVolume : "+this.volume +"\nColor : "+this.color;
    }
    
    
}

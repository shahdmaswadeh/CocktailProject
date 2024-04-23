/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fruits;

import ingredients.Color;

/**
 *
 * @author عسثق
 */
public class Watermelon extends Fruits {

    public Watermelon(   int amount) {
        super(new Color(238,193,172), VOLUMES[amount-1],"Watermelon", amount*30, amount);
    }

    

   @Override
    public String getInfo()
    {
        return super.getInfo();
    }
    
}

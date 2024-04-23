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
public class Strawberry extends Fruits{

    public Strawberry(  int amount) {
        super(new Color(204,0,0), VOLUMES[amount-1], "Strawberry", amount*32, amount);
    }

    
    
    
    @Override
    public String getInfo()
    {
        return super.getInfo();
    }
}

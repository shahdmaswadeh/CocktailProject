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
public class Apple extends Fruits{

    public Apple( int amount) {
        super(new Color(245, 245, 220) , VOLUMES[amount-1], "Apple", amount*30 , amount);
    }

    

   
    @Override
    public String getInfo()
    {
        return super.getInfo();
    }
}

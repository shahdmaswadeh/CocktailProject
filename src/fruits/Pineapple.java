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
public class Pineapple extends Fruits{

    public Pineapple( int amount) {
        super(new Color(255, 255, 153), VOLUMES[amount-1], "Pineapple", amount*50, amount);
    }

    

   
    @Override
    public String getInfo()
    {
        return super.getInfo();
    }
    
}

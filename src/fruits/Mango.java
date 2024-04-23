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
public class Mango extends Fruits{

    public Mango(   int amount) {
        super(new Color(255, 190, 11), VOLUMES[amount-1], "Mango", amount*50, amount);
    }

    @Override
    public String getInfo()
    {
        return super.getInfo();
    }

   
    
}

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
public class Orange extends Fruits{

    public Orange(  int amount) {
        super(new Color(237, 162, 107), VOLUMES[amount-1], "Orange", amount*47, amount);
    }

    
   @Override
    public String getInfo()
    {
        return super.getInfo();
    }
    
    
}

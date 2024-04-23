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
public class Blueberry extends Fruits {

    public Blueberry(  int amount) {
        super(new Color(148, 87, 155), VOLUMES[amount-1], "Blueberry", amount*25, amount);
    }

    
   
    @Override
    public String getInfo()
    {
        return super.getInfo();
    }
    
}

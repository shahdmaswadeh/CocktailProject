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
public class Raspberry extends Fruits{

    public Raspberry(  int amount) {
        super(new Color(222, 121, 130), VOLUMES[amount-1], "Roseberry", amount*25, amount);
    }

    

  
    
    @Override
    public String getInfo()
    {
        return super.getInfo();
    }
    
}

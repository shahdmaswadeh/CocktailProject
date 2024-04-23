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
public class Dates extends Fruits {

    public Dates(  int amount) {
        super(new Color(223, 181, 130), VOLUMES[amount-1], "Data", amount*130, amount);
    }

    

    
    @Override
    public String getInfo()
    {
        return super.getInfo();
    }
    
}

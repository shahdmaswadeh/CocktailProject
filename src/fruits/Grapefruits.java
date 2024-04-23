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
public class Grapefruits extends Fruits {

    public Grapefruits(  int amount) {
        super(new Color (214, 192, 208), VOLUMES[amount-1], "Grape fruits", amount*39, amount);
    }

   
   
   
    @Override
    public String getInfo()
    {
        return super.getInfo();
    }
}

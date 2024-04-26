/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package containers;

/**
 *
 * @author عسثق
 */
public class LargeCup extends Cup{

    public LargeCup(double numberOfCups ) {
        super( numberOfCups*15, 450, "Large cup", new Cocktail(),numberOfCups);
    }
    
    public static double getCupCapacity()
    {
        return 450;
    }

   
    

    

    

   

   
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package containers;

/**
 *
 * @author عسثق
 */
public class SmallCup extends Cup{
      

    public SmallCup(double numberOfCups ) {
        super( numberOfCups*5, 250, "Small cup", new Cocktail(),numberOfCups);
    }
     
     public static double getCupCapacity()
    {
        return 250;
    }
   
    
      
}

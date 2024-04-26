/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package containers;

/**
 *
 * @author عسثق
 */
public class MediumCup extends Cup{
    

     public MediumCup(double numberOfCups ) {
        super( numberOfCups*10, 350, "Medium cup", new Cocktail(),numberOfCups);
    }
     
     public static double getCupCapacity()
    {
        return 350;
    }

   
      
}

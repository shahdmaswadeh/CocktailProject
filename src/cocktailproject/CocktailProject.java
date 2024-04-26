/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cocktailproject;
import java.util.Scanner;
import containers.*;
import ingredients.*;
import fruits.*;
import exceptions.*;
import liquids.*;
import toppings.*;
/**
 *
 * @author عسثق
 */
public class CocktailProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        //Define a Scanner variable 
        Scanner input = new Scanner (System.in);
        //Define a blender
        
        Blender blender=new Blender();
        Cup cup;
        double totalPrice=0,totalCalories=0;
        
         
        
       
        
        
        
        //Welcome
        System.out.println("Welcome to our shop\nWe have the best Cocktails EVER!");
        System.out.println("What fruis do you want to add to your cocktail ?\n- Enter the number of the fruit then (1 for small amount 2 for normal or 3 for Extra :");
        
        System.out.println("You can add up to 10 fruits !");
        
        //a vraiable to choose fruits
        int pickItem;
        int pickAmount;
        try{
        //Display the Fruits menu
         System.out.println("""
                           Fruits menu:
                           1-Banan  
                           2-Apple 
                           3-Blueberry
                           4-Dates
                           5-Grapefruit
                           6-Mango
                           7-Orange
                           8-Pineapple
                           9-Roseberry
                           10-Strawberry
                           11-Watermelon
                           12-FINISH
                      
                           """);
         
        
        for(int i=0;i<10;++i){       
        
        
         pickItem=input.nextInt();
         if(pickItem == 12)break;
         pickAmount=input.nextInt();
         
        //a switch to add ingredient
        switch(pickItem)
        {
            case 1:
                blender.addIngredient(new Banana(pickAmount));
                break;
                case 2:
                blender.addIngredient(new Apple(pickAmount));
                break;
                case 3:
                blender.addIngredient(new Blueberry(pickAmount));
                break;
                case 4:
                blender.addIngredient(new Dates(pickAmount));
                break;
                case 5:
                blender.addIngredient(new Grapefruits(pickAmount));
                break;
                case 6:
                blender.addIngredient(new Mango(pickAmount));
                break;
                case 7:
                blender.addIngredient(new Orange(pickAmount));
                break;
                case 8:
                blender.addIngredient(new Pineapple(pickAmount));
                break;
                case 9:
                blender.addIngredient(new Roseberry(pickAmount));
                break;
                case 10:
                blender.addIngredient(new Strawberry(pickAmount));
                break;
                case 11:
                blender.addIngredient(new Watermelon(pickAmount));
                break;
                default:
                    System.out.println("Wrong number , Try again .");
                    i--;
                
               
              
                
                
        }
        }
         
         
         System.out.println(blender.getInfo());
        
       
        
        System.out.println("You want your cocktail with :");
        System.out.println("""
                           1-Dairy Milk
                           2-Almont Milk
                           3-Oat Milk 
                           4-Orange juice 
                           5-Lemon Juice
                           6-FINISH
                           """);
       
             pickItem=input.nextInt();
           
            //A swich to add ingredient 
           
                switch(pickItem)
                {
                        case 1:
                        blender.addIngredient(new DairyMilk() );
                        break;
                        case 2:
                        blender.addIngredient(new AlmondMilk() );
                        break;
                        case 3:
                        blender.addIngredient(new OatMilk() );
                        break;
                        case 4:
                        blender.addIngredient(new OrangeJuice() );
                        break;
                        case 5:
                        blender.addIngredient(new LemonJuice() );
                        break;
                        case 6:
                        break;
                }
            
            
            System.out.println("How many cubes of sugar you want to add?");
             pickItem=input.nextInt();
             
             //add ingradient 
             blender.addIngredient(new Sugar(pickItem));
             
             
             
             System.out.println("What toppings you would like to add ?");
             System.out.println("""
                                Toppings :
                                1-Whipped cream
                                2-Caramel
                                3-Chocolate sause
                                4-Coconut flakes
                                5-Sprinkles
                                6-Cherry
                                7-Finish
                                """);
             
            
             while(true){
                 pickItem=input.nextInt();
                 
                if(pickItem == 7)break;
               
                 switch(pickItem)
                 {
                     case 1:
                         blender.addIngredient(new WhippedCream());
                         break;
                         case 2:
                         blender.addIngredient(new Caramel());
                         break;
                         case 3:
                         blender.addIngredient(new ChocolateSause());
                         break;
                         case 4:
                         blender.addIngredient(new CoconutFlakes());
                         break;
                         case 5:
                         blender.addIngredient(new Sprinkles());
                         break;
                         case 6:
                         blender.addIngredient(new Cherry());
                         break;
                         default:
                             System.out.println(" The entered number is wrong!");
                         break;
                 }
                 
                
                    
             }
             
           }
        catch (BlenderOverFlowException ex)
        {
            ex.getMessage();
        }
        
        blender.blend();
             
        try{
             System.out.println("Choose the cup size you want :");
             System.out.println("""
                                1-Small
                                2-Medium
                                3-Large
                                """);
             
               pickItem=input.nextInt();
               
            cup=blender.pour(pickItem);
            totalPrice=cup.getPrice();
            totalCalories=cup.getCocktailCalories();
        }
        catch(CupOverFlowException ex1)
        {
            ex1.getMessage();
        }
        catch(BlenderIsEmptyException ex2)
        {
            ex2.getMessage();
        }
        
            

       
        System.out.println("Thank you for visiting us ! ");
        System.out.println("That will be"+totalPrice+"\nCalories :"+totalCalories+"\nColor :"+blender.getColorString());
        
        
        
        
        
        
        
 
    }
    
}

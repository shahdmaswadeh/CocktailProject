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
import java.time.LocalDate;
import java.time.LocalTime;
import historylog.*;

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
        Scanner input = new Scanner(System.in);
        //Define a blender

        Blender blender = new Blender();

        //define a cup 
        Cup cup;
        double totalPrice = 0, totalCalories = 0;
        int pickItem = 0;

        Logger fLogger = new FileLogger("HistoryFile");

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

       
            DataBaseLoggerTwo dbLogger = new DataBaseLoggerTwo();
            dbLogger.logDB("sssss");
        
        System.out.println("Date : " + date + "\nTime : " + time);

        fLogger.log("\nStarted in : " + date + "  at : " + time);

        //Welcome
        System.out.println("Welcome to our shop \"Everything FruitFull !\"\nWe have the best Cocktails EVER!");

        do {

            System.out.println("Date : " + date + "\nTime : " + time);

            System.out.println("\n\nwhat kind of drink would you like to order?\n1.Order from Everything FruitFull menu. \n2. Make Your Signature Cocktail. ");
            int menuCoice;
            menuCoice = input.nextInt();

            switch (menuCoice) {

                case 1: {
                    int drinkChoice;
                    int cupSizeChoice;
                    String readyDrinksMenu = """
                                 
                                 
                          Choose one of our special ready-made drinks:
                          1. Strawberry Shake
                          2. Mango Smoothie
                          3. Fruitfull Drink (Our Special)
                          4. Vanilla Shake
                          5. Chocolate Shake
                          6. Galactic Mix
                          7. Wizard's Brew
                          Enter your choice:
                          """;

                    String cupSizeMenu = """
                             Select the cup size:
                             1. Small
                             2. Medium
                             3. Large
                             Enter your choice:
                             """;

                    System.out.println(readyDrinksMenu);
                    drinkChoice = input.nextInt();

                    System.out.println(cupSizeMenu);
                    cupSizeChoice = input.nextInt();

                    String color = "";
                    String name = "";

                    switch (drinkChoice) {
                        case 1:
                            name = "Strawberry Shake";
                            color = "255, 182, 193";
                            totalCalories = 200;
                            fLogger.log("\nStrawberry shake choosen ");
                            break;
                        case 2:
                            name = "Mango Smoothie";
                            color = "255, 215, 0";
                            totalCalories = 250;
                            break;
                        case 3:
                            name = "Fruitful Drink (Our Special)";
                            color = "255, 105, 180";
                            totalCalories = 320;
                            break;
                        case 4:
                            name = "Vanilla Shake";
                            color = "255, 253, 208";
                            totalCalories = 180;
                            break;
                        case 5:
                            name = "Chocolate Shake";
                            color = "210, 105, 30";
                            totalCalories = 300;
                            break;
                        case 6:
                            name = "Galactic Mix";
                            color = "44, 58, 71";
                            totalCalories = 290;
                            break;
                        case 7:
                            name = "Wizard's Brew";
                            color = "138, 43, 226";
                            totalCalories = 260;
                            break;
                        default:
                            System.out.println("Invalid choice. Please select from the menu options.");
                            input.close();
                            break;
                    }

                    switch (cupSizeChoice) {
                        case 1: // Small
                            totalPrice = 5;
                            totalCalories *= 0.75;
                            break;
                        case 2: // Medium
                            totalPrice = 10;
                            totalCalories *= 1.0;
                            break;
                        case 3: // Large
                            totalPrice = 15;
                            totalCalories *= 1.25;
                            break;
                        default:
                            System.out.println("Invalid cup size selected.");
                            input.close();
                            return;
                    }
//        
//                System.out.println("Tnak you for visiting us !");
//                System.out.println("\nThat will be : "+totalPrice+"\n");
//                
                    System.out.println("You selected " + name + ".");
                    System.out.println("Color: (" + color + ")");
                    System.out.println("Calories: " + Math.round(totalCalories)); // Rounded to nearest whole number
                    System.out.println("Price: " + totalPrice);

                    break;
                }

                case 2: {
                    System.out.println("What fruis do you want to add to your cocktail ?\n- Enter the number of the fruit then (1 for small amount 2 for normal or 3 for Extra :");

                    System.out.println("You can add up to 10 fruits !");

                    //a vraiable to choose fruits
                    int pickAmount;
                    try {
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

                        for (int i = 0; i < 10; ++i) {

                            pickItem = input.nextInt();
                            if (pickItem == 12) {
                                break;
                            }
                            pickAmount = input.nextInt();

                            //a switch to add ingredient
                            switch (pickItem) {
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

                        pickItem = input.nextInt();

                        //A swich to add ingredient 
                        switch (pickItem) {
                            case 1:
                                blender.addIngredient(new DairyMilk());
                                break;
                            case 2:
                                blender.addIngredient(new AlmondMilk());
                                break;
                            case 3:
                                blender.addIngredient(new OatMilk());
                                break;
                            case 4:
                                blender.addIngredient(new OrangeJuice());
                                break;
                            case 5:
                                blender.addIngredient(new LemonJuice());
                                break;
                            case 6:
                                break;
                        }

                        System.out.println("How many cubes of sugar you want to add?");
                        pickItem = input.nextInt();

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

                        while (true) {
                            pickItem = input.nextInt();

                            if (pickItem == 7) {
                                break;
                            }

                            switch (pickItem) {
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

                    } catch (BlenderOverFlowException ex) {
                        ex.getMessage();
                        System.out.println(ex.getMessage());
                    }

                    System.out.println("Choose the cup size you want :");
                    System.out.println("""
                                1-Small
                                2-Medium
                                3-Large
                                """);

                    pickItem = input.nextInt();

                    double no;
                    switch (pickItem) {
                        case 1:
                            no = blender.getCocktailVolume() / SmallCup.getCupCapacity();
                            cup = new SmallCup(no);
                            break;
                        case 2:
                            no = blender.getCocktailVolume() / MediumCup.getCupCapacity();
                            cup = new MediumCup(no);
                            break;
                        default:
                            no = blender.getCocktailVolume() / LargeCup.getCupCapacity();
                            cup = new LargeCup(no);
                            break;
                    }
                    try {

                        blender.blend();

                        cup = blender.pour(cup);

                    } catch (CupOverFlowException ex1) {

                        System.out.println(ex1.getMessage());
                    } catch (BlenderIsEmptyException ex2) {

                        System.out.println(ex2.getMessage());
                    }

                    System.out.println(cup.getPrice());
                    totalPrice = cup.getPrice();
                    System.out.println(cup.getCocktailCalories());
                    totalCalories = cup.getCocktailCalories();

                    System.out.println("\n\nThank you for visiting us ! ");
                    System.out.println("That will be" + totalPrice + "\nCalories :" + totalCalories + "\nColor :" + blender.getColorString());

                    System.out.print("Please rate our service (1-5 stars): ");
                    int rating = input.nextInt();
                    while (rating < 1 || rating > 5) {
                        System.out.print("Invalid input. Please enter a rating from 1 to 5 stars: ");
                        rating = input.nextInt();
                    }

                    System.out.println("Thank you for rating our sevice !");

                }
            }
            System.out.println("\n\n Do you want to order another Cocktail? (1-Yes , 2-No)");
            pickItem = input.nextInt();

        } while (pickItem != 2);

    }

}

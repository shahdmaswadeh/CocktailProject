/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ingredients;

/**
 *
 * @author عسثق
 */
public class Sugar extends Ingredient {

    private int numberOfCubes;

    public Sugar(int numberOfCubes, double calories) {
        super("Sugar", numberOfCubes*20);
        //the calories in one sugar cube are almost 20 cal
        this.numberOfCubes = numberOfCubes;
    }

    public int getNumberOfCubes() {
        return numberOfCubes;
    }

    public void setNumberOfCubes(int numberOfCubes) {
        this.numberOfCubes = numberOfCubes;
    }
    
    
    
    @Override
    public String getInfo() {
        return super.getInfo()+"Number of cubes : "+this.numberOfCubes; 
    }
    

    
    
    
}

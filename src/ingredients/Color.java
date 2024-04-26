/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ingredients;

/**
 *
 * @author عسثق
 */
public class Color {
    private double R,G,B;

    public Color(double R, double G, double B) {
        this.R = R;
        this.G = G;
        this.B = B;
    }

    public void setColor(double R, double G, double B)
    {
        this.R = R;
        this.G = G;
        this.B = B;
    }
    
    public Color getColor()
    {
        return this;
    }
    
    public double getRed()
    {
        return R;
    } 
    public double getGreen()
    {
        return G;
    }
    public double getBlue()
    {
        return B;
    }
    

    
    
    
       
}

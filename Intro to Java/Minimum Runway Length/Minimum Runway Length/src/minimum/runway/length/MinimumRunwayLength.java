/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimum.runway.length;

import java.util.Scanner;

/**
 *
 * @author Cyberfaour
 */
public class MinimumRunwayLength {

    /**
     * @param args the command line arguments
     */
    //this program represents the velocity relation with distance and accelartion to find the minimum required length of a runway
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("PLease enter values = ");
        
        
        double velocity = input.nextDouble();//take the speed of the plane eg.
        double acceleration = input.nextDouble();//it's accelartion
        if (acceleration >0){//check if a is positive
            double length = (velocity*velocity)/(2*acceleration); //we can substitute this with Math.pow(velocity,2)/(2*accelartion)
            System.out.println("the minimum runway length needed for a take off is " + Math.round(length) +" meters");
        }
        else System.out.println("cant compute negative values");
        }
        
    
    
}

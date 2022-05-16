/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compute.area;

import java.util.Scanner;

/**
 *
 * @author Cyberfaour
 */
public class ComputeArea {

    /**
     * @param args the command line arguments
     */
    //the goal of this program is to compute the area of give values
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);//create object of type scanner
        System.out.println("please enter radius ="); 
       
        double radius = input.nextDouble();//store inserted radius value
        if ( radius > 0) {//check if the radius is positive
            double area = 3.14159 * radius * radius; //multiply the radius by itself and pi 
                                                     //alternateviley we can use Math.PI * Math.pow(radius,2)
            System.out.println("The area of the circle w. radius "+radius+" is " +area);
            }
        else System.out.println("Can not compute area of a zero or negative value");
        
    }
    //we can also implement the parameter of the corcle by 2pi*r and let the user choose
    
}

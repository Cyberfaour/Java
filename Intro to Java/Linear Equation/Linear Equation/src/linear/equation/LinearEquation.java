/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linear.equation;

import java.util.Scanner;

/**
 *
 * @author Cyberfaour
 */
public class LinearEquation {

    /**
     * @param args the command line arguments
     */
    // goal of this program is to find the solutions of x and y by using user input variables
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in); //create an object of type Scanner
        System.out.print("enter the values of a,b,c,d,e,f : "); 
        
        double a= input.nextDouble();//take values from the user
        double b= input.nextDouble();
        double c= input.nextDouble();
        double d=input.nextDouble();
        double e= input.nextDouble();
        double f= input.nextDouble();
        double v= ((a*d)-(b*c)); // v will be equal to (a*b) -(b*c)
        double x = ((e*d)-(b*f))/v; // similar to v but we devide by v
        double y = ((a*f)-(e*c))/v;
        
       if (v==0){
           System.out.println("this equation has no solution."); // here we check whether v is zero or not if yes there is no solution
       }
       else{
           System.out.println("x is "+x+" and y is "+y);// if no print out the values of x and y
       }
    }
    
}

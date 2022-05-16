/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadratic.equation;

import java.util.Scanner;

/**
 *
 * @author Cyberfaour
 */
public class QuadraticEquation {

    /**
     * @param args 
     */
    //the goal of this program is to find the nb of the roots available for a user input values 
    public static void main(String[] args) {
        Scanner input= new Scanner  (System.in);  //we create an object of type scanner so we can take input from the user
        System.out.println("please enter values of a,b,c respectively");
        
        double a = input.nextDouble();//these will take 3 values from the user and save them in variables a,b,c
        double b= input.nextDouble();
        double c = input.nextDouble();
        // in order to compute the roots we first find delta 
        double  delta = b * b - (4* a * c);   // b*b equals b squared, for simplicity we used this method. it is more adivised to use Math.pow(b,2)
        double r1 = (- b + Math.sqrt(delta)) / (2 * a);  // proceed to plugg in the value delta into the rest of the equation
        double r2 = (- b - Math.sqrt(delta)) / (2 * a);
        if(delta > 0) {// check if delata is positive 
        System.out.println  ("this equation has two roots x = " +r1 + " and x = " + r2);//if yes print the two roots
        }
        else if (delta == 0 ){
            System.out.println("this equation as a double root x = "+r1);//if it is zero print only 1 root since it is double
        }
        else{
        System.out.println("this equation has no roots");//if it is negative print no roots available
             }
       }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetics.of.integer.value;

import java.util.Scanner;

/**
 *
 * @author Cyberfaour
 */
public class ArithmeticsOfIntegerValue {

    /**
     * @param args the command line arguments
     */
    //the goal here is to use them modulo as a technique in seperating the inserted value and adding those seperated values eg. 1234 
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Please enter a 4 digit integer : ");// insert the value consisting 4 digits we  use if statments to get accuracy and interactivy
        int x= input.nextInt(); // the value will be saved as x
        
        if (x>= -9999 && x<= 9999){ //check if x is larger or smaller than the limit 
            
        int a, b, c, d; // these values represent the elements of the inserted values
        
        a = x / 1000; //we get the thousands digit a=1
        x = x % 1000; // remove the thousands digit from x so xnew=234
        
        b = x / 100; //we get the hundreds digit b=2  
        x = x % 100;// we get the hundreds digit removed xnew=34
        
        c = x / 10; //we get the tenth digit c=3
        x = x % 10; // remove the tenth digit xnew=4
        
        d = x;  // assign x into d since its ones digit then it doesnt need and other operations
        int Sum = a + b  ;  //add a and b
        int Sub = c - d;// sub c and d
        int Div = Sum / Sub; //divide sum and sub
        int Mul=Sum*Sub;
        
        System.out.println(a + "+" + b + "=" +Sum); // print the values 
        System.out.println(c + "-" + d+ "= "+Sub);
        System.out.println(Sum + "/" +Sub+ "=" + Div);
        System.out.println(Sum + "*" +Sub+ "=" + Mul);
        }
        else{
            System.out.println("Inserted value is greater than +/- 9999");
        } 
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessing.sum.game;

import java.util.Scanner;

/**
 *
 * @author Cyberfaour
 */
public class GuessingSumGame {

    /**
     * @param args the command line arguments
     */
    //a small guessing game
    public static void main(String[] args) {
        int number1= (int) (Math.random() * 100) ;   //generate a random number between 0 and 100
        int number2= (int)(Math.random() * 100);
        int number3= (int)(Math.random() *100) ;
       
        
        Scanner input= new Scanner (System.in); //ask the user for an answer
        
        System.out.println("what is the sum of " + number1+ "+ " + number2+ " + "+number3+ " ?" );
        
        double answer = input.nextDouble();
        System.out.println(number1+ " + " + number2+ " + " + number3+ " = " + answer+ " is "+ (number1+number2+number3==answer)); //print whther its a true or false answer 
        
        if(answer != number1+ number2+number3){//if the answer is false print the true answer
        
            double Sum =  number1+number2+number3;
        
        System.out.println("the answer is = " + Sum) ; 
        }
        else{
            System.out.println("congratulations its correct!!!! ");
        } 
    }
    
}

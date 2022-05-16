/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anual.rate;

import java.util.Scanner;

/**
 *
 * @author Cyberfaour
 */
public class AnualRate {

    /**
     * @param args the command line arguments
     */
    // goal of this program is to compute the anual rate of interest after depositing money
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);// create an object of type Scaner
        System.out.print("Please enter the amount to be deposited : "); // ask the user to insert values
        double P = input.nextDouble();
        System.out.print("Please enter the anual interest (%) : ");
        double R = input.nextDouble();
        System.out.print("Please enter the number of months for the amount to be deposited : ");
        double T = input.nextDouble();
        
        double I= P * R * (T/12); //investment= P*R P stands for principal amount and R for anual interest
        
        System.out.println("The total interest over "+ T+" is : "+I); //print the Total interest
        
        double A = P + I; //calculate Anuity
        System.out.println("The final amount of interest is : " + A);// print the Anuity of the deposited money
        }      
      }

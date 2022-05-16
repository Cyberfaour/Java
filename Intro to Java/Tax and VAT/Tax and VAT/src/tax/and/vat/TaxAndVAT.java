/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tax.and.vat;

import java.util.Scanner;

/**
 *
 * @author Cyberfaour
 */
public class TaxAndVAT {

    /**
     * @param args the command line arguments
     */
    //the goal of this program is to compute Taxs and VATs and SUM of products represenitng a receipt
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);// create object with type Scanner
       
        System.out.print("Please enter the unit prices of the  products : " );//ask the user to insert the prices of 3 products
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z= input.nextDouble();
        double VAT= 0.1; 
        double TVAT= x * VAT + y * VAT + z * VAT; // total vat= price1 *VAT + price2 *VAT + price2 *VAT
        
        System.out.print("The value of VAT is :\n" + Math.round(TVAT)+"$\n"); //print the final VAT of the products
        double x1= x + (x * VAT);// new prices will be updated with the values x1 
        double y1= y + (y * VAT);//y1
        double z1= z + (z * VAT);//z1
        System.out.print("The new prices after VAT are : \n"+ x1+"$ "+y1+"$ "+z1+"$\n");// print the new prices
        
        double sum ;
        sum= x1 + y1 + z1;
        
        System.out.print("The total price is : \n"+Math.round(sum)+"$\n");// print the sum of the prices
       
    }
    
}

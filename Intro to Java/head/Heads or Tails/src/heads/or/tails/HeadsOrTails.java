/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heads.or.tails;

import java.util.Scanner;

/**
 *
 * @author Cyberfaour
 */
public class HeadsOrTails {

    /**
     * @param args the command line arguments
     */
    //a basic heads or tails game winning 2/3
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);//create an object of type scanner
        int wins =0,losses=0,pcwins=0,pclosses=0;
        
        for(int i=0;i<3;i++){
            System.out.print("Enter 0 for heads or 1 for tails :"); //ask the user to insert 0 for heads or 1 for tails
            int userGuess = input.nextInt();
            System.out.println("Flipping coin....");
            int result=(int)(Math.random());
            if(result==userGuess){
                wins++;
                pclosses++;
                System.out.println("Correct! your wins:"+wins+" pc :"+pcwins);
             }
            else{
                losses++;
                pcwins++;
                System.out.println("Ooops you lose!your score:"+losses+" pc score:"+pcwins);
                }
          }
        if(pcwins>wins){
            System.out.println("You lose... better luck next time!");
            System.out.println("Final score:\nPlayer\tPC\nwins:"+wins+"\twins:"+pcwins+"\nlosses:"+losses+"\tlosses"+pclosses);}
        else{
            System.out.println("You win!Humans>PCs");
            System.out.println("Final score:\nPlayer\tPC\nwins:"+wins+"\twins:"+pcwins+"\n\tlosses:"+losses+"losses"+pclosses);
    }
    }
}

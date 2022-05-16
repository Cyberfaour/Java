/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package average.speed.in.miles;

/**
 *
 * @author Cyberfaour
 */
public class AverageSpeedInMiles {

    /**
     * @param args the command line arguments
     */
    // the goal of this program is to convert the average speed of a hardcoded value from km to miles
    public static void main(String[] args) {
       double time = 45.0/60 + 60.0/(60*60) ;
       double km = 14;
       double miles= 1.6;
       double Aspeedm = (miles * km)/time ;
       
        System.out.println("the average speed in miles per hours is "+Math.ceil(Aspeedm)+" miles per hour");
    }
    //you can be more creative and add more features like allowing the user to insert the speed etc or letting the user chose which conversion they'd like
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consonants.vs.vowels;

import java.util.Scanner;

/**
 *
 * @author Cyberfaour
 */
public class ConsonantsVsVowels {

    /**
     * @param args the command line arguments
     */
    //the goal here is to seperate the characters of a inserted char and check whether this char is a vowela dn consonant
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Please insert letter : ");
         char letter = input.next().charAt(0); //check the first char 
         
        switch (letter) {   //check the letter whether low or upper case and determine the character 
            case 'a':
            case 'A':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println(letter+ " is a vowel ");
                break;
            case 'b':
            case 'B':
            case 'c':
            case 'C':
            case 'd':
            case 'D':
            case 'f':
            case 'F':
            case 'g':
            case 'G':
            case 'h':
            case 'H':
            case 'k':
            case 'K':
            case 'l':
            case 'L':
            case 'm':
            case 'M':
            case 'n':
            case 'N':
            case 'p':
            case 'P':
            case 'Q':
            case 'q':
            case 'r':
            case 'R':
            case 's':
            case 'S':
            case 't':
            case 'T':
            case 'v':
            case 'V':
            case 'w':
            case 'W':
            case 'y':
            case 'Y':
            case 'X':
            case 'x':
            case 'z':
            case 'Z':
                System.out.println(letter+ " is a consonant");
                break;
            default:
                System.out.println("No match");
                break;
        }
                 
    }
    
}

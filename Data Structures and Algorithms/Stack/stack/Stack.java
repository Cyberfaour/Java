/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author Cyberfaour
 */
public class Stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayStack Stack=new ArrayStack(10);
        Stack.printContent();
        for(int i=0;i<9;i++){
            Stack.push(i);
        }
        
        Stack.printContent();
        for(int i=0;i<4;i++)
            Stack.pop();
        
        Stack.printContent();
        
    }
    
}

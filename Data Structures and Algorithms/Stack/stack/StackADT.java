/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *this interface plays the role of an API representing the stack
 * 
 * @author Cyberfaour
 * @param <E>
 */
public interface StackADT <E>{
    /**
     * returns the number of elements in the stack
     * @return number of elements in stack
     **/
    int size();
    
    /**
     * tests the stack if it's empty
     * @return check whether stack is empty or has elements     
     **/
    boolean isEmpty();
    
    /**
     * inserts an element at the top of the stack
     * @param e the element to be inserted  
     **/
    void push(E e);
    /**/

    /**
     *returns the element on the top of the stack
     * @return top element of stack
     */

    E top();
    

    /**
     *removes the top element from the stack
     * @return removes the top element of the stack
     */

    E pop();
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

/**
 *
 * @author Cyberfaour
 * @param <E>
 */
public interface Position<E>{

    /**
     * returns the element stored at this position
     * @return the stored statement
     * @throws IllegalStateException
     */
    public E getElement() throws IllegalStateException;
    
    
}

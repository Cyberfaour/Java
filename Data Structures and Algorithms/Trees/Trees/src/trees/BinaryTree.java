/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

/**
 *
 * @author Cyberfaour
 */
public interface BinaryTree<E> extends Tree<E>{
  /**
     *Returns the Position of p's left child (or null if no child exists).
     * @param p
     * @return
     * @throws IllegalArgumentException
     */
   public Position<E> left(Position<E>p) throws IllegalArgumentException;
   

    /**
     *
     * Returns the Position of p's right child (or null if no child exists).
     * @param p
     * @return
     * @throws IllegalArgumentException
     */

  public  Position<E> right(Position<E>p)throws IllegalArgumentException;

    /**
     *Returns the Position of p's sibling (or null if no sibling exists).
     * @param p
     * @return
     * @throws IllegalArgumentException
     */
    public Position<E> sibling(Position<E>p)throws IllegalArgumentException;
    
}

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
public interface PositionList<E> {

    /**
     * return the number of elements
     * @return size
     */
    public int size();
    
    

    /**
     *
     * @return Tests whether the list is empty.
     */

    public boolean isEmpty();
    

    /**
     *
     * @return Returns the first Position in the list (or null, if empty)
     */

    public Position<E>first();
   

    /**
     *
     * @return Returns the last Position in the list (or null, if empty).
     */

    public Position<E>last();
    

    /**
     *
     * @param p
     * @return Returns the Position immediately before Position p (or null, if p is first).
     * @throws IllegalStateException
     */

    public Position<E> before(Position<E>p)throws IllegalStateException;


    /**
     *
     * @param p
     * @return Returns the Position immediately after Position p (or null, if p is last).
     * @throws IllegalStateException
     */

    public Position<E> after(Position<E>p)throws IllegalStateException;
    

    /**
     *
     * @return Inserts element e at the front of the list and returns its new Position.
     */

    public Position<E> addFirst();
    

    /**
     *
     * @return Inserts element e at the back of the list and returns its new Position. *
     */

    public Position<E> addLast();
    /**/

    /**
     *
     * @param p
     * @param e
     * @return adds an element before position p
     * 
     */

    public Position<E> addBefore(Position<E>p,E e);
    /**/

    /**
     *
     * @param p
     * @param e
     * @return returns an element right after the position p
     * 
     */

    public Position<E> addAfter(Position<E> p,E e);
    
    /**
     *
     * @param p
     * @param e
     * @return replaces an element stored at position p and the returns the replaced element
     * @throws IllegalArgumentException
     */

    public E set(Position<E>p,E e)throws IllegalArgumentException;
    
    /**
     *
     * @param p
     * @return removes the element at position p
     * @throws IllegalArgumentException
     */
    public E remove(Position<E>p)throws IllegalArgumentException;
            }

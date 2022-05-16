/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queues;

/**
 *
 * @author Cyberfaour
 * @param <E>
 */
public interface Queue<E>{
 
    /**
     * return number of the elements in the queue
     * @return Size of the queue
     */
    public int size(); 
   
    /**
     *check if the queue is empty
     * @return checks if the queue is empty
     */
    public boolean isEmpty();
    
    /**
     *inserts into the queue an element e
     * @param e
     */
    public void enqueue(E e);
    
    /**
     *returns the first element in the queue
     * @return the first element of the queue
     */
    public E first();
    
    /**
     *
     * @return removes the first element in the queue
     */
    public  E dequeue();
    
}

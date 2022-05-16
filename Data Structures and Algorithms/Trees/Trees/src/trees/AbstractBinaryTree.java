/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cyberfaour
 */
public abstract class AbstractBinaryTree<E> extends AbstractTree<E>implements BinaryTree<E> {
   /**
    * return the the position of p's sibling. or null if no sibling exists
    */
    @Override
    public Position<E> sibling(Position<E>p){
        Position<E> parent=parent(p);   //p is the root
        if(parent==null) return null;   
        if(p==left(parent)) return right(parent);// if p is the left child return the right of the root
        else return left(parent); //if p is not return the left of the root;
    }
     
    /**
     *return the number of children of position p
     */
    @Override
    public int numChildren(Position<E>p){
        int count=0;
        if(left(p)!=null) count++; //check if theres an element on both sides and add a counter representing the children
        if(right(p)!=null)count++;
        return count;
       }
    
    /*
        return an iterable collection position represening p's children
    */
    
    @Override
    public Iterable<Position<E>> children(Position<E>p){
        List<Position<E>> snapshot=new ArrayList<>(2);
        if(left(p)!=null)
            snapshot.add(left(p));
        if(right(p)!=null)
            snapshot.add(right(p));
        return snapshot;
        
    }
}

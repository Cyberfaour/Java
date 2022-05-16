/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

import java.util.Iterator;



/**
 *
 * @author Cyberfaour
 */
public class LinkedBinaryTree<E> extends AbstractBinaryTree<E> {

    
    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterable<Position<E>> positons() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
    //nested Node class
    protected static class Node<E> implements Position<E>{
            
        private E element;  //store the element 
        private Node<E> parent; //refrence to the parent node 
        private Node<E> left;//refrence to the left child
        private Node<E> right;//refrence to the right child
        //constructor of a node having the element and the neightbors
        public Node(E e,Node<E>above,Node<E>leftChild,Node<E>rightChild){
            element=e;
            parent=above;
            left=leftChild;
            right=rightChild;
            
        }
       //accessor methods
       public E getElement(){return element;}
       public Node<E> getParent(){return parent;} 
       public Node<E> getLeft(){ return left;}
       public Node<E> getRight(){return right;}
       //updating methods
       public void setElement(E e) {element=e;}
       public void setParent(Node<E> parentNode){parent=parentNode;}
       public void setLeft(Node<E> leftChild){left=leftChild;}
       public void setRight(Node<E>rightChild){right=rightChild;}
       
      
       
    }
    Node<E>c;
    /*node constructor that will create a node and store the elements with its arguments
       */

    /**
     *
     * @param e
     * @param parent
     * @param left
     * @param right
     * @return
     */

       protected  Node<E>createNode(E e,Node<E>parent,Node<E>left,Node<E>right){
           return new Node<E>(e,parent,left,right);
       }
       //variables
       protected Node<E>root=null; //root of the tree
       private int size=0;//number of nodes in the tree 
       
       //constructor
     public LinkedBinaryTree(){}
     
     //non public methods
     //check the position of a node and returns it as a node
     protected Node<E> validate(Position<E>p)throws IllegalArgumentException{
         if(!(p instanceof Node )) //check if the position is an instance of Node type if not return not a valid type
             throw new IllegalArgumentException("Not valid Position Type");
         Node<E>node=(Node<E>)p; //case p as a node
         if(node.getParent()==node) //check if parent of the node (position p) if they are equal meaning p isnt in the tree
             throw new IllegalArgumentException("position p is no longer in the tree");
         return node;
         
     }
     
     public int size() {return size;}
     
     public Position<E>root(){
         return root;
         
     }
     /**
      * return the parent of p
     */
     public Position<E>parent(Position<E>p)throws IllegalArgumentException{
         Node<E> node=validate(p);
         return node.getParent();
     }
     /**
      * return the left child of p
     */
     public Position<E>left(Position<E>p)throws IllegalArgumentException{
         Node<E> node=validate(p);
         return node.getLeft();
     }
     /**
      * return the right child of p
     */
     public Position<E>right(Position<E>p)throws IllegalArgumentException{
         Node<E> node=validate(p);
         return node.getRight();
     }
     /**
      * places an element e at the root of an empty tree and return new Position
      */
    public Position<E>addRoot(E e)throws IllegalStateException{
        if(!isEmpty())throw new IllegalStateException("Tree is not empty");
        root=createNode(e, null, null, null);
        size=1;
        return root;
    }
    /**
     * Adds a child to the left of the Position p
     */
    public Position<E>addLeft(Position<E>p,E e)throws IllegalArgumentException{
        Node<E>parent=validate(p);
        if(parent.getLeft()!=null)
            throw new IllegalArgumentException("p already is left child");
        Node<E> child=createNode(e, parent, null, null);
        parent.setLeft(child);
        size++;
        return child;
        
    }
    /**
     * adds a child to the right of the Position p
     */
    public Position<E>addright(Position<E>p,E e)throws IllegalArgumentException{
        Node<E>parent=validate(p);
        if(parent.getRight()!=null)
            throw new IllegalArgumentException("p already is right child");
        Node<E> child=createNode(e, parent, null, null);
        parent.setRight(child);
        size++;
        return child;
        
    }
    /**
     * replaces element of position p with a new element and returns the old one
     */
    public E set(Position<E>p,E e)throws IllegalArgumentException{
        Node<E>node=validate(p);
        E temp=node.getElement();
        node.setElement(e);
        return temp;
    }
    /**
     * Attaches trees t1 and t2 as left and right subtrees of external p
     */
    public void  attach(Position<E>p,LinkedBinaryTree<E>t1,LinkedBinaryTree<E>t2)throws IllegalArgumentException{
        Node<E>node=validate(p);
        if(isInternal(p)) throw new IllegalArgumentException("p must be leaf");
        size+=t1.size()+t2.size();
        if(!t1.isEmpty()){
            t1.root.setParent(node);
            node.setLeft(t1.root);
            t1.root=null;
            t1.size=0;
        }
        if(!t2.isEmpty()){
            t2.root.setParent(node);
            node.setRight(t2.root);
            t2.root=null;
            t2.size=0;
        }
    }
        public E remove(Position<E>p)throws IllegalArgumentException{
            Node<E>node=validate(p);
            if(numChildren(p)==2)throw new IllegalArgumentException("p has two children");
            Node<E>child=(node.getLeft()!=null ? node.getLeft():node.getRight()); //the child will equal every value of left with respect to its right sibling if its not equal to null
            if(child!=null) child.setParent(node.getParent());//childs grandparent becomes parent
            if(node==root) root=child; //child is now a root
            else{//come here incase the p has less than 2 childreno or children are null or node doesnt equal to the root
                Node<E> parent=node.getParent();
                if(node==parent.getLeft()) //check ift he node does equal to the left of the parent of it 
                    parent.setLeft(child); //if yes set to the left the child which is the left of the node we first declared
                else parent.setRight(child); //if not then put it to the right
            }
            size--;
            E temp=node.getElement();
            node.setElement(null);
            node.setLeft(null);
            node.setRight(null);
            node.setParent(null);
            return temp;
            
        }
        
        public void preorder(Position<E>p){
           
           
            for(Position<E> child :children(p)){
                preorder(child);
            }
           }
        public void postrder(Position<E>p){
             for(Position<E> child :children(p)){
                postrder(child);
            }
            System.out.println(p);
        }
            
        public void inorder(Position<E>p){
            if(left(p)!=null)
                inorder(left(p));
            System.out.println(p);
            if(right(p)!=null)
                inorder(p);
            
        }
        public void print(Position<E>p){
            if(left(p)!=null)
                inorder(left(p));
            System.out.println(p.getElement());
            if(right(p)!=null)
                inorder(right(p));
            
            
        }
        
    
     
}

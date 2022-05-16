
package linkedlists;


public class CLL<E> {
    private static class Node<E>{   // nested class that creates an object Node with genric data
        private final E element;          //input data
        private Node<E> next;       //node that will be a part of the main Node sub node? that referes to the next element Node
        public Node(E e,Node<E>n){  //constructor taking the data e and the second next node as a param
            element =e;     //the element is the object
            next=n;         // the next is the second object
        }
        public E getElement(){  
            return element;
        }
        public Node<E> getNext(){
            return next;
        }
        public void setNext(Node<E>n){
            next=n;
        }
    }
    private Node<E> tail=null;
    private int size=0;
    public CLL(){}
    
    public int size(){return size;}
    
    public boolean isEmpty(){return size==0;}
    
    public E first(){
    if(isEmpty())return null;
     return tail.getNext().getElement();
    }
    public E last(){
        if (isEmpty()) return null;
        return tail.getElement();
        
    }
    public void rotate(){
        if(tail!=null)tail=tail.getNext();
    }
    public void addFirst(E e){
        if(size==0) {
            tail=new Node<>(e,null);
            tail.setNext(tail);
        }
        else{
            Node<E> newNode=new Node<>(e,tail.getNext());
            tail.setNext(newNode);
        }
        size++;
    }
    public void addLast(E e){
        addFirst(e);
        tail=tail.getNext();
    }
    public E removefirst(){
        if(isEmpty()) return null;
        Node<E>head=tail.getNext();
        if(head==tail) tail=null;
        else tail.setNext(head.getNext());
        size--;
        return head.getElement();
    }
    
    public void print(){    
        if(isEmpty())
            System.out.println("This list is empty");
        else{
            System.out.println("Contents:\t");
            Node cur=tail;
            for(int i=0;i<size;i++){
                System.out.print(cur.getElement()+" --> ");
                cur=cur.getNext();
            }
    
        
    
}}}

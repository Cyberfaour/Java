
package linkedlists;


public class SLL<E>{    //here we create a generic singly linked list
    private static class Node<E>{   // nested class that creates an object Node with genric data
        private E element;          //input data
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
    private Node<E> head=null;      //the head of the first node is refering to null thus it's an empty list
    private Node<E> tail=null;      //node refers to and elemt with a "next" Node refgering to null thus it is the last node 
    private int size=0;             
    
    public SLL(){}    //constructor
     
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public E first(){   //check if it is empty if yes return null since it is empty
        if(isEmpty()){      //else return the Ndode "head" what element it refers to
            return null;
        }
        return head.getElement();
    }
    public E last(){   //check if it is empty if yes return null since it is empty
        if(isEmpty()){      //else return the Ndode "tail" what element it refers to
            return null;
        }
        return tail.getElement();
    }
    
    
    public void removeEvery(){
        
        for(int i=0;i<size;i+=2){
            
            E rmItem=head.getNext().getElement();
            System.out.println("-->"+rmItem);
            head.next=head.getNext().next;
            
            
        }
            
        
    }
    public void addFirst(E e){  //adding to at the front of the list
        head=new Node<>(e,head);// here the current head will refer to the new element and the new element will be assigned the head Node thus becoming first
        if(size==0) //check here if the list is empty if yes the tail will be equal to the head and the next node will refer to null
            tail=head;  
        size++;//increase the size by 1 if the list contains pre defined Nodes
    }
    public void addLast(E e){
        Node<E> newNode= new Node<>(e,null);// create a new Node that contains element e and the next will refer to the null thus becoming the tail Node
        if(isEmpty())
            head=newNode;      //if the list is already empty the head will be the newly created Node 
        else tail.setNext(newNode);//if it contains data put the newNode as a tail by setting 
                                   //the current tail.next to the newNode and the newNode's next to null becoming the new tail
        tail=newNode;   //reassiging the tail reference to the newNode
        size++;
    }
    public E removeFirst(){ 
        if(isEmpty())   //check if the list is empty    if yes return null
            return null;
        E rmElement=head.getElement();  //if not the removed element will be equal to the head.getElement getting the value of the head
        head=head.getNext();    //now the current head will refer to the next node element
        size--;         //decrease the size
        if(size==0)     //if the list is equal the tail is null
            tail=null;
        return rmElement;
    
    }
     public E removeLast(){ 
        if(isEmpty())   //check if the list is empty    if yes return null
            return null;
        E rmElement=tail.getElement();  //if not the removed element will be equal to the head.getElement getting the value of the head
        head=tail.getNext();    //now the current head will refer to the next node element
        size--;         //decrease the size
        if(size==0)     //if the list is equal the tail is null
            tail=null;
        return rmElement;
    
    }
    public void print(){    
        if(isEmpty())
            System.out.println("This list is empty");
        else{
            System.out.println("Contents:\t");
            Node cur=this.head;
            for(int i=0;i<size;i++){
                System.out.print(cur.getElement()+" --> ");
                cur=cur.getNext();
            }
        
        
        
        }
    }
    
    
    
    
}

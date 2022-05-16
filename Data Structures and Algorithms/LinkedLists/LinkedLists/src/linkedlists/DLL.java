
package linkedlists;


public class DLL<E>{
    private static class Node<E>{
        private E element;   
        private Node<E> prev;//additionally to the SLL we use a prev node to refer to the previous Node with respect to the current Node
        private Node<E> next;
        public Node(E e,Node<E> p,Node<E>n){//Node Constructor consider 
            element =e;
            prev=p;
            next=n;
         }
        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getPrev() {
            return prev;
        }
        public Node<E> getNext() {
            return next;
        }
        public void setPrev(Node<E> p) {
            this.prev = p;
        }
        public void setNext(Node<E> n) {
            this.next = n;
        }
       }
    private Node<E> header;
    private Node<E> trailer;
    private int size=0;
    
    public DLL(){
        header=new Node<>(null,null,null);  // param1= e param2= previous param3=next   
        trailer=new Node<>(null,header,null);
        header.setNext(trailer);
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public E first(){
        if(isEmpty())
            return null;
        return header.getNext().getElement();
        
    }
    public E last(){
        if(isEmpty()) return null;
        return trailer.getPrev().getElement();
    }
    public void addNode(E e,Node<E> predeccessor,Node<E> successor){
        Node<E> newNode= new Node<>(e,predeccessor,successor);
        predeccessor.setNext(newNode);
        successor.setPrev(newNode);
        size++;
    }
    public void addFirst(E e){
        addNode(e,header,header.getNext());// the header will ow point towards the next node
        
    }
    public void addLast(E e){
        addNode(e,trailer.getPrev(),trailer);
        
    }
    /* Method to add a node at the specified position in the list*/
    
    
    public E removeFirst(){
        if(isEmpty()) return null;
        return remove(header.getNext());
    }
    public E removeLast(){
        if(isEmpty()) return null;
        return remove(trailer.getPrev());
        
    }
    public E remove(Node<E> node){
        Node<E> predecessor=node.getPrev();
        Node<E> successor=node.getNext();
        predecessor.setNext(successor);
        successor.setPrev(predecessor);
        size--;
        return node.getElement();
        
    }
    public void print(){    
        if(isEmpty())
            System.out.println("This list is empty");
        else{
            System.out.println("Contents:\t");
            Node cur=header;
            for(int i=0;i<size;i++){
                System.out.print(cur.getElement()+" --> ");
                cur=cur.getNext();
            }
    
    
    
}}}

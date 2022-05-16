/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author Cyberfaour
 * @param <E>
 */
public class ArrayStack <E> implements StackADT<E>{
   public static final int Capacity=1000;// default array capacity
   private E[]data;
   private  int t=-1;//top element of the stack the reson behind this because we took arr[0] as the bottom cell
   public ArrayStack(){}//default constructor for stack
   
   public ArrayStack(int capacity){
       data=(E[])new Object[capacity];// constructs a stack witha give length;
   }
   @Override
   public int size(){
       return (t+1);    
   }
   @Override
   public boolean isEmpty(){
       return (t==-1); //return if zero since t=-1 +1 ==>0 thus empty
   }
   
   @Override
   public void push(E e)throws IllegalStateException{//insert an elemement on top of the stack
       if(size()==data.length) throw new IllegalStateException("Stack is full");
       data[++t]=e;
   }
   @Override
   public E top(){
       if(isEmpty()) return null;
       return data[t];
   }
   @Override
   public E pop(){
       if(isEmpty())return null;
       E answer=data[t];
       data[t]=null;
       t--;
       return answer;
   }
   public void printContent(){// Prints all info about arraylist size/length/space left and elemnts and indeces
       if(!isEmpty()){
       System.out.println("Index :\t\tElement :\t");
       for(int i=data.length;i>=0;i--)
           System.out.println((i)+"\t\t"+data[i]+ "\t");
       System.out.println("\n");
   }
      else {System.out.println("Stack is Empty\n");}
      System.out.println("Size:\t"+size() +"\tavailable space out of total space :\t" + (data.length-size())+"/"+data.length+"\n");
   }
       
   
}

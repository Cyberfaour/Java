/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queues;

/**
 *
 * @author Cyberfaour
 */
public class ArrayQueue<E> implements Queue<E>{
    private E data[];
    private int f=0;
    private int sz=0;

    public ArrayQueue() {
        
    }

    
    public ArrayQueue(int capacity) {
        data=(E[]) new Object[capacity];
    }
    @Override
    public int size() {
        return sz;
    }
    public int length(){
        return data.length;
    }
    @Override
    public boolean isEmpty() {
        return (sz==0);
    }

    @Override
    public void enqueue(E e) throws IllegalStateException{
        if(sz==data.length) throw new IllegalStateException("Queue is full!");
        int avail=(f+sz)%data.length;
        data[avail]=e;
        sz++;
    }

    @Override
    public E first() {
        if(isEmpty())return null;
        return data[f];
    }

    @Override
    public E dequeue() {
       if(isEmpty()) return null;
       E answer=data[f];
       data[f]=null;
       f=(f+1)% data.length;
        sz--;
       return answer;
    }
    private int countNull(){
        int c=0;
        for(int i=0;i<sz;i++){
            if(data[i]==null)
                c++;
            
        }
        return c++;
            
    }
    
    public void printContent(){
        if(sz>0){
            System.out.print("Index:\t\t");
            for(int i=0;i<data.length;i++)
                System.out.print(i+"\t");
            System.out.println();
            System.out.print("Elements:\t");
            for(int i=0;i<data.length;i++){
                System.out.print(data[i]+"\t");
            }
            System.out.println("\n");
           // int x=size()-countNull();
            System.out.println("Size:\t"+size()+"\tavailable space out of total space :\t" + (data.length-size())+"/"+data.length+"\n");
        }
        else{
            System.out.println("Queue is Empty!");
            System.out.println("Size:\t"+size() +"\tavailable space out of total space :\t" + (data.length-sz)+"/"+data.length+"\n");
        }
    }
}

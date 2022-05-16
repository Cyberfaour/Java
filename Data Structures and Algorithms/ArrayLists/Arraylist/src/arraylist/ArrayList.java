/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

/**
 *
 * @author Cyberfaour
 */
public class ArrayList <E>{ //declaration of a generic arrayList
    private E[] data;
    private  static final int dCapacity=10;
    private int size=0;
    private int capacity;
    
   public ArrayList(){
       data=(E[]) new Object[dCapacity];    //constructor with default arraylist capacity of 10;
       this.capacity=dCapacity;
   }
   public ArrayList(int InitialCapacity){   //constructor wiuth custom capacity
       if(InitialCapacity==0){              //check here if parameter == zero if yes create an array with capacity of 100;
           data=(E[]) new Object[100];
           
       }
       data=(E[]) new Object[InitialCapacity];
       
   }
    //************methods****************
   public int getSize(){       //get the size of the arraylist
       return size;
   }
private void Expand(){    //Expands the length capacity of the array by 2
        E[] newData=(E[]) new Object[data.length*2]; //copy data from list one to two
        for(int i=0;i<data.length;i++){
           newData[i]=data[i];
         }
        System.out.println("ArayList Expanded\n");
        data=newData;
   }
   private void Resize(){// resize the array to the default size
       E[] newData=(E[]) new Object[size+10]; //copy data from list one to two
        
        System.out.println("ArayList Resized\n");
        data=newData;
   }
   
   public void ensureCapacity(int min){    //Expands the length capacity of the array by adding the min nb of elements needed
       if(size==data.length || data.length-size<min ){
       E[] newData=(E[]) new Object[data.length+min]; //copy data from list one to two
       for(int i=0;i<data.length;i++){
           newData[i]=data[i];
         }
        data=newData;
       }
      else System.out.println("There is enough space to add "+min+" more elements");
   }
   public boolean isEmpty(){        //check if size is zero thus empty or not
       return size==0;
   }
   
   public void clear(){    //set size to zero and decrease the length of the array to orignal length
       this.size=0;
       Resize();
   }
   public boolean Contains(Object o){  //check if data at iteration i is equal to object e .if yes return true if not return false 
       for(int i=0;i<data.length;i++){
           if(data[i]==o)
            return true;
       }
       return false;
   }
    public E getAtIndex(int index) throws Exception{ //returns an expection if index exceeds the arraylist's size or returns the data[index]
       if(size==0|| index<0|| index>data.length)
           throw new ArrayIndexOutOfBoundsException("Please select an index between 0 and size-1");
           
       return data[index];
       
   } 
    public int indexOfKey(Object o){// return the index of the first occurance of the key
       for(int i=0;i<data.length;i++){
           if(data[i]==o){
               return i;
           }
         }
       return -1;
   }
    public int LastIndexKey(Object o){  //start in reverse to detect the last element
       for(int i=size;i>=0;i--){
            if(data[i]==o)
                  return i;
           }
         return -1;
   } 
    public E set(int index, E e){// replace an object with another 
       if(index<0 || index>=size){
           throw new ArrayIndexOutOfBoundsException("index "+index+" size " +getSize() );
       }
       return data[index]=e;
   }
    public ArrayList<E> sublist(int fromIndex,int toIndex){// create a sub list from orignal list between two indeces
       if(size!=0 &&size>0 ){
           ArrayList<E> x=new ArrayList();
        if(toIndex<size){
           for(int i=fromIndex;i<toIndex;i++){
                x.add(data[i]);
                
                }
            x.printInfo();
            }
       }
       return null;
   }
    public boolean add(E e) {            //this method will check whether there is place in data
        if(data.length==getSize()){             //if size is equal to maximum length
              System.out.println("Expanding ArrayList: ");
              Expand();
           
        }
        data[size++]=e;
        
        return true;
    }
    
    public void addAtIndex(int index,E e){  //this method is more complex than the required one
        if(index<1 ){
            // check here whether the index is negative if yes go and set the index to zero
           index=0;
           for(int i=size-1;i>=index;i--){         //shift the values to the right
               data[i+1]=data[i];
             }
           data[0]=e;  
           // the value at 0
         }
        else if(index>size){     // if the index is greater than the size call add
            add(e);
            size++;
        }
        else if(index>0 && index<size )   {//if the index is between zero and size add it at the index after shifting
            for(int i=size-1;i>=index;i--){
                data[i+1]=data[i];
            }
            data[index]=e;
            
           }
        }
      public void addAll(ArrayList<E> list) throws Exception{//add the arryalist to the curr arraylist
        ArrayList<E> arraylist=list;        //create a reference to the list
        E x;                                //Object e will carry the data and transfer them
        for(int i=0;i<arraylist.getSize();i++){ //x here is equal to every object at each iteration
           x=(E) arraylist.getAtIndex(i);
                if(x!=null){
                add(x);
            }
          }
      }
    public boolean remove(Object o){        //remove all objects equals to object
       for(int i=0;i<data.length;i++){
           if(data[i]==o){
               Object removedObject=o;
               data[i]=data[i+1];
               size--;
               return true;
           }
        }
       return false;
      }
     public boolean removeAll(ArrayList <E> list) throws Exception{//remove all elements from origanl list equal to the added list
       ArrayList<E> arraylist=list;     //check if the size doesnt equal to zero and if its negative to check if its empty
           E x;
        for(int i=0;i<arraylist.getSize();i++){
           x=(E) arraylist.getAtIndex(i);
                System.out.println(x);
                if(x!=null)
                 remove(x);
             }
        return false;
   }
     public E removeAtIndex(int index){// removes an item at index 
       E removedItem=data[index];   // generic variable equals data at index
       for(int i=index;i<data.length-1;i++){ //loop here from iteration 1 till it reaches data.length -1 since we didnt start from zero
           data[i]=data[i+1];               //shift to the empty space now 
            }  
       size--;          // decrease the size by 1
       return removedItem;      // return the removed item
   }
     public void removeEvery(){
     for(int i=size;i>=0;i--){
            E rmItem=data[i];
           // data[i+5]=data[i];
            
            System.out.println(rmItem);
            data[i]=data[i+1];
            data[i+1]=null;
//            for(int j=0;j<size;j++){
//                if(data[j]==null)
//                    data[j]=data[j+1];
//            
//            }
            }
     size--;
     
     }
     protected void removeRange(int fromIndex,int toIndex) throws Exception{ 
         //the for loop will start from the first index
         try{
        if(fromIndex>=0 && toIndex<=getSize()){
          E removedItem;
       for(int i=fromIndex;i<toIndex-1;i++){
           data[i]=data[toIndex+1];         //shift to the left
           removedItem=data[i];
           
                                //data from 1st index will be eqal to the value after last index 
             }
                 size-=(toIndex-fromIndex+1); //decrement the size by diffrance of the indeces and add 1
        }
       }
         
         catch(Exception e){
                 throw new ArrayIndexOutOfBoundsException("Cant remove items outisde size range");
         }
        
     
         }
     //********************************generic printing methods***********
     private void print(Object o){
       
       System.out.println("Index :\t");
       for(int i=0;i<size;i++)
           System.out.println((i)+"\t");
       
       System.out.println("\nElement :\t");
       for(int i=0;i<size;i++){
           System.out.println(data[i]+ "\t");
       }
       System.out.println("\n");
    
   }
   private void printContent(){// Prints all info about arraylist size/length/space left and elemnts and indeces
       if(size>0){
       System.out.println("Index :\t\tElement :\t");
       for(int i=0;i<size;i++)
           System.out.println((i)+"\t\t"+data[i]+ "\t");
       System.out.println("\n");
   }
      else {System.out.println("ArrayList is Empty\n");
      System.out.println("Size:\t"+getSize() +"\tavailable space out of total space :\t" + (data.length-size)+"/"+data.length+"\n");
   }
   }
   private void printSize(){
       if(size>0){
           System.out.println("Size:\t"+getSize() +"\tavailable space out of total space :\t" + (data.length-size)+"/"+data.length+"\n");
       }
   }
    public void printInfo(){
        printContent();
        System.out.println("\n");
        printSize();
    }
}

    
    
    


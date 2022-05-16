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
public class ArrayLsitTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
         //**********Creation of Arraylists section******
        ArrayList array1,array2,array3,list,arr;
        array1=new ArrayList();                  //creation of an arraylist with a max capacity of 10
        array1.printInfo();//print size
        array1.printInfo();                  //print content
        array2=new ArrayList(0);                // create an arraylist with a max capacity of 100
        array2.printInfo();                     //print size of array2
        array3=new ArrayList(15);               // creat an arraylist with a custom capacity of 15
        
        //**********Adding methods Testing*************
        System.out.println("Before inserting data:\n"); 
        array3.printInfo();              // print content of arrayList3
       
        System.out.println("\nAfter Inserting data:\n");
        int i=100;
        int x;
        while(i<115){   //for loop for inserting multiple data
            x=i;
            array3.add(x);
            i++;
        }
       array3.printInfo();
        
        int y=115;
        while(y<130){   //for loop for inserting multiple data
            x=y;
            array3.add(x);
            y++;
        }
        
        array3.printInfo();  //testing here the expand Functionality size here wll be 30
        
        array3.add(1); //if we add here on index 30 we have to expand again because size>30
        
        array3.printInfo();   
        list=new ArrayList(10);     //create new array list with size 10
        String [] z={"Ali","Bob","J","S","LIU"};    //string array for data input
        for(int count=0;count<z.length;count++){//inserting data into arraylist list
           list.add(z[count]);
        }
        list.printInfo();    //print content of array3
        System.out.println("Before inserting data:\n"); 
        array3.addAll(list);    //add
        array3.printInfo();
        System.out.println("\nAfter Inserting data:\n");
        array3.printInfo(); //prints size after insertion
         array3.addAtIndex(-1, 12);  //add at negative index
        array3.addAtIndex(40, 12);    //add at index 40
        array3.addAtIndex(10, 12);  //add in the middle
        array3.printInfo();    
        
        
       array3.clear(); //Clear arraylist        
       array3.printInfo();
       System.out.println("Does it contain :"+ array3.Contains(12)+"\n");
       array3.addAll(list);
       array3.addAll(list);
       array3.printInfo();
       
       array3.addAll(list);
       
//         array3.printInfo();
//       *********Adding Section ends here********
//       ********Start of removal Methods Section*****
        System.out.println("Before Rmoving Data \n");
        array3.printInfo();
        System.out.println("After removing object \n");
        array3.remove("LIU");
        array3.removeAll(list);
        array3.removeRange(0, 2);// will remove elements between 0 and 2
        array3.removeAll(list);// will remove elemnts equal to those of list if available
        array3.removeAtIndex(0); //will remove at the first object
        array3.printInfo();
       //*******Start of AUX methods**************
        System.out.println("first Index of Occurences:"+ 
                array3.indexOfKey("Bob") +"\t\tlast index of Occurance:"+ array3.LastIndexKey("Bob")); //will print the first occurance 
                                                                                                        //and last occurance of the element
        System.out.println("Sublist :\t ");                                                                                                
        array3.sublist(0, 10);  // here it will print a sublist of the main array
        System.out.println(array3.isEmpty()+"\n"); //check if its empty
        array3.clear();
        System.out.println(array3.isEmpty()+"\n"); //check if its empty
        array3.printInfo();
        array3.addAll(list);
        
        array3.printInfo();
        array3.ensureCapacity(5);
        array3.printInfo();
        array3.removeEvery();
        array3.printInfo();
    
    }
    
    
}

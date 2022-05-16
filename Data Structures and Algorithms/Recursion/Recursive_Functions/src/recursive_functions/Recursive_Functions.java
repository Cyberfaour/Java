/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursive_functions;

/**
 *
 * @author Cyberfaour
 */
public class Recursive_Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int d[]={0,1,2,3,4,5,6,7,8,9};//generic array of numbers for testing
//        System.out.println(linearSum(d,5));
//        
//        System.out.println(factorial(4));
//         reverseArray(d, d[0], 9);
//         
//       for(int i=0;i<d.length;i++)
//            System.out.print(d[i]+"\t");
//        
//        System.out.println("\n"+power(5, 4));
//        
//        double num=2;
//        System.out.println(powerFast(num,4));
//        
//        int n=7;
//        System.out.println(fibonacciBad(n));
//        
//         long[] x=fibonacci(n);
//        
//        for(int i=0;i<x.length;i++)
//            
//            System.out.print(x[i]+"\t");
//        
        TowersOfHanoi(3,"A", "B", "C");
//            String s="pots&pans";
//            reverseStr(s);
//            System.out.println(s);
        
    }
    

    /**
     *
     * @param data
     * @param n
     * @return this function will recursively add linearly element at n-1 
     */

    public static int linearSum(int data[],int n){ 
        if(n==0)//check if zero
            return 0;
        return linearSum(data, n-1)+data[n-1];//if not call the method with n decremented by 1 and the data[index-1]
    }
    /**/

    /**
     *
     * @param n
     * @return does the simplest form of recursion by applying factorial functions
     */

    public static int factorial(int n)throws IllegalArgumentException{
        if(n<0)
            throw new IllegalArgumentException();//if n is negative return a 1
        else if(n==0)//if it is equal to zero return 1
            return 1;
        else//else return n times the number before it
            return n*factorial(n-1); // n=4 fib=n!=4*3*2*1=24
    }
  

    /**
     * reverses the array 
     * @param data
     * @param low
     * @param high
     */
 
    public static void reverseArray(int data[],int low,int high){
        if(low<high){
            int temp=data[low];
            data[low]=data[high];
            data[high]=temp;
            reverseArray(data,low+1,high-1);
        }
    }
    /**/

    /**
     *
     * @param x
     * @param n
     * @return the power n for the number x 
     * Power function with complexity of O(n)
     */

   public static double power(double x,int n){ 
        if(n==0)
            return 1;
        else
            return x*power(x,n-1); // for n=4 and x =5 x*(x*x*x)=5*5*5|*5=625
    }
   
    /**
     *
     * @param x
     * @param n
     * @return this function will do a faster power operation with complexity of O(Logn)
     */

   public static double powerFast(double x,int n){
       if(n!=0) { //if its not zero
           double partial=powerFast(x,n/2); //get call the method with have the exponent eg. for x=2 and n=4 ==> n/2=4/2=2 2>0 n/2=1 so product=
           double product=partial*partial;
           if(n%2==1)
               product*=x;
           return product;
        } else return 1;
         
   }
   
   public static long fibonacciBad(int n){
       if(n<=1)
           return n;
       else{
       return fibonacciBad(n-2)+fibonacciBad(n-1);
   }}
   
   public static long[] fibonacci(int n){
       if(n<=1){
           long[] x={n,0};
           return x;
       }
       else{
           long[] temp=fibonacci(n-1);
           long[] x={temp[0]+temp[1],temp[0]};
           return x;
           
       }
       }
   
    /**
     * recursive function Towers of Hanoi
     * @param n
     * @param sourcePeg
     * @param auxPeg
     * @param destPeg
     */
    public static void TowersOfHanoi(int n,String sourcePeg,String auxPeg,String destPeg){
       if(n==0) return;
       TowersOfHanoi(n-1, sourcePeg,  destPeg, auxPeg);// call the method with n-1 to go for the next disk with the destination peg being the aux peg
       System.out.println("disk: "+n+" source Peg: "+sourcePeg+" --> Destination Peg: "+destPeg); //print the nb of disk and its destination
       TowersOfHanoi(n-1, auxPeg, sourcePeg, destPeg);// call this method to take the disks from the aux peg and use the source peg as an aux to assemble at the destpeg
      }

   public static void reverseStr(String s){ 
       if(s==null||s.length()<=1)
           System.out.println(s);
       else{
            System.out.print(s.charAt(s.length()-1));
            reverseStr(s.substring(0,s.length()-1));
        }
       
   }
}

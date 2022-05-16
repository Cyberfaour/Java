/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlists;

/**
 *
 * @author CLICK ONCE
 */
public class LinkedLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SLL sll=new SLL();
        sll.addFirst(14);
        sll.addLast(-9);
        sll.addLast(7);
        sll.addLast(5);sll.addLast(2);sll.addLast(1);sll.addLast(2);sll.addLast(3);sll.addLast(8);
        sll.addLast(11);sll.addLast(14);sll.addLast(15);sll.addLast(19);sll.addLast(20);
        sll.addLast(40);sll.addLast(34);sll.addLast(32);sll.addLast(26);sll.addLast(23);
        
        sll.print();
//        sll.removeEvery();
//        sll.print();
//        SLL sll1=new SLL();
//        SLL sll2=new SLL();
//        for(int i=sll.size()-1;i>0;i--){
//            sll2.addLast(sll.removeLast());
//            System.out.println("\n");
//         }
//       sll2.print();
     DLL dll=new DLL();
     dll.addFirst("s");
     dll.addFirst(34);
     dll.addLast(123);
     dll.addFirst("car");
     dll.addFirst("hello");
    
     dll.print();
        CLL cll=new CLL();
        
        cll.addFirst(14);
        cll.addFirst(434);
        cll.addFirst(21);
        cll.addLast(212);
        cll.print();
        cll.rotate();
        cll.print();
        
    }
    
}

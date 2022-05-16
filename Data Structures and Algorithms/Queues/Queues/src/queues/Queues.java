
package queues;

import java.util.Random;


/**
 *
 * @author Cyberfaour
 */
public class Queues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random r=new Random();
        String str="asdn3roncqdpn!@#$^*";
        ArrayQueue q=new ArrayQueue(10);
        q.printContent();
        
        for(int i=0;i<9;i++)
            q.enqueue(str.charAt(r.nextInt(str.length())));
        q.printContent();
        
       for(int i=0;i<q.length()-1;i++){
            q.dequeue();
            q.printContent();
        
       }
        
        
    }
    
}

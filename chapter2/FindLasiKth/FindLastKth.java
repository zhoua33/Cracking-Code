/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package findlastkth;
import list.*;

/**
 *
 * @author yunzhou
 */
public class FindLastKth {

    /**
     * @param args the command line arguments
     */
    public static ListNode findlastKth(LinkedList list,int k){
        ListNode fronter = list.getHead();
        ListNode behinder = list.getHead();
        
        if(list.getSize() < k) return null;
        
        for(int i =1; i < k+1; i++){
            fronter = fronter.getNext();
        }
        
        while(fronter.getNext()!= null){
            behinder = behinder.getNext();
            fronter = fronter.getNext();
        }
        
        return behinder;
    }
    
    
    
    public static void main(String[] args) {
        list.LinkedList list = new list.LinkedList();
        list.insertFront("F");
        list.insertFront("N");
        list.insertFront("O");
        list.insertFront("R");
        list.insertFront("F");
        list.insertNth("K", 10);
        list.insertNth("K", 1);
        System.out.println("the list orignal is: "+list.toString());
        System.out.println("the last 3 element is: "+findlastKth(list,3).getData().toString());
        System.out.println("the last 1 element is: "+findlastKth(list,1).getData().toString());
        System.out.println("the last 7 element is: "+findlastKth(list,7).getData().toString());
        
        list.LinkedList list2 = new list.LinkedList();
        list2.insertFront("T");
        list2.insertFront("T");
        list2.insertFront("T");
        list2.insertFront("T");
        list2.insertFront("T");
        list2.insertNth("T", 10);
        list2.insertNth("T", 1);
      
        System.out.println("the list original: "+list2.toString());
        System.out.println("the last 5 element is: "+findlastKth(list2,5).getData().toString());
        

        
        
        // TODO code application logic here
    }
}

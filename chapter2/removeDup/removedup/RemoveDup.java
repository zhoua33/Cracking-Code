/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package removedup;
import list.*;
import java.util.*;

/**
 *
 * @author yunzhou
 */
public class RemoveDup {

    /**
     * @param args the command line arguments
     */
    public static void removeDuplicate(list.LinkedList list){
        HashMap newhash = new HashMap(100);
        list.ListNode newnode = list.getHead();
        int k = list.getSize();
        for(int i=1;i<k+1;i++){
            if(newhash.containsKey(newnode.getData().toString())) list.remove(newnode);
            else newhash.put(newnode.getData().toString(), 0);
            newnode = newnode.getNext();
        }
    }
    
    
    public static void removeDuplicateEtra(list.LinkedList list){
        list.ListNode quickmover = list.getHead();
        list.ListNode slowmover = list.getHead();
        while(slowmover.getNext() != null){
            quickmover = slowmover.getNext();
            while(quickmover.getNext()!=null){
                if(quickmover.getData().equals(slowmover.getData())) list.remove(quickmover);
                quickmover = quickmover.getNext();
            }
            slowmover = slowmover.getNext();
        }
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
        removeDuplicate(list);
        System.out.println("the list should be: "+list.toString());
        
        
        list.LinkedList list2 = new list.LinkedList();
        list2.insertFront("T");
        list2.insertFront("T");
        list2.insertFront("T");
        list2.insertFront("T");
        list2.insertFront("T");
        list2.insertNth("T", 10);
        list2.insertNth("T", 1);
        removeDuplicate(list2);
        System.out.println("the list should be: "+list2.toString());
        
        
        list.LinkedList list3 = new list.LinkedList();
        list3.insertFront("T");
        list3.insertFront("T");
        list3.insertFront("T");
        list3.insertFront("T");
        list3.insertFront("T");
        list3.insertNth("T", 10);
        list3.insertNth("T", 1);
        removeDuplicateEtra(list3);
        System.out.println("the list should be: "+list3.toString());
        
        
        list.LinkedList list4 = new list.LinkedList();
        list4.insertFront("F");
        list4.insertFront("N");
        list4.insertFront("O");
        list4.insertFront("R");
        list4.insertFront("F");
        list4.insertNth("K", 10);
        list4.insertNth("K", 1);
        removeDuplicateEtra(list4);
        System.out.println("the list should be: "+list4.toString());
    }
}

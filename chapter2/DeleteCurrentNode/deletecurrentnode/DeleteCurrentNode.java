/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deletecurrentnode;
import list.*;

/**
 *
 * @author yunzhou
 */
public class DeleteCurrentNode {

    /**
     * @param args the command line arguments
     */
   public static void removeCurrent(ListNode node){
       if(node.getNext() == null){
           node = null;
       } 
       else{
           node.setData(node.getNext().getData());
           node.setNext(node.getNext().getNext());
       }
   }
   
   public static void useforRemove(LinkedList list,int n){
       int k = list.getSize();
       if(list.getSize() < n) return;
       else{
           removeCurrent(list.getNth(n));
           list.setSize(k-1);
       }
        
   }
    
    public static void main(String[] args) {
        // TODO code application logic here
        list.LinkedList list = new list.LinkedList();
        list.insertFront("F");
        list.insertFront("N");
        list.insertFront("O");
        list.insertFront("R");
        list.insertFront("F");
        list.insertNth("K", 10);
        list.insertNth("K", 1);
        System.out.println("the list orignal is: "+list.toString());
        useforRemove(list,3);
        System.out.println("after deleting 3:  "+list.toString());
        System.out.println("the list orignal is: "+list.toString());
        useforRemove(list,1);
        System.out.println("after deleting 1:  "+list.toString());
        System.out.println("the list orignal is: "+list.toString());
        useforRemove(list,5);
        System.out.println("after deleting 1:  "+list.toString());
    }
}

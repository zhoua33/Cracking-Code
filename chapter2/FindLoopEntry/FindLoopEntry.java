/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package findloopentry;
import list.*;

/**
 *
 * @author yunzhou
 */
public class FindLoopEntry {

    /**
     * @param args the command line arguments
     */
    public static ListNode findentry(LinkedList list){
        //suppose list is a loop list
        ListNode node = list.getHead();
        ListNode quickNode = list.getHead();
        ListNode slowNode = list.getHead();
        
        do{
            quickNode = quickNode.getNext().getNext();
            slowNode = slowNode.getNext();
        }while(quickNode != slowNode);
                
        while(slowNode != node){
            slowNode = slowNode.getNext();
            node = node.getNext();
        }
        return node;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList list = new LinkedList();
        list.insertFront("F");
        list.insertFront("N");
        list.insertFront("O");
        list.insertFront("R");
        list.insertFront("F");
        list.insertFront("S");
        list.insertFront("E");
        list.insertFront("U");
        list.insertFront("P");
        list.insertFront("K");
        list.getLastNth(3).setNext(list.getNth(4));
        System.out.println("the loop entry is: " + findentry(list).getData().toString());
    }
}

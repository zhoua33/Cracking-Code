/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package partitionkvalue;
import list.*;

/**
 *
 * @author yunzhou
 */
public class PartitionKvalue {

    /**
     * @param args the command line arguments
     */
    public static LinkedList partitionwithk(LinkedList list,int k){
        LinkedList kless = new LinkedList();
        LinkedList kabove = new LinkedList();
        ListNode node = list.getHead();
        
        while(node!= null){
            if(((int) node.getData()) < k) kless.insertFront(node.getData());
            else kabove.insertFront(node.getData());
            node = node.getNext();
        }
        ListNode lnode = kless.getHead();
        ListNode knode = kabove.getHead();
        
        if(lnode == null) return kabove;
        
        while(lnode.getNext()!=null){
            lnode = lnode.getNext();
        }
        lnode.setNext(knode);
        kless.setSize(list.getSize());
        return kless;
        
    }
    
    public static void main(String[] args) {
        list.LinkedList list = new list.LinkedList();
        list.insertFront(1);
        list.insertFront(19);
        list.insertFront(3);
        list.insertFront(8);
        list.insertFront(5);
        list.insertFront(2);
        list.insertFront(10);
        System.out.println("the list orignal is: "+list.toString());
        System.out.println("the seperator is 8: "+partitionwithk(list,8).toString());
        System.out.println("the seperator is 5: "+partitionwithk(list,5).toString());
        System.out.println("the seperator is 1: "+partitionwithk(list,1).toString());
        System.out.println("the seperator is 18: "+partitionwithk(list,18).toString());
        System.out.println("the seperator is 19: "+partitionwithk(list,19).toString());
    }
}

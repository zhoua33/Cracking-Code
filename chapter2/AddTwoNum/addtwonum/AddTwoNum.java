/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package addtwonum;
import list.*;

/**
 *
 * @author yunzhou
 */
public class AddTwoNum {

    /**
     * @param args the command line arguments
     */
    public static LinkedList addtwoNum(LinkedList list1, LinkedList list2){
        int counter = 0;
        ListNode listnode1 = list1.getHead();
        ListNode listnode2 = list2.getHead();
        LinkedList list3 = new LinkedList();
        while(listnode1 != null && listnode2 != null){
            int k = (int) listnode1.getData() + (int) listnode2.getData();
            if( k+counter > 9){
                list3.insertBack((k+counter)%10);
                counter = 1;
            }else{  
                list3.insertBack(k+counter);
                counter = 0;
            }
            listnode1 = listnode1.getNext();
            listnode2 = listnode2.getNext();
        }
        while(listnode1 != null){
            int k = (int) listnode1.getData() + counter;
            if(k>9){
                list3.insertBack(k%10);
                counter = 1;
            }else{
                list3.insertBack(k);
                counter = 0;
            }
            listnode1 = listnode1.getNext();
        }
        while(listnode2 != null){
            int k = (int) listnode2.getData() + counter;
            if(k>9){
                list3.insertBack(k%10);
                counter = 1;
            }else{
                list3.insertBack(k);
                counter = 0;
            }
            listnode2 = listnode2.getNext();
        }
        return list3;
    }
    
    
    public static LinkedList addtwoNumForward(LinkedList list1, LinkedList list2){
        int size = Math.max(list1.getSize(), list2.getSize());
        LinkedList list3 = new LinkedList();
        if(size > 0){
            int k = addForwardHelper(list3, list1, list2, 1, size);
            return list3;
        }else{
            return null;
        }     
    }
    
    public static int addForwardHelper(LinkedList list3, LinkedList list1, LinkedList list2, int start, int end){
        if(start > end) return 0;
        else{
            int k =0;
            if(end - start + 1 > list1.getSize()){
                k= (int) list2.getNth(start).getData() + addForwardHelper(list3, list1, list2, start+1, end);
            }else if(end - start + 1> list2.getSize()){
                k= (int) list1.getNth(start).getData() + addForwardHelper(list3, list1, list2, start+1, end);
            }else{
                k = (int) list1.getLastNth(end - start + 1).getData() + (int) list2.getLastNth(end - start + 1).getData()+addForwardHelper(list3, list1, list2, start + 1, end);
            }
            if(k>9){
                list3.insertFront(k%10);
                if(start == 1) {
                    list3.insertFront(1);
                    return 0;
                }else return 1;
            }else{
                list3.insertFront(k);
                return 0;
            }
            
        }
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        list.LinkedList list = new list.LinkedList();
        list.insertFront(1);
        list.insertFront(9);
        list.insertFront(3);
        list.insertFront(8);
        list.insertFront(5);
        list.insertFront(2);
        list.insertFront(3);
        LinkedList list2 = new LinkedList();
        list2.insertFront(2);
        list2.insertFront(5);
        list2.insertFront(6);
        list2.insertFront(4);
        list2.insertFront(6);
        list2.insertFront(1);
        System.out.println("the list orignal is: "+list.toStringReverse());
        System.out.println("the list2 orignal is: "+list2.toStringReverse());
        System.out.println("the sum is : "+addtwoNum(list,list2).toStringReverse());
        
        System.out.println("the list original is: " + list.toString());
        System.out.println("the list2 original is: " + list2.toString());
        
        System.out.println("the seperator is 5: "+addtwoNumForward(list,list2).toString());
       
        
    }
}

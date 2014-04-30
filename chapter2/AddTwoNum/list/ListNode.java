/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

/**
 *
 * @author yunzhou
 */
public class ListNode {
    Object data;
    ListNode next;
    
    public ListNode(){
        data = null;
        next = null;
    }
    
    public ListNode(Object data, ListNode next){
        this.data = data;
        this.next = next;
    }
    
    public void setNext(ListNode next){
        this.next = next;
    }
    
    public void setData(Object data){
        this.data = data;
    }
    
    public ListNode getNext(){
        return this.next;
    }
    
    public Object getData(){
        return this.data;
    }
    
}

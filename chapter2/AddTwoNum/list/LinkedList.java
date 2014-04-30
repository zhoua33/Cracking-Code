/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

/**
 *
 * @author yunzhou
 */
public class LinkedList {
    ListNode head;
    int size;
    
    public LinkedList(){
        head = null;
        size = 0;
    }
    
    public int getSize(){
        return size;
    }
    
    public void setSize(int k){
        size=k;
    }
    
    public ListNode getHead(){
        return head;
    }
    
    public void insertFront(Object data){
        if(size == 0){
            head = new ListNode(data,null);
            size++;
            return;
        }else{
            ListNode node = new ListNode(data,head);
            head = node;
            size++;
        }
    }
    
    public void insertBack(Object data){
        if(size==0){
            head = new ListNode(data,null);
            size++;
            return;
        }else{
            ListNode node = new ListNode(data,null);
            ListNode trace = head;
            while(trace.next != null){
                trace = trace.next;
            }
            trace.next = node;
            size++;
            return;
        }
    }
    
    public void insertNth(Object data, int n){
        int k = n-1;
        ListNode node = head;
        if(n == 1){
            insertFront(data);
            size--;
        }
        if(size < n){
            k = size;
        }
        for(int s=1; s< k; s++){
            node = node.next;
        }
        ListNode keynode = new ListNode(data,node.next);
        node.next = keynode; 
        size++;
    }
    
    public ListNode getLastNth(int n){
        int k = size - n + 1;
        ListNode node = head;
        
        for(int s=1; s< k; s++){
            node = node.next;
        }
        return node;
    }
    
    public ListNode getNth(int n){
        ListNode node = head;
        if(n<1) return null;
        else if(n == 1){
            return head;
        }
        for(int s=1; s< n; s++){
            node = node.next;
        }
        return node;
    }
    
    public void clear(){
        head = null;
        size = 0;
    }
    
    public void remove(int i){
        ListNode node = head;
        if(i>size) return;
        else if(i==1){
            head = node.next;
            size--;
        }
        else{
            for(int k=1;k<i-1;k++){
                node = node.next;
            }
            node.next = node.next.next;
            size--;
        }
    }
    
    public void remove(ListNode n){
        ListNode node = head;
        ListNode former = head;
        if(node == n) {
            head = node.next;
            size--;
            return;
        }
        for(int k=1;k<size+1;k++){
            if(node != n){
                former = node;
                node = node.next;
            }else{
                former.next = node.next;
            }
        }
     size--;
    }
    
    
    
    public String toString(){
        String s = "";
        ListNode node = head;
        for(int i = 0; i< size; i++){
            s = s + node.data.toString();
            node = node.next;
        }
        return s;  
    }
    
    public String toStringReverse(){
        String s = "";
        ListNode node = head;
        for(int i = 0; i<size; i++){
            s = node.data.toString() + s;
            node = node.next;
        }
        return s;
    }
    
   
    
}

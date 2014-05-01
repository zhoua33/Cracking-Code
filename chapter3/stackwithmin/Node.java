/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stackwithmin;

/**
 *
 * @author yunzhou
 */
public class Node {
    int data;
    int min;
    Node next;
    
    public Node(int data, int min){
        this.data = data;
        this.min = min;
        this.next = null;
    }
    
    
    
    public void setData(int data){
        this.data = data;
    }
    
    public void setMin(int min){
        this.min = min;
    }
    
    public void setNext(Node next){
        this.next = next;
    }
    
    public int getData(){
        return this.data;
    }
    
    public int getMin(){
        return this.min;
    }
    
    public Node getNext(){
        return this.next;
    }
    
}

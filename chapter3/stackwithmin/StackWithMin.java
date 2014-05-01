/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stackwithmin;

/**
 *
 * @author yunzhou
 */
public class StackWithMin {

    /**
     * @param args the command line arguments
     */
    Node top;
    
    public StackWithMin(){
        top = null;
    }
    
    public boolean isEmpty(){
        if(top == null) return true;
        else return false;
    }
    
    public int peek(){
        if(isEmpty()){
            System.out.println("is Empty, ignore following -1");
            return -1;
        }else{
            return top.data;
        }
    }
    
    public int peekMin(){
        if(isEmpty()){
            System.out.println("is Empty, ignore following -1");
            return -1;
        }else{
            return top.min;
        }
    }
    
    public void push(int data){
        Node newtop = new Node(data, data);
        if(isEmpty()){
            top = newtop;
            return;
        }
        if(data > peekMin()){
            newtop.setMin(peekMin());
        }
        newtop.next = top;
        top = newtop;
    }
    
    public int pop(){
        Node renode = top;
        if(isEmpty()){
            System.out.println("is Empty, ignore following -1");
            return -1;
        }else{
            top = top.getNext();
            return renode.data;
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        StackWithMin arr = new StackWithMin();
        arr.push(5);
        arr.push(10);
        arr.push(6);
        arr.push(7);
        arr.push(8);
        arr.push(4);
        arr.push(3);
        arr.push(1);
        System.out.println("the stack peek" + arr.peek());
        System.out.println("the Minvalue peek" + arr.peekMin());
  
        System.out.println("the first pop" + arr.pop());
        System.out.println("the peek after first pop" + arr.peek());
        System.out.println("the Minvalue peek" + arr.peekMin());
        System.out.println("the second pop" + arr.pop());
        System.out.println("the peek after second pop" + arr.peek());
        System.out.println("the Minvalue peek" + arr.peekMin());
        System.out.println("the third pop" + arr.pop());
        System.out.println("the peek after third pop" + arr.peek());
        System.out.println("the Minvalue peek" + arr.peekMin());
        
       
    
        
        
    }
}

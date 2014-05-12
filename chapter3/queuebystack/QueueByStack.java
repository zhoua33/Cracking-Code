/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queuebystack;

import java.util.Stack;

/**
 *
 * @author yunzhou
 */
public class QueueByStack {

    /**
     * @param args the command line arguments
     */
    Stack holder;
    Stack outer;
    
    public QueueByStack(){
        holder = new Stack();
        outer = new Stack();
    }
    
    public boolean isEmpty(){
        if(holder.empty() && outer.empty()) return true;
        else return false;
    }
    
    public void enqueque(Object n){
        holder.push(n);
    }
    
    public Object dequeque(){
        if(!outer.empty()) return outer.pop();
        else{
            while(!holder.empty()){
                outer.push(holder.pop());
            }
            if(outer.empty()) return null;
            else return outer.pop();
        }
    }
    
    public Object pop(){
        // this is just for comparation
        if(holder.empty()) return null;
        else return holder.pop();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = "this";
        String s2 = " should";
        String s3 = " be";
        String s4 = " that";
        String s5 = " make";
        String s6 = " sense";
        QueueByStack stack1 = new QueueByStack();
        stack1.enqueque(s1);
        stack1.enqueque(s2);
        stack1.enqueque(s3);
        stack1.enqueque(s4);
        stack1.enqueque(s5);
        stack1.enqueque(s6);
        
        for(int i = 1; i<= 6; i++){
             System.out.println(stack1.dequeque());
        }
        
        QueueByStack stack2 = new QueueByStack();
        stack2.enqueque(s1);
        stack2.enqueque(s2);
        stack2.enqueque(s3);
        stack2.enqueque(s4);
        stack2.enqueque(s5);
        stack2.enqueque(s6);
        
        for(int i = 1; i<= 6; i++){
             System.out.println(stack2.pop());
        }
        
    }
}

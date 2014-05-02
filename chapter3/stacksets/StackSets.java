/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stacksets;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author yunzhou
 */
public class StackSets {

    /**
     * @param args the command line arguments
     */
    ArrayList<Stack> list = new ArrayList();
    int maximum = 5;
    static int totalsize;
    
    public StackSets(){
        
        totalsize = 0;
    }
    
    public void push(int data){
        if(list.size()* maximum == totalsize){
            Stack newst = new Stack();
            list.add(newst);
            newst.push(data);
            totalsize++;
        }else{
            Stack cust = list.get(list.size()-1);
            cust.push(data);
            totalsize++;
        }
    }
    
    public int pop(){
        int k = (int) list.get(list.size()-1).pop();
        if(list.get(list.size()-1).isEmpty()){
            list.remove(list.size()-1);
        }
        totalsize--;
        return k;
    }
    
    public int peek(int index){
        if(index >= list.size() || index < 0) return -1;
        return (int) list.get(index -1).peek();
    }
    
    public int popAt(int index){
        if(index >= list.size() || index < 0) return -1;
        int k = (int) list.get(index-1).pop();
        if(index < list.size()) transferStack(index, index+1);
        else{
            if(list.get(index-1).isEmpty()) list.remove(list.get(index-1));
        }
        totalsize--;
        return k;
    }
    
    public void transferStack(int stacknum1, int stacknum2){
        Stack temp = new Stack();
        Stack stack1 = list.get(stacknum1-1);
        Stack stack2 = list.get(stacknum2-1);
        while(!stack2.isEmpty()){
            temp.push(stack2.pop());
        }
        stack1.push(temp.pop());
        while(!temp.isEmpty()){
            stack2.push(temp.pop());
        }
        if(stacknum2 < list.size()) transferStack(stacknum2,stacknum2+1);
        else if(list.get(stacknum2-1).isEmpty()) list.remove(stacknum2-1);
    }
    
    public int peek(){
        return (int) list.get(list.size()-1).peek();
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        StackSets arr = new StackSets();
        arr.push(5);
        arr.push(10);
        arr.push(6);
        arr.push(7);
        arr.push(8);
        arr.push(4);
        arr.push(3);
        arr.push(1);
        arr.push(6);
        arr.push(7);
        arr.push(8);
        arr.push(4);
        arr.push(3);
        arr.push(1);
        arr.push(6);
        arr.push(7);
        arr.push(8);
        arr.push(4);
        arr.push(3);
        arr.push(1);
        arr.push(6);
        arr.push(7);
        arr.push(8);
        arr.push(4);
        arr.push(3);
        arr.push(1);
        
   //     System.out.println("pop "+ arr.pop());
        System.out.println("peek "+ arr.peek());
     //   System.out.println("pop "+ arr.pop());
        System.out.println("peek "+ arr.peek());
    //    System.out.println("pop "+ arr.pop());
        System.out.println("peek "+ arr.peek());
    //    System.out.println("pop "+ arr.pop());
        System.out.println("peek "+ arr.peek());
   //     System.out.println("pop "+ arr.pop());
        System.out.println("peek "+ arr.peek());
   //     System.out.println("pop "+ arr.pop());
        System.out.println("peek at 1 "+ arr.peek(1));
        System.out.println("pop  at 1 "+ arr.popAt(1));
        System.out.println("peek at 1 "+ arr.peek(1));
       // System.out.println("pop "+ arr.pop());
        System.out.println("peek at 2 "+ arr.peek(2));
       // System.out.println("pop "+ arr.pop());
        System.out.println("peek at 3 "+ arr.peek(3));
        System.out.println("peek at 4 "+ arr.peek(4));
       // System.out.println("pop "+ arr.pop(4));
        System.out.println("pop "+ arr.pop());
        System.out.println("pop at 2 "+ arr.popAt(2));
        System.out.println("peek at 2 "+ arr.peek(2));
        System.out.println("pop "+ arr.pop());
    }
}

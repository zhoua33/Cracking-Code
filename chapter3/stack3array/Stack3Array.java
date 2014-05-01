/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stack3array;

/**
 *
 * @author yunzhou
 */
public class Stack3Array {

    /**
     * @param args the command line arguments
     */
    int[] arr;
    int stacknum;
    int totalsize;
    int[] tracksize;
    
    public Stack3Array(){
        arr  = new int[500];
        stacknum = 3;
        totalsize = 500;
        tracksize = new int[stacknum];
        for(int i=0;i<stacknum;i++){
            tracksize[i] = -1;
        }
    }
    
    public boolean isEmpty(int num){
        if(num >= stacknum || num < 0) return false;
        else{
            if(tracksize[num] ==-1) return true;
            else return false;
        }
    }
    
    public void push(int data, int num){
        if(num >= stacknum || num < 0) return;
        else{
            if(tracksize[num]+1 > totalsize/stacknum) return; //cannot hold anymore
            tracksize[num]++;
            arr[(totalsize/stacknum)*num + tracksize[num]]=data;
            
        }
    }
    
    public int peek(int num){
        if(num >= stacknum || num < 0) return -1;
        if (isEmpty(num)) return -1;
        return arr[(totalsize/stacknum)*num + tracksize[num]];
    }
    
    public int pop(int num){
        if(num >= stacknum || num < 0) return -1;
        if (isEmpty(num)) return -1;
        else{
            int k = peek(num);
            tracksize[num]--;            
            return k;
        }        
     }
    
    public static void main(String[] args) {
        Stack3Array arr = new Stack3Array();
        arr.push(5, 1);
        arr.push(10, 0);
        arr.push(6,1);
        arr.push(2, 2);
        arr.push(8, 1);
        arr.push(4,1);
        arr.push(3, 2);
        arr.push(6, 1);
        System.out.println("the first stack peek" + arr.peek(0));
        System.out.println("the second stack peek" + arr.peek(1));
        System.out.println("the third stack peek" + arr.peek(2));
        
        System.out.println("the first stack pop" + arr.pop(0));
        System.out.println("the second stack pop" + arr.pop(1));
        System.out.println("the third stack pop" + arr.pop(2));
        
        System.out.println("the first stack peek after pop" + arr.peek(0));
        System.out.println("the second stack peek after pop" + arr.peek(1));
        System.out.println("the third stack peek after pop" + arr.peek(2));
        // TODO code application logic here
    }
}

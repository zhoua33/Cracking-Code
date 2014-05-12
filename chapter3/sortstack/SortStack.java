/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sortstack;
import java.util.*;
/**
 *
 * @author yunzhou
 */
public class SortStack {

    /**
     * @param args the command line arguments
     */
    //my thought, to sort a stack in ascending order
    // just to make another stack to store these items in descending order
    Stack original;
    Stack median;
    
    public SortStack(){
        original = new Stack();
        median = new Stack();
        int num = (int) (Math.random() * 20);
        for(int i = 0; i< num; i++){
            original.push((int) (Math.random() * 101));
        }    
    }
    
    public void sort(){
        while(!original.empty()){
            int num = (int) original.pop();
            if(median.empty()) median.push(num);
            else{
                while((int) median.peek() < num){
                    original.push(median.pop());
                    if(median.empty()) break;
                }
                median.push(num);
            }
        }
        
        while(!median.empty()){
            original.push(median.pop());
        }
    }
    
    public String toString(){
        String result = "";
        while(!original.empty()){
            result = result + original.peek() + "\n";
            median.push(original.pop());
        }
        while(!median.empty()){
            original.push(median.pop());
        }
        return result;
    }
    
    
    public static void main(String[] args) {
        SortStack stack1 = new SortStack();
        System.out.println("Before sorted " + "\n"+ stack1.toString());
        stack1.sort();
        System.out.println("After sorted: " + "\n" + stack1.toString());
    }
}

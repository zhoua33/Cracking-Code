/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hanoi;
import java.util.*;
/**
 *
 * @author yunzhou
 */
public class Hanoi {

    /**
     * @param args the command line arguments
     */
    Stack[] arrst = new Stack[3];
    int knum;
    
    public Hanoi(int num){
        for(int i=0; i<3;i++){
            arrst[i] = new Stack();
        }
        for(int j= num; j >0; j--){
            arrst[0].push(j);
        }    
        this.knum = num;
    }
    
    public void transfer(Stack start, Stack mid, Stack end,int size){
        if(size<1) return;
        else if(size ==1){
            if(!end.empty()){
                if(((Comparable) end.peek()).compareTo((Comparable) start.peek()) <= 0) return;
            } 
            end.push(start.pop());      
        }else{
            transfer(start, end, mid, size-1);
            transfer(start, mid, end, 1);
            transfer(mid, start, end, size-1);
        }
    }
    
    public void move(){
        transfer(arrst[0], arrst[1], arrst[2],this.knum);
    }
    
    public String toString(){   
        //this would destroy the Hanoi, use this with careful
        //just for final test
        String result = "";
        for(int i = 0; i<3; i++){
            result = result + "this is pile" + i+"\n";
            while(!this.arrst[i].empty()){
                result = result + arrst[i].pop() + "\n";
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        Hanoi ha1 = new Hanoi(5);
        ha1.move();
        System.out.println(ha1.toString());
        
        Hanoi ha2 = new Hanoi(7);
        ha2.move();
        System.out.println(ha2.toString());
        
        Hanoi ha3 = new Hanoi(7);
        System.out.println(ha3.toString());
        
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ispalindrome;
import list.*;

/**
 *
 * @author yunzhou
 */
public class IsPalindrome {

    /**
     * @param args the command line arguments
     */
    public static boolean ispalindrome(LinkedList list){
        return isPalHelper(list,1,list.getSize());
    }
    
    public static boolean isPalHelper(LinkedList list, int start, int end){
        if(start >= end)  return true;
        else{
            if(isPalHelper(list, start+1, end-1)){
                if(list.getNth(start)==list.getNth(end)) return true;
                else return false;
            }else return false;
        }
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList list = new LinkedList();
        list.insertFront("F");
        list.insertFront("N");
        list.insertFront("O");
        list.insertFront("R");
        list.insertFront("F");
        list.insertFront("S");
        list.insertFront("E");
        list.insertFront("U");
        list.insertFront("P");
        list.insertFront("K");
        
        if(ispalindrome(list)) System.out.println("this shoule not be printed");
        else System.out.println("correct");
        
        LinkedList list2 = new LinkedList();
        list.insertFront("F");
        list.insertFront("N");
        list.insertFront("O");
        list.insertFront("R");
        list.insertFront("F");
        list.insertFront("F");
        list.insertFront("R");
        list.insertFront("O");
        list.insertFront("N");
        list.insertFront("F");
        
        if(ispalindrome(list2)) System.out.println("this shoule be printed");
        else System.out.println("WRONG ");
    }
}

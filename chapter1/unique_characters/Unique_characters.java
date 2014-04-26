/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package unique_characters;

/**
 *
 * @author yunzhou
 */
public class Unique_characters {

    /**
     * @param args the command line arguments
     */
    public static boolean isUnique(String s){    //mine method
        for(int i = 0; i < s.length();i++){
            for(int j = i+1; j < s.length();j++){
                char a = s.charAt(i);
                char b = s.charAt(j);
                if(a == b) return false;
            }
        }
        return true;
    }
    
    public static boolean isUniqueBook(String s){   //cracking code method
        if(s.length() > 256) return false;     //missing with myself,important in saving time
        
        boolean[] checker = new boolean[256];
        
        for(int i = 0; i< s.length(); i++){
            int val = s.charAt(i);
            if(checker[val]) return false;
            else checker[val] = true;
        }
        return true;
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = "kbgslgh";
        String s2 = "qweiuopr";
        
        //Unique_characters u1 = new Unique_characters();
        if(isUniqueBook(s1)) System.out.println(s1+"should not be unique, but method is wrong");
        else System.out.println("Ok");
        
        if(isUniqueBook(s2)) System.out.println(s1+" is actually unique, so answer is right");
        else System.out.println("s2 should be unique, method is wrong");
    }
}

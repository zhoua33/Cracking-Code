/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package permutation;

/**
 *
 * @author yunzhou
 */
public class Permutation {

    /**
     * @param args the command line arguments
     */
    public static boolean isPermutative(String s1, String s2){    //permutative not means reverse order
        if(s1.length() != s2.length()) return false;              //understand error
        int k = s1.length();
        for(int i = 0; i < k; i++){
            char a = s1.charAt(i);
            char b = s2.charAt(k-i-1);     //forget -1 first time
            if(a != b) return false;
        }
        return true;
    }
    
    public boolean isPermutativeBook(String s1, String s2){   //solution from book
        if(s1.length() != s2.length()) return false;
        return sortString(s1).equals(sortString(s2));
    }
    
    public String sortString(String s){
        char[] arrayStr = s.toCharArray();
        java.util.Arrays.sort(arrayStr);
        return new String(arrayStr);    //why cannot just return char[]?
    }
    
    public static boolean isPermutativeRight(String s1, String s2){
        int[] checkers = new int[256];
        
        for(int i = 0; i< s1.length(); i++){
            int val = s1.charAt(i);
            checkers[val]++;
        }
        
        for(int i = 0; i < s2.length(); i++){
            int val = s2.charAt(i);
            if(checkers[val] < 1) return false;
            checkers[val]--;
        }
        return true;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = "qweuiop";
        String s2 = "poiuewq";
        String s3 = "poiuewu";
        String s4 = "werio";
        String s5 = "ewiofho";
        String s6 = "poiuweq";
        
        Permutation newper = new Permutation();
         //  if(isPermutative(s1,s2)) System.out.println("This one should be appear " + s1);
        //if(newper.isPermutativeBook(s1, s2)) System.out.println("This one should be appear " + s1); 
        if(isPermutativeRight(s1,s2)) System.out.println("This one should be appear " + s1);
        else System.out.println("error in s1 and s2");
        
        //if(isPermutative(s1,s3)) System.out.println("This should not appear" + s3);
        //if(newper.isPermutativeBook(s1,s3)) System.out.println("This should not appear" + s3);
        if(isPermutativeRight(s1,s3)) System.out.println("This should not appear" + s3);
        else System.out.println("correct in s1 and s3");
        
        if(isPermutativeRight(s1,s4)) System.out.println("This should not appear" + s4);
        else System.out.println("correct in s1 and s4");
        
        if(isPermutativeRight(s1,s5)) System.out.println("This should not appear" + s5);
        else System.out.println("correct in s1 and s5");
        
        if(isPermutativeRight(s1,s6)) System.out.println("This should appear" + s6);
        else System.out.println("error in s1 and s6");
    }
}

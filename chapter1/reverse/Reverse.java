/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse;

/**
 *
 * @author yunzhou
 */
public class Reverse {

    /**
     * @param args the command line arguments
     */
    public static String reverse(String s){
        char[] arrayStr = new char[s.length()];
        
        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            arrayStr[s.length()-i-1] = a;
        }
        
        return new String(arrayStr);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        String s1 = "werjksh";
        String s2 = "sjekdls";
        String s3 = "1235kel";
        System.out.println(reverse(s1) + " and its original is " + s1);
        System.out.println(reverse(s2) + " and its original is " + s2);
        System.out.println(reverse(s3) + " and its original is " + s3);
    }
}

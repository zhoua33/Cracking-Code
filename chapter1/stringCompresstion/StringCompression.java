/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcompression;

/**
 *
 * @author yunzhou
 */
public class StringCompression {

    /**
     * @param args the command line arguments
     */
    public static String compression(String s){
        String newStr = "";
        char former = s.charAt(0);
        newStr = newStr + former;
        int k = 1;
        for(int i = 1; i<s.length(); i++){
            if(s.charAt(i) == former) k++;
            else{
                newStr = newStr + k + s.charAt(i);
                k = 1;  
                former = s.charAt(i);
            }
        }
        newStr += k;                         //forget this line at first time,important
        if(newStr.length() >= s.length()) return s;
        else return newStr;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = "aabdosl";
        String s2 = "asdfjkl";
        String s3 = "aaabbbbeeee";
        
        System.out.println(compression(s1) + " original is " + s1);
        System.out.println(compression(s2) + " original is " + s2);
        System.out.println(compression(s3) + " original is " + s3);
    }
}

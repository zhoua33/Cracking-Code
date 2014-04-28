/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package isrotate;

/**
 *
 * @author yunzhou
 */
public class IsRotate {

    /**
     * @param args the command line arguments
     */
    public static boolean isSubstring(String s1, String s2){
        char[] char2 = s2.toCharArray();
        if(s1.contains(s2)) return true;
        else return false;
    }
    
    public static boolean isRotate(String s1, String s2){
        if(s1.length()!= s2.length()) return false;
        else{
            String s3 = s1 + s1;
            if(isSubstring(s3,s2)) return true;
            else return false;
        }
    }
    
    public static void main(String[] args) {
        String s1 = "whatareyourname";
        String s2 = "tare";
        String s3 = "rnam";
        String s4 = "whar";
        
        if(isSubstring(s1,s2)) System.out.println("this should be printed");
        else System.out.println("Wrong");
        if(isSubstring(s1,s3)) System.out.println("this should be printed");
        else System.out.println("Wrong");
        if(isSubstring(s1,s4)) System.out.println("this should not be printed");
        else System.out.println("Correct");
        // TODO code application logic here
        
        String s5 = "areyournamewhat";
        String s6 = "areyounamewhata";
        String s7 = "areyournamewha";
        if(isRotate(s1,s5)) System.out.println("this should be printed for rotate");
        else System.out.println("error in rotate");
        if(isRotate(s1,s6)) System.out.println("this should not be printed for rotate");
        else System.out.println("corrent in rotate");
        if(isRotate(s1,s7)) System.out.println("this should not be printed for rotate");
        else System.out.println("correct in rotate");
    }
}

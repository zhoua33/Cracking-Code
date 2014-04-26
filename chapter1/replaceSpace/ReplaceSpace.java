/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package replacespace;

/**
 *
 * @author yunzhou
 */
public class ReplaceSpace {

    /**
     * @param args the command line arguments
     */
    public static String replaceSpk(String s){
        char[] arrayStr = s.toCharArray();
        int j = 0;
        for(int i=0; i< s.length(); i++){
            if(j==s.length()) break;
            if(s.charAt(i)==' '){
                arrayStr[j] = '%';
                arrayStr[++j] = '2';
                arrayStr[++j] = '0';
                j++;
            }
            else{
                arrayStr[j] = s.charAt(i);
                j++;
            }
            
        }
        return new String(arrayStr);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = "whar are you talking      ";
        System.out.println(replaceSpk(s1));
        String s2 = "hi, how are you today?        ";
        System.out.println(replaceSpk(s2));
    }
}

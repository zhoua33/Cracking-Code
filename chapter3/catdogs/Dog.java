/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package catdogs;

/**
 *
 * @author yunzhou
 */
public class Dog extends Animal{
    
    int owntime;
    
    public Dog(){
        name = "Dog";
        owntime = time++;
    }
    
     public String toString(){
        String result = super.toString();
        result = result + " and time: " + owntime;
        return result; 
    }
}

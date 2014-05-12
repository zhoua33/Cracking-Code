/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package catdogs;

/**
 *
 * @author yunzhou
 */
public class Cat extends Animal{
    int cattime;
    
    public Cat(){
        name = "Cat";
        cattime = time++;
    }
    
    public String toString(){
        String result = super.toString();
        result = result + " and time: " + cattime;
        return result; 
    }
}

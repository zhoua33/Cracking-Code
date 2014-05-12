/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package catdogs;

import java.util.LinkedList;

/**
 *
 * @author yunzhou
 */
public class CatDogs {

    /**
     * @param args the command line arguments
     */
    LinkedList doglist;
    LinkedList catlist;
    
    public CatDogs(){
        doglist = new LinkedList();
        catlist = new LinkedList();
    }
    
    public void enqueque(Animal cd){
        if(cd instanceof Dog){
            doglist.add(cd);
        }else{
            catlist.add(cd);
        }
    }
    
    public Animal dequequeAny(){
        if(doglist.isEmpty() && catlist.isEmpty()) return null;
        if(((Dog) doglist.getFirst()).owntime < ((Cat) catlist.getFirst()).cattime){
            return (Dog) doglist.remove();
        }else return (Cat) catlist.remove();
    }
    
    public Animal dequequeCat(){
        if(catlist.isEmpty()) return null;
        return (Cat) catlist.remove();
    }
    
    public Animal dequequeDog(){
        if(doglist.isEmpty()) return null;
        return (Dog) doglist.remove();
    }
    
    public static void main(String[] args) {
        //suppose the time of the animal created 
        //is also the time they been put into the shelter
        CatDogs shelter = new CatDogs();
        Dog dog1 = new Dog();
        shelter.enqueque(dog1);
        
        Cat cat1 = new Cat();
        shelter.enqueque(cat1);
        
        Dog dog2 = new Dog();
        shelter.enqueque(dog2);
        
        Dog dog3 = new Dog();
        shelter.enqueque(dog3);
        
        Dog dog4 = new Dog();
        shelter.enqueque(dog4);
        
        Dog dog5 = new Dog();
        shelter.enqueque(dog5);
        
        Cat cat2 = new Cat();
        shelter.enqueque(cat2);
        
        Cat cat3 = new Cat();
        shelter.enqueque(cat3);
        
        Dog dog6 = new Dog();
        shelter.enqueque(dog6);
        
        System.out.println(shelter.dequequeCat().toString());
        System.out.println(shelter.dequequeAny().toString());
        System.out.println(shelter.dequequeDog().toString());
        System.out.println(shelter.dequequeAny().toString());
        System.out.println(shelter.dequequeDog().toString());
        System.out.println(shelter.dequequeAny().toString());
        System.out.println(shelter.dequequeCat().toString());
        
        
        
    }
}

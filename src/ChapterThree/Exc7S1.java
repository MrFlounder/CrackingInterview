package ChapterThree;


import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by guangshuozang on 8/23/15.
 * I use tree queues, one for dog, one for cat, one for animal
 */
public class Exc7S1 {
    LinkedList<Animal> cat;
    LinkedList<Animal> dog;
    LinkedList<Animal> animal;
    Exc7S1(){
        this.cat = new LinkedList<Animal>();
        this.dog = new LinkedList<Animal>();
        this.animal = new LinkedList<Animal>();
    }
    abstract class Animal{
        String name;
        Animal(String n) {
            this.name = n;
        }
    }
    class cat extends Animal{
        final String label = "cat";
        cat(String n){
            super(n);
        }
    }
    class dog extends Animal{
        final String label = "dog";
        dog(String n){
            super(n);
        }
    }
    public void enqueue(Animal a) throws Exception{
        if(a instanceof cat )
            cat.addLast(a);
        else if(a instanceof dog)
            dog.addLast(a);
        else throw new Exception("Error animal not recognized");
        animal.addLast(a);
    }
    public Animal dequeueCat(){
            if (animal.poll() instanceof cat)
            return cat.poll();
            else{
                animal.poll();
                animal.addFirst(dog.peekFirst());
                return cat.poll();
            }
    }
    public Animal dequeueDog(){
            if(animal.poll() instanceof dog)
            return dog.poll();
        else{
                animal.poll();
                animal.addFirst(cat.peekFirst());
                return dog.poll();
            }
    }
    public Animal dequeue(){
        if(animal.poll() instanceof cat)
            return cat.poll();
        else return dog.poll();
    }
}

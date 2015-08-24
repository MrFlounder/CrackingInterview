package ChapterThree;


import java.util.Queue;

/**
 * Created by guangshuozang on 8/23/15.
 * I use tree queues, one for dog, one for cat, one for animal
 */
public class Exc7S1 {
    Queue cat;
    Queue dog;
    Queue animal;
    Exc7S1(){
        this.cat = new Queue();

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
    public void enqueue(Animal a){
        if(a instanceof cat )

    }
}

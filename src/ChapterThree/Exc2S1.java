package ChapterThree;

import sun.tools.tree.SynchronizedStatement;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by guangshuozang on 8/20/15.
 */
public class Exc2S1<E> extends Stack<E> {
    Stack<E> trackMin;
    public Exc2S1(){
        this.trackMin = new Stack<E>();
    }
    @Override public E push(E item) {
        if(this.trackMin.empty() ||
                Integer.parseInt(this.trackMin.peek().toString())>=Integer.parseInt(item.toString())) {
            this.trackMin.push(item);
        }
        addElement(item);
        return item;
    }
    @Override public synchronized E pop() {
        E       obj;
        int     len = size();

        obj = peek();
        removeElementAt(len - 1);
        if(Integer.parseInt(obj.toString())==Integer.parseInt(this.trackMin.peek().toString()))
            this.trackMin.pop();
        return obj;
    }
    public E getMin(){
        return this.trackMin.peek();
    }
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        Exc2S1<Integer> instance = new Exc2S1<Integer>();
        while(true){
            System.out.println("Input the int value to push to stack, input -1 if pop");
            int num = in.nextInt();
            if(num != -1) {
                instance.push(num);
                System.out.println("Here's current min item in stack: " + instance.getMin().toString());
            }else if(num == -1){
                System.out.println(instance.pop().toString());
                System.out.println("Here's current min item in stack: " + instance.getMin().toString());
            }else
                System.out.println("Input again.");
        }
    }
}

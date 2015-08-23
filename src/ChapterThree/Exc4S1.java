package ChapterThree;

import util.PrintStack;

import java.util.Stack;

/**
 * Created by guangshuozang on 8/22/15.
 */
public class Exc4S1 {
    /* moveDisks(int n, Tower origin, Tower dest, Tower buffer){
        if(n<=0) return;
        moveDisks(n-1, Tower origin, Tower buffer, Tower dest);
        moveSingle(Tower origin, Tower dest);
        moveDisks(n-1, Tower buffer, Tower dest, Tower origin)
    }
     */
    public void moveDisks(int n, Stack stackFrom, Stack stackDest, Stack stackBuffer){
        if (n<=0) return;
        moveDisks(n-1, stackFrom, stackBuffer, stackDest);
        stackDest.push(stackFrom.pop());
        moveDisks(n-1, stackBuffer, stackDest, stackFrom);
    }
    public static void main(String arg[]){
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();
        Stack stack3 = new Stack();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);
        stack1.push(6);
        stack1.push(7);
        Exc4S1 instance = new Exc4S1();
        instance.moveDisks(7,stack1,stack2,stack3);
        PrintStack opr = new PrintStack();
        opr.printStack(stack2);
    }
}

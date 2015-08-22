package ChapterThree;

import java.util.ArrayList;

/**
 * Created by guangshuozang on 8/21/15.
 */
public class Exc3Sfollowup {
    ArrayList listOfStack;
    int threshold;
    int stackCount;
    int stackPointer;
    public void push(int item){
        //if no stack or stack is full then create a new, attach it at he end of the list
        //and set current stack
        //else regular push to current stack

    }
    public int pop(){
        //if current stack is empty look at last stack
        //if still empty throw exception
        //regular pop
        return 0;
    }
    public int popAt(int stackPointer){
        //if current stack is the last then regular pop
        //else regular pop and roll back
        return 0;
    }
}

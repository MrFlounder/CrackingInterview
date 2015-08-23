package util;
import java.util.Stack;

/**
 * Created by guangshuozang on 8/22/15.
 */
public class PrintStack {


    public void printStack(Stack stack) {
        Stack temp = new Stack();
        int i = stack.size();
        while(i>0){
            temp.push(stack.pop());
            i--;
        }
        i = temp.size();
        while(i>0){
            System.out.println(temp.pop().toString());
            i--;
        }
    }
}

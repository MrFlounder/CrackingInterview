package ChapterThree;

import java.util.Stack;

/**
 * Created by guangshuozang on 8/23/15.
 */
public class Exc6S1{
    Stack org, dest;
    Exc6S1(Stack stack){
        this.org = stack;
        this.dest = new Stack();
    }
    public void sort(){
        for(int i=0; i< org.size(); i++) {
            Object temp = org.pop();
            while (Integer.parseInt(temp.toString()) < Integer.parseInt(dest.peek().toString())) {
                org.push(dest.pop());
            }
            dest.push(temp);
        }
    }
}

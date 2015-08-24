package ChapterThree;

import java.util.Stack;

/**
 * Created by guangshuozang on 8/23/15.
 */
public class Exc5S1 {
    Stack stack1, stack2;
    Exc5S1(){
        this.stack1 = new Stack();
        this.stack2 = new Stack();
    }
    void enqueue(Object item){
        //regular push to stack1
        this.stack1.push(item);
    }
    Object dequeue(){
        for(int i = 0; i< this.stack1.size();i++){
            this.stack2.push(this.stack1.pop());
        }
        Object item = this.stack2.pop();
        for(int i = 0; i< this.stack2.size(); i++ ){
            this.stack1.push(this.stack2.pop());
        }
        return item;
    }
}

package linear.util;

/**
 * Created by guangshuozang on 8/19/15.
 */
public class Stack {
    LinkedListNode top;
    Object pop(){
        if(this.top != null){
            Object item = top.getKey();
            top = top.getNext();
            return item;
        }
        return null;
    }
    void push(Object item){
        LinkedListNode newTop = new LinkedListNode(item);
        newTop.setNext(top);
        this.top = newTop;
    }
    Object peek(){
        return top.getKey();
    }
    @Override public String toString(){
        return this.top.getKey().toString();
    }
}

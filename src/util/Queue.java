package util;

/**
 * Created by guangshuozang on 8/19/15.
 */
public class Queue {
    LinkedListNode first, last;
    void enqueue(Object item){
        if(first != null){
            LinkedListNode temp;
            temp = first;
            first = new LinkedListNode(item);
            first.setNext(temp);
        }else{
            first = new LinkedListNode(item);
            last = first;
        }
    }
    Object dequeue(){
        if(last != null){
            Object item = last.getKey();
            last = null;
            return item;
        }else{
            return null;
        }
    }
}

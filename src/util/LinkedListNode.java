package util;

/**
 * Created by guangshuozang on 8/16/15.
 */
public class LinkedListNode extends Object {
    private Object key;
    private LinkedListNode next;
    public LinkedListNode(Object key){
        this.setKey(key);
    }

    void appendToTail(Object key){
        LinkedListNode end = new LinkedListNode(key);
        LinkedListNode iter = this;
        while(iter.getNext() != null)
            iter = iter.getNext();
        iter.setNext(end);
    }

    @Override public String toString(){
        return this.getKey().toString();
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }

    public Object getKey() {
        return key;
    }

    public void setKey(Object key) {
        this.key = key;
    }
}

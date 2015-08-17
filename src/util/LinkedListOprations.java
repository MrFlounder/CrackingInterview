package util;

/**
 * Created by guangshuozang on 8/16/15.
 */
public class LinkedListOprations {
    public String[] strSet = {"a","a","b","b","c","c","d","d","e","e","f","f","g","g","h","h"};
    public LinkedListNode initializeLinkedList(){
        LinkedListNode focusNode;
        LinkedListNode head = new LinkedListNode(strSet[0]);
        focusNode = head;
            for(int i = 1; i < strSet.length; i++){
                focusNode.setNext(new LinkedListNode(strSet[i]));
                focusNode = focusNode.getNext();
            }
        return head;
    }
    public void printLinkedList(LinkedListNode head){
        LinkedListNode focusNode = head;
        while(focusNode.getNext() != null){
            System.out.print(focusNode);
            System.out.print("-->");
            focusNode = focusNode.getNext();
        }
        System.out.print(focusNode);
        System.out.println();
    }
}

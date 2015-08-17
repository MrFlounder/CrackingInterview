package util;

/**
 * Created by guangshuozang on 8/16/15.
 */
public class LinkedListOprations {
    public String[] strSet1 = {"a","a","b","b","c","c","d","d","e","e","f","f","g","g","h","h"};
    public String[] strSet2 = {"1","1","2","9","3","3","4","4","5","5","6","6","7","7","8","8"};
    //public String[] strSet2 = {"1","8"};

    public LinkedListNode initializeLinkedList(){
        LinkedListNode focusNode;
        LinkedListNode head = new LinkedListNode(strSet1[0]);
        focusNode = head;
            for(int i = 1; i < strSet1.length; i++){
                focusNode.setNext(new LinkedListNode(strSet1[i]));
                focusNode = focusNode.getNext();
            }
        return head;
    }
    public LinkedListNode initializeLinkedList2(){
        LinkedListNode focusNode;
        LinkedListNode head = new LinkedListNode(strSet2[0]);
        focusNode = head;
        for(int i = 1; i < strSet2.length; i++){
            focusNode.setNext(new LinkedListNode(strSet2[i]));
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

package ChapterTwo;

import linear.util.LinkedListNode;

import java.util.Hashtable;
import java.util.Scanner;

/**
 * Created by guangshuozang on 8/16/15.
 * This solution uses our util class, so we can track who is the next of given node.
 * Time O(n), extra buffer.
 * How contain() work in hashtable???
 *
 *
 */
public class Exc1S3 {
    public LinkedListNode removeDups(LinkedListNode head){
        Hashtable table = new Hashtable();
        LinkedListNode focusNode = head;
        LinkedListNode previousNode = focusNode;
        while(focusNode!= null){
            if(table.containsKey(focusNode.getKey()))
                previousNode.setNext(focusNode.getNext());
            else {
                table.put(focusNode.getKey(), "whatever");
                previousNode = focusNode;
            }
                focusNode = focusNode.getNext();
        }
        return head;
    }
    public void printLinkedList(LinkedListNode head){
        LinkedListNode focusNode = head;
        while(focusNode != null){
            System.out.println(focusNode);
            focusNode = focusNode.getNext();
        }
    }
    public static void main(String arg[]){
        Exc1S3 instance = new Exc1S3();
        Scanner in = new Scanner(System.in);
        LinkedListNode head = null;
        LinkedListNode focusNode = head;
        System.out.println("Type in nodes to add, press enter to type in the next one, type in 'esc' to finish:");
        while(true) {
            String s = in.nextLine();
            if(s.equals("esc"))
                break;
            if(head == null) {
                head = new LinkedListNode(s);
                focusNode = head;
            }
            else {
                focusNode.setNext(new LinkedListNode(s));
                focusNode = focusNode.getNext();
            }
        }
        System.out.println("Before remove duplicates:");
        instance.printLinkedList(head);
        System.out.println("After remove duplicates:");
        instance.printLinkedList(instance.removeDups(head));

    }
}

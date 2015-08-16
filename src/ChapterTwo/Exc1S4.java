package ChapterTwo;

import util.LinkedListNode;

import java.util.Scanner;

/**
 * Created by guangshuozang on 8/16/15.
 */
public class Exc1S4 {
    public LinkedListNode removeDups(LinkedListNode head){
        LinkedListNode previous = head;
        LinkedListNode focusNode = head;
        LinkedListNode runner = null;
        while(focusNode!=null){
            runner = focusNode;
            previous = runner;
            while(runner!=null){
                if(focusNode.getKey().equals(runner.getKey())) {
                    previous.setNext(runner.getNext());
                    runner = runner.getNext();
                }else{
                    previous = runner;
                    runner = runner.getNext();
                }
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
        Exc1S4 instance = new Exc1S4();
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

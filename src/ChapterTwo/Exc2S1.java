package ChapterTwo;

import linear.util.LinkedListNode;
import linear.util.LinkedListOprations;

import java.util.Scanner;

/**
 * Created by guangshuozang on 8/16/15.
 * Get the length first and find the (length - k)th element
 */
public class Exc2S1 {

    public LinkedListNode findKthToEndElement(LinkedListNode head, int k){
        if(k>coculateLength(head))
            return null;
        LinkedListNode focusNode = head;
        for(int i = 1; i < coculateLength(head) - k; i++){
            focusNode = focusNode.getNext();
        }
        return focusNode;
    }

    public int coculateLength(LinkedListNode head){
        int  length = 0;
        LinkedListNode focusNode = head;
        while(focusNode!=null){
            focusNode = focusNode.getNext();
            length ++;
        }
        return length;
    }

    public static void main(String arg[]){
        LinkedListOprations opr = new LinkedListOprations();
        LinkedListNode head = opr.initializeLinkedList();
        Exc2S1 instance = new Exc2S1();
        Scanner in = new Scanner(System.in);
        while(true) {
            opr.printLinkedList(head);
            System.out.println("Input number k to find the kth element to the end of the linkedlist:");
            int k = in.nextInt();
            System.out.println(instance.findKthToEndElement(head, k));
        }
    }
}

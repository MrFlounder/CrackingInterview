package ChapterTwo;

import util.LinkedListNode;
import util.LinkedListOprations;

import java.util.Scanner;

/**
 * Created by guangshuozang on 8/16/15.
 * This is the iterate solution
 * Time O(n), space O(1)
 */
public class Exc2S3 {
    public LinkedListNode trackNode(LinkedListNode head, int k){
        LinkedListNode pointer1 = head;
        LinkedListNode pointer2 = head;
        int i = 0;
        while(i <= k){
            pointer1 = pointer1.getNext();
            i++;
        }
        while(pointer1 != null){
            pointer1 = pointer1.getNext();
            pointer2 = pointer2.getNext();
        }
        return pointer2;
    }
    public static void main(String arg[]){
        LinkedListOprations opr = new LinkedListOprations();
        LinkedListNode head = opr.initializeLinkedList();
        Exc2S3 instance = new Exc2S3();
        opr.printLinkedList(head);
        System.out.println("Input k:");
        while(true) {
            Scanner in = new Scanner(System.in);
            int k = in.nextInt();
            System.out.println(instance.trackNode(head, k));
        }
    }
}

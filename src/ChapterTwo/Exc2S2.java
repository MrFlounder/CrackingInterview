package ChapterTwo;

import linear.util.LinkedListNode;
import linear.util.LinkedListOprations;

import java.util.Scanner;

/**
 * Created by guangshuozang on 8/16/15.
 * Recursive solution
 * Time O(n)
 * And int wrapper can be used instead on the static int, actually it would be better.
 */
public class Exc2S2 {
    static int count = 0;
    public LinkedListNode trackNode(LinkedListNode node, int k){
        LinkedListNode returnNode = null;
    if(node.getNext() != null)
    returnNode = trackNode(node.getNext(), k);
    count++;
    if(count == k+1)
            return node;
    return returnNode;
}
    public static void main(String arg[]){
        LinkedListOprations opr = new LinkedListOprations();
        LinkedListNode head = opr.initializeLinkedList();
        Exc2S2 instance = new Exc2S2();
        opr.printLinkedList(head);
        System.out.println("Input k:");
        while(true) {
            Scanner in = new Scanner(System.in);
            int k = in.nextInt();
            System.out.println(instance.trackNode(head, k));
            count =0;
        }
    }
}

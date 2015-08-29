package ChapterTwo;

import linear.util.LinkedListNode;
import linear.util.LinkedListOprations;

/**
 * Created by guangshuozang on 8/17/15.
 * This only deal with same length input and output.
 * Actually I think I need to avoid this kind of design for recursive solutions.
 * The problem is the design has one corner case that cannot be covered by recursive.
 */
public class Exc5S1 {
    public int addLinkedListNode(LinkedListNode head1, LinkedListNode head2, LinkedListNode resultHead){
        if(head1.getNext() == null && head2.getNext() == null) {
            int temp = 0;
            int carry = (Integer.parseInt(head1.getKey().toString())
                    + Integer.parseInt(head2.getKey().toString()) + temp) / 10;
            int remain = (Integer.parseInt(head1.getKey().toString())
                    + Integer.parseInt(head2.getKey().toString()) + temp) % 10;
            resultHead.setKey(String.valueOf(remain));
            return carry;
        }else {
            resultHead.setNext(new LinkedListNode());
            int temp = (addLinkedListNode(head1.getNext(), head2.getNext(), resultHead.getNext()));
            int carry = (Integer.parseInt(head1.getKey().toString())
                    + Integer.parseInt(head2.getKey().toString()) + temp) / 10;
            int remain = (Integer.parseInt(head1.getKey().toString())
                    + Integer.parseInt(head2.getKey().toString()) + temp) % 10;
            resultHead.setKey(String.valueOf(remain));
            return carry;
        }
    }
    public static void main(String arg[]){
        LinkedListOprations opr = new LinkedListOprations();
        LinkedListNode head1 = opr.initializeLinkedList2();
        LinkedListNode head2 = opr.initializeLinkedList2();
        opr.printLinkedList(head1);
        opr.printLinkedList(head2);
        LinkedListNode resultHead = new LinkedListNode("dummy");
        Exc5S1 instance = new Exc5S1();
        instance.addLinkedListNode(head1,head2,resultHead);
        opr.printLinkedList(resultHead);
    }
}

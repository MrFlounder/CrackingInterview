package ChapterTwo;
import util.LinkedListNode;
import util.LinkedListOprations;

import java.util.Scanner;

/**
 * Created by guangshuozang on 8/16/15.
 * This can still be optimized
 */
public class Exc4S1 {
    public LinkedListNode patition(LinkedListNode head, int x){
        LinkedListNode list1Node = null;
        LinkedListNode list1Head = null;
        LinkedListNode list2Head = null;
        LinkedListNode list2Node = null;
        int flag = 0;
        while(head != null){
            if(Integer.parseInt(head.getKey().toString()) < x ){
                if(list1Node == null) {
                    list1Node = new LinkedListNode(head.getKey());
                    list1Head = list1Node;
                    flag = 1;
                }else
                list1Node.setNext(new LinkedListNode(head.getKey()));
                if(flag == 1) {
                    flag = 0;
                }else
                    list1Node = list1Node.getNext();
            }else{
                if(list2Node == null){
                    list2Node = new LinkedListNode(head.getKey());
                    list2Head = list2Node;
                    flag = 2;
                }
                else
                list2Node.setNext(new LinkedListNode(head.getKey()));
                if(flag == 2)
                    flag = 0;
                else
                list2Node = list2Node.getNext();
            }
            head = head.getNext();
        }
        if(list1Head == null)
            return list2Head;
        LinkedListNode listNode = list1Head;
        while(listNode.getNext() != null){
            listNode = listNode.getNext();
        }
        listNode.setNext(list2Head);
        return list1Head;
    }
    public static void main(String arg[]){
        Exc4S1 instance = new Exc4S1();
        Scanner in = new Scanner(System.in);
        LinkedListOprations opr = new LinkedListOprations();
        LinkedListNode head = opr.initializeLinkedList2();
        opr.printLinkedList(head);
        System.out.println("Partition around value:");
        int x = in.nextInt();
        opr.printLinkedList(instance.patition(head,x));
        System.out.println("End");
    }
}

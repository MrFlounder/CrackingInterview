package ChapterTwo;

import util.LinkedListNode;
import util.LinkedListOprations;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by guangshuozang on 8/17/15.
 * This is the solution from book, with a stack as buffer.
 * This is O(N) time. Same magnitude with recursive method. And easier to implement. Just not as much brain storm as the
 * recursive one.
 */
public class Exc7S1 {
    public Boolean isPalindrome(LinkedListNode head){
        LinkedListNode slowRunner = head;
        LinkedListNode fastRunner = head;
        Stack<LinkedListNode> buffer = new Stack<LinkedListNode>();
        while(fastRunner != null){
            buffer.push(slowRunner);
            if(fastRunner.getNext()!=null) {
                slowRunner = slowRunner.getNext();
                fastRunner = fastRunner.getNext().getNext();
            }
            else
                fastRunner = fastRunner.getNext();
            slowRunner = slowRunner.getNext();
        }
        while(slowRunner != null){
            if(slowRunner.getKey().equals(buffer.pop()))
                return false;
            slowRunner = slowRunner.getNext();
        }
        return true;
    }
    public static void main(String arg[]){
        LinkedListOprations opr = new LinkedListOprations();
        Exc7S1 instance = new Exc7S1();
        Scanner in = new Scanner(System.in);
        int length;
        while(true) {
            System.out.println("The length of palindrome LinkedList to be generated is :");
            length = in.nextInt();
            LinkedListNode head = opr.generatePalindromeWithInt(length);
            opr.printLinkedList(head);
            System.out.println("Result :");
            System.out.println(instance.isPalindrome(head));
        }
    }
}

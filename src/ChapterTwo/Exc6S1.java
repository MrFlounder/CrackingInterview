package ChapterTwo;

import linear.util.LinkedListNode;
import linear.util.LinkedListOprations;

/**
 * Created by guangshuozang on 8/17/15.
 */
public class Exc6S1 {
    public LinkedListNode getJointPoint(LinkedListNode head){
        LinkedListNode slowRunner = head;
        LinkedListNode fastRunner = head;
        do{
            slowRunner = slowRunner.getNext();
            fastRunner = fastRunner.getNext().getNext();
        }while(slowRunner!= fastRunner);
        fastRunner = head;
        do{
            slowRunner = slowRunner.getNext();
            fastRunner = fastRunner.getNext();
        }while(slowRunner!= fastRunner);
        return slowRunner;
    }
    public static void main(String arg[]){
        LinkedListOprations opr = new LinkedListOprations();
        LinkedListNode head = opr.generateLinkedListWithCircle();
        Exc6S1 instance = new Exc6S1();
        System.out.println(instance.getJointPoint(head));
    }
}

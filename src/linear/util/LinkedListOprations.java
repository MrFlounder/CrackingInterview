package linear.util;

import java.util.Random;

/**
 * Created by guangshuozang on 8/16/15.
 */
public class LinkedListOprations {
    public String[] strSet1 = {"a","a","b","b","c","c","d","d","e","e","f","f","g","g","h","h"};
    public String[] strSet2 = {"1","1","2","9","3","3","4","4","5","5","6","6","7","7","8","8"};
    //public String[] strSet2 = {"1","8"};

    public LinkedListNode generateLinkedListWithCircle(){
        LinkedListNode head = new LinkedListNode('A');
        LinkedListNode headToReturn;
        head.setNext(new LinkedListNode('B'));
        headToReturn = head;
        head = head.getNext();
        head.setNext(new LinkedListNode('C'));
        LinkedListNode joinPoint = head;
        head = head.getNext();
        head.setNext(new LinkedListNode('D'));
        head = head.getNext();
        head.setNext(new LinkedListNode('E'));
        head = head.getNext();
        head.setNext(joinPoint);
        return headToReturn;
    }

    public LinkedListNode initializedWithInt(int length){
        Random generator = new Random();
        LinkedListNode focusNode;
        LinkedListNode head = new LinkedListNode(generator.nextInt()%10);
        focusNode = head;
        for(int i = 1; i < length; i++){
            focusNode.setNext(new LinkedListNode(generator.nextInt()%10));
            focusNode = focusNode.getNext();
        }
        return head;
    }

    public LinkedListNode generatePalindromeWithInt(int length){
        Random generator = new Random();
        LinkedListNode focusNode;
        int[] intSet = new int[length];
        if(length%2 == 1) {
            for (int i = 0; i < length/2; i++){
                intSet[i] = generator.nextInt()%10;
            }
            for (int i=length/2 + 1; i<length; i++){
                intSet[i] = intSet[length-1-i];
            }
            intSet[length/2] = generator.nextInt()%10;
        }else{
            for (int i = 0; i < length/2; i++){
                intSet[i] = generator.nextInt()%10;
            }
            for (int i=length/2; i<length; i++){
                intSet[i] = intSet[length-1-i];
            }
        }
        LinkedListNode head = new LinkedListNode(intSet[0]);
        focusNode = head;
        for(int i = 1; i < length; i++){
            focusNode.setNext(new LinkedListNode(intSet[i]));
            focusNode = focusNode.getNext();
        }
        return head;
    }

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

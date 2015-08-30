package ChapterFour;

import tree.util.BST;

/**
 * Created by guangshuozang on 8/26/15.
 * To Implement a binary tree having add, remove, find, insert, 3 kinds of traversal
 * This is a demo
 */
public class AdditionalQuestion {
    public static void main(String[] args) {

       	        BST theTree = new BST();

       	        theTree.insert(50);

       	        theTree.insert(25);

       	        theTree.insert(15);

       	        theTree.insert(30);

       	        theTree.insert(75);

       	        theTree.insert(85);

       	        // Different ways to traverse binary trees

       	        // theTree.inOrderTraverseTree(theTree.root);

       	        // theTree.preorderTraverseTree(theTree.root);

       	        // theTree.postOrderTraverseTree(theTree.root);

       	        // Find the node with key 75

       	        System.out.println("\nTreeNode with the key 75");

       	        System.out.println(theTree.search(75));

       	        System.out.println("Remove Key 25");

       	        theTree.delete(25);

       	        System.out.println(theTree.search(25));

       	        theTree.inOrderTraverse(theTree.root);

       	    }

}

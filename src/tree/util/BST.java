package tree.util;

/**
 * Created by guangshuozang on 8/29/15.
 */
public class BST {
    public Node root;
    public void BST(Node root){
        this.root = root;
    }
    public void insert(int val){
        Node newNode = new Node(val);
        if(root==null) {
            root = newNode;
            return;
        }else {
            Node focusNode = root;
            if(val<=focusNode.val)
                insert(newNode,focusNode.left,focusNode,true);
            else
                insert(newNode,focusNode.right,focusNode,false);
        }


    }
    public void insert(Node newNode, Node entry, Node parent, boolean isLeft){
        if(entry==null)
            if(isLeft)
                parent.left = newNode;
            else
                parent.right = newNode;
        else if(newNode.val<=entry.val)
            insert(newNode,entry.left,entry,true);
        else
            insert(newNode,entry.right,entry,false);

    }
    public Node search(int val){
        Node focusNode = root;
        if(focusNode==null)
            return null;
        else if(val<focusNode.val)
            return search(val,focusNode.left);
        else if(val>focusNode.val)
            return search(val,focusNode.right);
        else
            return focusNode;
    }
    public Node search(int val, Node entry){
        if(entry==null)
            return null;
        else if(val<entry.val)
            return search(val, entry.left);
        else if(val>entry.val)
            return search(val, entry.right);
        else
            return entry;
    }
    public void inOrderTraverse(Node entry){
        if(entry!=null) {
            inOrderTraverse(entry.left);
            System.out.println(entry.val);
            inOrderTraverse(entry.right);
        }
    }
    public void preOrderTraverse(Node entry){
        if(entry!=null) {
            System.out.println(entry.val);
            inOrderTraverse(entry.left);
            inOrderTraverse(entry.right);
        }
    }
    public void postOrderTraverse(Node entry){
        if(entry!=null) {
            inOrderTraverse(entry.left);
            inOrderTraverse(entry.right);
            System.out.println(entry.val);
        }
    }
    public boolean delete(int val){
        Node focusNode = root;
        Node parent = root;
        boolean isLeftChild = true;
        if(focusNode == null)
            return false;
        while(focusNode.val != val){
            parent = focusNode;
            if(val < focusNode.val){
                isLeftChild = true;
                focusNode = focusNode.left;
            }else{
                isLeftChild = false;
                focusNode = focusNode.right;
            }
            if(focusNode == null)
                return false;
        }
        if(focusNode.left == null && focusNode.right == null){
            if(focusNode == root)
                root = null;
            else if(isLeftChild)
                parent.left = null;
            else
                parent.right = null;
        }else if(focusNode.left == null){
            if(focusNode == root)
                root = focusNode.right;
            else if(isLeftChild)
                parent.left = focusNode.right;
            else
                parent.right = focusNode.right;
        }else if(focusNode.right == null){
            if(focusNode == root)
                root = focusNode.left;
            else if(isLeftChild)
                parent.left = focusNode.left;
            else
                parent.right = focusNode.left;
        }else{
            Node replacement = findReplacementNode(focusNode);
            if(focusNode == root)
                root = replacement;
            else if(isLeftChild)
                parent.left = replacement;
            else
                parent.right = replacement;
            replacement.left = focusNode.left;
        }
        return true;

    }
    public Node findReplacementNode(Node replacedNode){
        Node replacement = replacedNode;
        Node parent = replacedNode;
        Node focusNode = replacedNode.right;
        while(focusNode != null){
            parent = replacement;
            replacement = focusNode;
            focusNode = focusNode.left;
        }
        if(replacement != replacedNode.right){
            parent.left = replacement.right;
            replacement.right = replacedNode.right;
        }
        return replacement;
    }

    class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
        public Node(){
        }
        @Override public String toString(){
            return Integer.toString(this.val);
        }
    }
}

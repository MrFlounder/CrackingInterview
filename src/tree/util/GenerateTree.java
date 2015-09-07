package tree.util;

/**
 * Created by guangshuozang on 9/7/15.
 */
public class GenerateTree {
    public TreeNode generateBalancedTree(){
        BST ins = new BST();
        ins.insert(50);
        ins.insert(25);
        ins.insert(75);
        ins.insert(15);
        ins.insert(35);
        ins.insert(10);
        ins.insert(65);
        ins.insert(90);
        ins.inOrderTraverse(ins.root);
        return ins.root;
    }
    public TreeNode generateNotBTree(){
        BST ins = new BST();
        ins.insert(50);
        ins.insert(25);
        ins.insert(75);
        ins.insert(15);
        ins.insert(35);
        ins.insert(10);
        ins.insert(65);
        ins.inOrderTraverse(ins.root);
        return  ins.root;
    }
}

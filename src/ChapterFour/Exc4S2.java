package ChapterFour;

import tree.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by guangshuozang on 9/8/15.
 * DFS
 */
public class Exc4S2 {
    public void createLevelLinkedList(TreeNode root, ArrayList<LinkedList<TreeNode>> lists, int level){
        if(root == null) return;
        LinkedList<TreeNode> list = null;
        if(lists.size()==level){
            list = new LinkedList<TreeNode>();
            lists.add(list);
        }else{
            list=lists.get(level);
        }
        list.add(root);
        createLevelLinkedList(root.left,lists,level+1);
        createLevelLinkedList(root.right,lists,level+1);
    }
}

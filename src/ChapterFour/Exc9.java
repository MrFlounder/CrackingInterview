package ChapterFour;

import tree.util.TreeNode;

/**
 * Created by guangshuozang on 9/8/15.
 */
public class Exc9 {
    public void findSum(TreeNode node, int sum, int[] path, int level){
        if(node == null)
            return;
        path[level]=node.val;
        int t = 0;
        for(int i = level; i>=0;i--){
            t = t+path[i];
            if(t==sum)
                print(path,i,level);
        }
        findSum(node.left,sum,path,level+1);
        findSum(node.right,sum,path,level+1);
    }
    public void findSum(TreeNode node, int sum){
        int depth = depth(node);
        int[] path = new int[depth];
        findSum(node,sum,path,0);
    }
    public int depth(TreeNode node){
        if(node==null){
            return 0;
        }
        else return 1+Math.max(depth(node.left),depth(node.right));
    }
    public static void print(int[] path, int start, int end){

    }
}

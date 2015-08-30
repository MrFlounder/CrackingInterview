package tree.util;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int val){
        this.val = val;
    }
    public TreeNode(){
    }
    @Override public String toString(){
        return Integer.toString(this.val);
    }
}

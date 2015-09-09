package ChapterFour;

import tree.util.TreeNode;

/**
 * Created by guangshuozang on 9/8/15.
 */
public class Exc5S2 {
    boolean checkBST(TreeNode n){
        return checkBST(n,null,null);
    }
    boolean checkBST(TreeNode n, Integer min, Integer max){
        if(n==null)
            return true;
        if((min !=null && n.val <= min)||(max!=null&&n.val>max)){
            return false;
        }
        if(!checkBST(n.left,min,n.val)||!checkBST(n.right,n.val,max)){
            return false;
        }
        return true;
    }
}

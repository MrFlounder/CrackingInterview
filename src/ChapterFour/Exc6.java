package ChapterFour;

import tree.util.TreeNode;

/**
 * Created by guangshuozang on 9/8/15.
 */
public class Exc6 {
    public TreeNode inorderSecc(TreeNode n){
        if(n==null)
            return null;
        if(n.right!=null){
            TreeNode focus = n;
            while(focus.left!=null){
                focus = focus.left;
            }
            return focus;
        }else{
            TreeNode focus = n;
            TreeNode parent = focus.parent;
            while(parent!=null&&parent.left!=focus){
                focus = parent;
                parent = parent.parent;
            }
            return parent;
        }
    }
}

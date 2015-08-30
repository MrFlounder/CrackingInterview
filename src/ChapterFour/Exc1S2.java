package ChapterFour;

import tree.util.TreeNode;

/**
 * Created by guangshuozang on 8/30/15.
 * Time O(N) Space O(H)
 */
public class Exc1S2 {
    public int getHeight(TreeNode entry){
        if(entry == null)
            return 0;
        int leftH=getHeight(entry.left);
        int rightH=getHeight(entry.right);
        if(leftH==-1)
            return -1;
        else if(rightH==-1)
            return -1;
        else if(leftH-rightH>1)
            return -1;
        else
            return Math.max(leftH,rightH)+1;
    }
    public boolean isBalanced(TreeNode entry){
        if(getHeight(entry)==-1)
            return false;
        else
            return true;

    }
}

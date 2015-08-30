package ChapterFour;
import tree.util.*;

/**
 * Created by guangshuozang on 8/30/15.
 * This is recursive solution
 * Time O(N*logN)????????????????
 *
 */
public class Exc1S1 {
    public int getHeight(TreeNode entry){
        if(entry == null)
            return 0;
        return Math.max(getHeight(entry.left),getHeight(entry.right))+1;
    }
    public boolean isBalanced(TreeNode entry){
        if(entry == null)
            return true;
        if(Math.abs(getHeight(entry.left)-getHeight(entry.right))>1)
            return false;
        else
            return isBalanced(entry.left)&&isBalanced(entry.right);

    }
}

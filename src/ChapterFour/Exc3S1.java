package ChapterFour;

import tree.util.TreeNode;

/**
 * Created by guangshuozang on 9/7/15.
 */
public class Exc3S1 {
    public TreeNode createMinimalBST(int arr[], int start, int end){
        if(end < start)
            return null;
        int mid = (start + end)/2;
        TreeNode n = new TreeNode(arr[mid]);
        n.left = createMinimalBST(arr,start,mid-1);
        n.right = createMinimalBST(arr,mid+1,end);
        return n;
    }
    public TreeNode createMinimalBST(int array[]){
        return createMinimalBST(array,0,array.length -1);
    }
}

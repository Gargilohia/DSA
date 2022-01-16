/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidBSTUtil(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    public boolean isValidBSTUtil(TreeNode root, long min, long max){
        if(root == null){
            return true;
        }
        else if( root.val >= max || root.val <= min){
            return false;
        }else{
        return isValidBSTUtil(root.left, min, root.val) && isValidBSTUtil(root.right, root.val, max);  
    }
}
        
    
}
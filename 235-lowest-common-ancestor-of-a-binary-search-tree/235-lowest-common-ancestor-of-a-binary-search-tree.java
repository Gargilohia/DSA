/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return ((q.val<p.val )?  LCA(root,q,p): LCA(root,p,q));
    }
    public TreeNode LCA(TreeNode root, TreeNode p, TreeNode q) {
        while(!(p.val<=root.val && root.val<= q.val) ){
            root=(root.val > q.val)?root.left:root.right;
        }
        return root;
    } 
}

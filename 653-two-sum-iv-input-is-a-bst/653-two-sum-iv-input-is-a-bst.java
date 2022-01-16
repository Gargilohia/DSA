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
    HashSet<Integer> hs = new HashSet();
    public boolean findTarget(TreeNode root, int k) {
        inorder(root);
        for(int i : hs){
            if(hs.contains(k-i) && i != k-i){return true;}
        }
        return false;
    }
    public void inorder(TreeNode node){
        if(node == null){
            return;
        }
        inorder(node.left);
        hs.add(node.val);
        inorder(node.right);
        return;
    }
}
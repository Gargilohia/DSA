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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levelorder = new ArrayList<List<Integer>>();
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        Stack<TreeNode> s2 = new Stack<TreeNode>();
        
        if(root==null)
            return levelorder;
        s1.add(root);
        
        while(!s1.isEmpty()){
            List<Integer> level = new ArrayList<Integer>();
            while(!s1.isEmpty())
                s2.add(s1.pop());
            while(!s2.isEmpty()){
                TreeNode node = s2.pop();
                if(node.left!=null)
                    s1.push(node.left);
                if(node.right!=null)
                    s1.push(node.right);
                level.add(node.val);
            }
            levelorder.add(level);
        }
        return levelorder;
    }
}
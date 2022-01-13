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
    public List<Integer> preorderTraversal(TreeNode root) {
        LinkedList<TreeNode> list = new LinkedList<TreeNode>();
        List<Integer> stack = new Stack<Integer>();
        
        if(root==null)
            return stack;
        
        TreeNode current = root;
        
        list.add(current);
        
        while(!list.isEmpty()){
            current = list.pollLast();
            
            stack.add(current.val);
            
            if(current.right!=null)
                list.add(current.right);
            if(current.left!=null)
                list.add(current.left);
        }
        return stack;
        
        
    }
}